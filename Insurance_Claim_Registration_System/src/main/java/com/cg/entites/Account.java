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
public class Account {
	@Id
	private long accNo;
	private String insuredName;
	private String userName;
	
	public Account(String insuredName, String userName) {
		super();
		this.insuredName = insuredName;
		this.userName = userName;
	}	

}
