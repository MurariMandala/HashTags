package com.springboot.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HashtagsDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	private String HashTag;
	private String count;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHashTag() {
		return HashTag;
	}
	public void setHashTag(String hashTag) {
		HashTag = hashTag;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

}
