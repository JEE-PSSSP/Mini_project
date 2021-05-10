package com.cg.Service;

import java.util.List;

import com.cg.entites.Claim;
import com.cg.entites.ClaimsQuestions;

public interface IClaimService {

	List<ClaimsQuestions> getAllClaimQuestions(long policyNumber);

	long insertClaimDetails(Claim claim);

	List<Claim> getAllClaims();

	List<Claim> getAllclaimReport();

	public Claim getClaimDetails(long policyNumber);

	String getClaimQuestions(int questionId);

}
