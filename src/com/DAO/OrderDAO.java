package com.DAO;

import java.util.List;

import com.pojo.Order;

public interface OrderDAO {
	public List<Order> showOrderbySession(int userid, int sessionid);
	public List<Order> showOrderbyUser(int userid);
	public List<Order> showAllOrders();

}
