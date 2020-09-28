package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

public class Reward {
	
	String customerName;
	Integer totalRewardPoints = 0;
	Map<String, Integer> allRewards = new HashMap<>();
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setReward(String rewardMonth, Integer rewardPoints) {
		if(allRewards.get(rewardMonth)==null) allRewards.put(rewardMonth, rewardPoints);
		else allRewards.put(rewardMonth, allRewards.get(rewardMonth)+rewardPoints);
	}
	public Integer getReward(String rewardMonth) {
		return allRewards.get(rewardMonth);
	}
	public Map<String, Integer> getAllRewards() {
		return allRewards;
	}
	
	public Integer getTotalRewardPoints() {
		return totalRewardPoints;
	}
	public void setTotalRewardPoints(Integer rewardPoints) {
		this.totalRewardPoints += rewardPoints;
	}
	
}
