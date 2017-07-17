package com.pojo;

public class Topping {

	private int toppingid,toppingprice;
	private String toppiingname;
	
	public Topping() {
		// TODO Auto-generated constructor stub

		this.toppingprice = 0;
		this.toppiingname = "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toppiingname == null) ? 0 : toppiingname.hashCode());
		result = prime * result + toppingid;
		result = prime * result + toppingprice;
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
		Topping other = (Topping) obj;
		if (toppiingname == null) {
			if (other.toppiingname != null)
				return false;
		} else if (!toppiingname.equals(other.toppiingname))
			return false;
		if (toppingid != other.toppingid)
			return false;
		if (toppingprice != other.toppingprice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Topping [toppingid=" + toppingid + ", toppingprice=" + toppingprice + ", toppiingname=" + toppiingname
				+ "]";
	}

	public Topping(int toppingid, int toppingprice, String toppiingname) {
		super();
		this.toppingprice = toppingprice;
		this.toppiingname = toppiingname;
	}

	public int getToppingid() {
		return toppingid;
	}

	public void setToppingid(int toppingid) {
		this.toppingid = toppingid;
	}

	public int getToppingprice() {
		return toppingprice;
	}

	public void setToppingprice(int toppingprice) {
		this.toppingprice = toppingprice;
	}

	public String getToppiingname() {
		return toppiingname;
	}

	public void setToppiingname(String toppiingname) {
		this.toppiingname = toppiingname;
	}
}
