package com.cg.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userRole")
public class UserRole {
	
	@Id
	private String userName;
	private String password;
	private String roleCode;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "claimNumber")
	Claim claim;
	
	public UserRole(String password, String roleCode, Claim claim) {
		super();
		this.password = password;
		this.roleCode = roleCode;
		this.claim = claim;
	}

}
