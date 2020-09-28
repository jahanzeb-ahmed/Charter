package com.example.demo.repository;

import java.util.List;

import com.example.demo.domain.Reward;

public interface RewardRepository {

	public List<Reward> getRewardsOfAllCustomers();
}
