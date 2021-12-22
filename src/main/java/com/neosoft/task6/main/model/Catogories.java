package com.neosoft.task6.main.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Catogories
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String rating;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<SubCategories> subCategories;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	

	public List<SubCategories> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategories> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Catogories [cId=" + cId + ", cName=" + cName + ", rating=" + rating + ", subCategories=" + subCategories
				+ "]";
	}

	
	
	
}
