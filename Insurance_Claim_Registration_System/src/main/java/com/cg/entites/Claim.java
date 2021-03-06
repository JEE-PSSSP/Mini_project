package com.cg.entites;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="claim")
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long claimNumber;
	private String claimReason;
	private String accidentLocationStreet;
	private String accidentCity;
	private String accidentState;
	private int accidentPin;
	private String claimType;
	private long policyNumber;
	
	@OneToMany(mappedBy = "claim",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<UserRole>userrole = new ArrayList<UserRole>();
		
	public Claim(String claimReason, String accidentLocationStreet, String accidentCity, String accidentState,
			int accidentPin, String claimType, long policyNumber,List<UserRole>userrole) {
		super();
		this.claimReason = claimReason;
		this.accidentLocationStreet = accidentLocationStreet;
		this.accidentCity = accidentCity;
		this.accidentState = accidentState;
		this.accidentPin = accidentPin;
		this.claimType = claimType;
		this.policyNumber = policyNumber;
		this.userrole = userrole;
	}	

}
