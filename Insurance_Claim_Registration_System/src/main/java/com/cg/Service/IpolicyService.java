package com.cg.Service;

import java.util.List;

import com.cg.entites.Policy;
import com.cg.entites.PolicyDetails;

public interface IpolicyService {

	List<Policy> getPolicyList();

	boolean isPolicyNumber(long policyNumber);

	int insertPolicyDetails(PolicyDetails details);

	List<PolicyDetails> getPolicyDetails(long policyNumber);

	List<Policy> viewPolicies(long accountNumber);

}
