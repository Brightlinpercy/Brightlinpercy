package com.greenworld.EcomBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Seller 
{
public int getSellerid() {
		return sellerid;
	}

	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSellercity() {
		return sellercity;
	}

	public void setSellercity(String sellercity) {
		this.sellercity = sellercity;
	}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int sellerid;

@Column(nullable=false)
private String sellername;

@Column(nullable=false)
private String sellercity;
}
