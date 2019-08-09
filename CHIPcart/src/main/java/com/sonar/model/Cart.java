package com.sonar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr" ,name="carttable")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	private int customerId;
	private int productId;
	private int quantity;
	private String productName;
	private int productprice;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public Cart(int cartId, int customerId, int productId, int quantity, String productName, int productprice) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.productName = productName;
		this.productprice = productprice;
	}
	public Cart() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		result = prime * result + customerId;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productprice;
		result = prime * result + quantity;
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
		Cart other = (Cart) obj;
		if (cartId != other.cartId)
			return false;
		if (customerId != other.customerId)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productprice != other.productprice)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customerId=" + customerId + ", productId=" + productId + ", quantity="
				+ quantity + ", productName=" + productName + ", productPrice=" + productprice + "]";
	}
	
	
	

}
