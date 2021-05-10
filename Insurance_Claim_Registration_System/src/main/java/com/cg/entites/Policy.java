package com.cg.entites;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyNumber;
	private long acountNumber;
	private double policyPremium;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<UserRole>userrole = new ArrayList<UserRole>();

	public Policy(long acountNumber, double policyPremium,List<UserRole>userrole) {
		super();
		this.acountNumber = acountNumber;
		this.policyPremium = policyPremium;
		this.userrole = userrole;
		
	}
	
}
