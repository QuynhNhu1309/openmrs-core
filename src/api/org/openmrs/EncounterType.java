package org.openmrs;

import java.util.Date;

/**
 * EncounterType 
 */
public class EncounterType implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer encounterTypeId;
	private String name;
	private String description;
	private Date dateCreated;
	private User creator;

	// Constructors

	/** default constructor */
	public EncounterType() {
	}

	/** constructor with id */
	public EncounterType(Integer encounterTypeId) {
		this.encounterTypeId = encounterTypeId;
	}

	// Property accessors

	/**
	 * 
	 */
	public Integer getEncounterTypeId() {
		return this.encounterTypeId;
	}

	public void setEncounterTypeId(Integer encounterTypeId) {
		this.encounterTypeId = encounterTypeId;
	}

	/**
	 * 
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * 
	 */
	public User getCreator() {
		return this.creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

}