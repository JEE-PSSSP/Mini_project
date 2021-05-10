package com.cg.Dao;

import java.util.List;

import com.cg.entites.Claim;

public interface IClaimDao {
	Claim getClaim(long claimNumber);
	List<Claim> getAllClaims();
//	void addClaim(Claim claim);
//	void removeClaim(Claim claim);
//	void updateClaim(Claim claim);
	void beginTransaction();
	void commitTransaction();
	 
	

}
