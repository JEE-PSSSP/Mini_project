package com.cg.entites;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long policyNumber;
	private long acountNumber;
	private int policyPremium;
	
	@OneToOne
	@JoinColumn(name="policyNumber")
	PolicyDetails PolicyDetails;

	public Policy(long acountNumber, int policyPremium) {
		super();
		this.acountNumber = acountNumber;
		this.policyPremium = policyPremium;

		
	}
	
}
