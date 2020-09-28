package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Reward;
import com.example.demo.repository.RewardRepository;
import com.example.demo.service.RewardService;

@Service
public class RewardServiceImpl implements RewardService {
	
	@Autowired
	RewardRepository rewardRepository;
	
	@Override
	public List<Reward> getRewardsOfAllCustomers() {
		return rewardRepository.getRewardsOfAllCustomers();
	}
}
