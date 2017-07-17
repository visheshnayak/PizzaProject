package com.DAO;

import java.util.List;

import com.pojo.Order;

public interface OrderDAO {
	public List<Order> showOrder(int userid, int sessionid);
	public List<Order> showAllOrders();

}
