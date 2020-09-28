package com.example.demo.repositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Reward;
import com.example.demo.domain.Transaction;
import com.example.demo.repository.RewardRepository;

@Repository
public class RewardRepositoryImpl implements RewardRepository {

	List<Transaction> transactions = Arrays.asList(
			new Transaction(1,"Jahanzeb Ahmed",120,"January"),
			new Transaction(1,"Jahanzeb Ahmed",100,"February"),
			new Transaction(2,"Jahanzeb Ahmed",20,"March"),
			new Transaction(4,"Jeff Bezos",49,"January"),
			new Transaction(4,"Jeff Bezos",50,"January"),
			new Transaction(5,"Jeff Bezos",99,"February"),
			new Transaction(6,"Jeff Bezos",100,"March"),
			new Transaction(7,"Bill Gates",49,"January"),
			new Transaction(8,"Bill Gates",50,"January"),
			new Transaction(8,"Bill Gates",51,"February"),
			new Transaction(9,"Bill Gates",99,"February"),
			new Transaction(8,"Bill Gates",100,"March"),
			new Transaction(9,"Bill Gates",101,"March")
	);
	
	
	@Override
	public List<Reward> getRewardsOfAllCustomers() {
		
		List<Reward> rewards = new ArrayList<>();
		
		outerloop:
		for(Transaction transaction : transactions) {
			for(Reward reward : rewards) {
				if(reward.getCustomerName().equals(transaction.getCustomerName())) {
					int rewardPoints = calculateRewardPoints( transaction.getTransactionAmount() );
					reward.setReward(transaction.getTransactionMonth(), rewardPoints);
					reward.setTotalRewardPoints(rewardPoints);
					continue outerloop;
				}
			}
			Reward reward = new Reward();
			reward.setCustomerName(transaction.getCustomerName());
			int rewardPoints = calculateRewardPoints( transaction.getTransactionAmount() );
			reward.setReward(transaction.getTransactionMonth(), rewardPoints);
			reward.setTotalRewardPoints(rewardPoints);
			rewards.add(reward);
		}
		
		return rewards;
	}
	
	
	private int calculateRewardPoints(int amount) {
		if(amount<=50) return 0;
		if(amount<=100) return amount-50;
		else return (amount-100)*2 + 50;
	}
	
}
