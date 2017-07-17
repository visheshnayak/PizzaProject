package com.pojo;

public class Order {

	private int totalprice,orderid,userid,sessionid,pizzaid;
	private String extraToppings;
	
	public Order() {
		// TODO Auto-generated constructor stub
		this.totalprice = 0;
		this.userid = 0;
		this.sessionid = 0;
		this.extraToppings = "";
	}

	public int getPizzaid() {
		return pizzaid;
	}

	public void setPizzaid(int pizzaid) {
		this.pizzaid = pizzaid;
	}

	@Override
	public String toString() {
		return "Order [totalprice=" + totalprice + ", orderid=" + orderid + ", userid=" + userid + ", sessionid="
				+ sessionid + ", extraToppings=" + extraToppings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extraToppings == null) ? 0 : extraToppings.hashCode());
		result = prime * result + orderid;
		result = prime * result + sessionid;
		result = prime * result + totalprice;
		result = prime * result + userid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (extraToppings == null) {
			if (other.extraToppings != null)
				return false;
		} else if (!extraToppings.equals(other.extraToppings))
			return false;
		if (orderid != other.orderid)
			return false;
		if (sessionid != other.sessionid)
			return false;
		if (totalprice != other.totalprice)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}

	public Order(int totalprice, int userid, int sessionid, String extraToppings) {
		super();
		this.totalprice = totalprice;
		this.userid = userid;
		this.sessionid = sessionid;
		this.extraToppings = extraToppings;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getSessionid() {
		return sessionid;
	}

	public void setSessionid(int sessionid) {
		this.sessionid = sessionid;
	}

	public String getExtraToppings() {
		return extraToppings;
	}

	public void setExtraToppings(String extraToppings) {
		this.extraToppings = extraToppings;
	}
}
