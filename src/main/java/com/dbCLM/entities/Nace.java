package com.dbCLM.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Naces")
public class Nace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long level;
	private char code;
	private String parent;
	private String description;
	@Column(name="This_item_includes")
	private String thisItemIncludes;
	@Column(name="This_item_also_includes")
	private String thisItemAlsoIncludes;
	private String rulings;
	@Column(name="This_item_excludes")
	private String thisItemExcludes;
	@Column(name="Reference_to_ISIC_Rev.4")
	private String referenceToISIC;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		level = level;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		code = code;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		parent = parent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}

	public String getThisItemIncludes() {
		return thisItemIncludes;
	}

	public void setThisItemIncludes(String thisItemIncludes) {
		thisItemIncludes = thisItemIncludes;
	}

	public String getThisItemAlsoIncludes() {
		return thisItemAlsoIncludes;
	}

	public void setThisItemAlsoIncludes(String thisItemAlsoIncludes) {
		thisItemAlsoIncludes = thisItemAlsoIncludes;
	}

	public String getRulings() {
		return rulings;
	}

	public void setRulings(String rulings) {
		rulings = rulings;
	}

	public String getThisItemExcludes() {
		return thisItemExcludes;
	}

	public void setThisItemExcludes(String thisItemExcludes) {
		thisItemExcludes = thisItemExcludes;
	}

	public String getReferenceToISIC() {
		return referenceToISIC;
	}

	public void setReferenceToISIC(String referenceToISIC) {
		referenceToISIC = referenceToISIC;
	}
	
	
	
}
