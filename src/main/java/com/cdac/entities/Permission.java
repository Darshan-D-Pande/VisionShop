package com.cdac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permission {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Perm_id;
	private String Perm_name;
	private String Perm_module;
	private int Perm_role_id;
	
	public Permission(int perm_id, String perm_name, String perm_module, int perm_role_id) {
		super();
		Perm_id = perm_id;
		Perm_name = perm_name;
		Perm_module = perm_module;
		Perm_role_id = perm_role_id;
	}

	public Permission(String perm_name, String perm_module, int perm_role_id) {
		super();
		Perm_name = perm_name;
		Perm_module = perm_module;
		Perm_role_id = perm_role_id;
	}

	public int getPerm_id() {
		return Perm_id;
	}

	public void setPerm_id(int perm_id) {
		Perm_id = perm_id;
	}

	public String getPerm_name() {
		return Perm_name;
	}

	public void setPerm_name(String perm_name) {
		Perm_name = perm_name;
	}

	public String getPerm_module() {
		return Perm_module;
	}

	public void setPerm_module(String perm_module) {
		Perm_module = perm_module;
	}

	public int getPerm_role_id() {
		return Perm_role_id;
	}

	public void setPerm_role_id(int perm_role_id) {
		Perm_role_id = perm_role_id;
	}

	@Override
	public String toString() {
		return "Permission [Perm_id=" + Perm_id + ", Perm_name=" + Perm_name + ", Perm_module=" + Perm_module
				+ ", Perm_role_id=" + Perm_role_id + "]";
	}
	
	
}




