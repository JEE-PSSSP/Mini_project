package com.cg.Dao;

import java.util.List;

import com.cg.entites.Policy;

public interface IPolicyDao {
	Policy getPOlicy(long policyNumber);
	List<Policy> getAllPolicys();
	void beginTranscation();
	void commitTranscation();
	
}
