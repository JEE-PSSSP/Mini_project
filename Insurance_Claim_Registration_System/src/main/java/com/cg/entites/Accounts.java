package com.cg.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Accounts {
	@Id
	private long accNo;
	private String insName;
	private String userName;
	
	public Accounts(String insName, String userName) {
		super();
		this.insName = insName;
		this.userName = userName;
	}	

}
