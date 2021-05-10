package com.cg.Dao;

import java.util.List;

import com.cg.entites.PolicyDetails;

public interface IPolicyDetailsDao {
	PolicyDetails getPolicyDetails(long policyNumber);
	List<PolicyDetails> getAllPolicyDetails();
	void beginTranscation();
	void commitTranscation();

}
