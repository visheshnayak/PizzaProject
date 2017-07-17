package com.pojo;

public class Pizza {

	private int pizzaid,baseprice;
	private String pizzaname,ingredients,crust,type;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
		this.baseprice = 0;
		this.pizzaname = "";
		this.ingredients = "";
		this.crust = "";
		this.type = "";
		
	}

	public Pizza(int id, int baseprice, String name, String ingredients, String crust, String type) {
		this.baseprice = baseprice;
		this.pizzaname = name;
		this.ingredients = ingredients;
		this.crust = crust;
		this.type = type;
	}

	public int getId() {
		return pizzaid;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + pizzaid + ", baseprice=" + baseprice + ", name=" + pizzaname + ", ingredients=" + ingredients
				+ ", crust=" + crust + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baseprice;
		result = prime * result + ((crust == null) ? 0 : crust.hashCode());
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((pizzaname == null) ? 0 : pizzaname.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Pizza other = (Pizza) obj;
		if (baseprice != other.baseprice)
			return false;
		if (crust == null) {
			if (other.crust != null)
				return false;
		} else if (!crust.equals(other.crust))
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (pizzaname == null) {
			if (other.pizzaname != null)
				return false;
		} else if (!pizzaname.equals(other.pizzaname))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public int getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}

	public String getName() {
		return pizzaname;
	}

	public void setName(String name) {
		this.pizzaname = name;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
