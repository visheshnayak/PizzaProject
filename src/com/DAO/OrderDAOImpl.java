package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.pojo.Order;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public List<Order> showOrderbySession(int userid, int sessionid) {
		// TODO Auto-generated method stub
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM orders WHERE userid=? & sessionid=?";
		List<Order> res = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ps.setInt(1, userid);
			ps.setInt(2, sessionid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Order order = new Order();
				order.setOrderid(rs.getInt(1));
				order.setUserid(rs.getInt(2));
				order.setPizzaid(rs.getInt(3));
				order.setTotalprice(rs.getInt(4));
				order.setSessionid(rs.getInt(5));
				order.setExtraToppings(rs.getString(6));
				
				res.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Order> showAllOrders() {
		// TODO Auto-generated method stub
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM orders";
		List<Order> res = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Order order = new Order();
			
				order.setOrderid(rs.getInt(1));
				order.setUserid(rs.getInt(2));
				order.setPizzaid(rs.getInt(3));
				order.setTotalprice(rs.getInt(4));
				order.setSessionid(rs.getInt(5));
				order.setExtraToppings(rs.getString(6));
				
				res.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Order> showOrderbyUser(int userid) {
		// TODO Auto-generated method stub
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM orders WHERE userid=?";
		List<Order> res = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ps.setInt(1, userid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Order order = new Order();
				order.setOrderid(rs.getInt(1));
				order.setUserid(rs.getInt(2));
				order.setPizzaid(rs.getInt(3));
				order.setTotalprice(rs.getInt(4));
				order.setSessionid(rs.getInt(5));
				order.setExtraToppings(rs.getString(6));
				
				res.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
