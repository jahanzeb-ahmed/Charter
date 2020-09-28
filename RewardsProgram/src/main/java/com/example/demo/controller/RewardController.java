package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Reward;
import com.example.demo.service.RewardService;

@RestController
public class RewardController {
	
	@Autowired
	RewardService rewardService;
	
	@GetMapping({"/","/rewards"})
	public List<Reward> getRewardsOfAllCustomers() {
		return rewardService.getRewardsOfAllCustomers();
	}

}
