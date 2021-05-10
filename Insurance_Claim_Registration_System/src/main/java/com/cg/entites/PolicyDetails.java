package com.cg.entites;



import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	Policy policy;
	
	
	public PolicyDetails(int questionId, String answer) {
		super();
		this.questionId = questionId;
		this.answer = answer;
		
	}
	
}
