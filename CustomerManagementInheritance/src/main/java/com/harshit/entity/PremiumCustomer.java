package com.harshit.entity;

public class PremiumCustomer extends Customer {
	private int rewardPoints;

	public PremiumCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PremiumCustomer(int customerId, String customerName, String customerAddress, double billAmount) {
		super(customerId, customerName, customerAddress, billAmount);
		// TODO Auto-generated constructor stub
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	


}
