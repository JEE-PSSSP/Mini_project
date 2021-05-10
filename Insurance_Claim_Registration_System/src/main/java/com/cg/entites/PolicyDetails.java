package com.cg.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="policydetails")
public class PolicyDetails{

	@Id
	private long policyNumber;
	private int questionId;
	private String answer;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<Policy>policy =new ArrayList<Policy>();
	
	public PolicyDetails(int questionId, String answer, List<Policy> policy) {
		super();
		this.questionId = questionId;
		this.answer = answer;
		this.policy = policy;
	}
	
}
