package com.java.apartment.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apartmentUsers")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_address")
	private String userAddress;
	
	@Column(name = "user_contact")
	private String userContact;
	
	@Column(name = "mail_id")
	private String mailId;
	
	@Column(name = "pan_card")
	private String panCard;
	
	@Column(name = "user_status")
	private String userStatus;
	
	public UserEntity() {
		
	}

	public UserEntity(String userName, String userAddress, String userContact, String mailId, String panCard,
			String userStatus) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.mailId = mailId;
		this.panCard = panCard;
		this.userStatus = userStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	}
