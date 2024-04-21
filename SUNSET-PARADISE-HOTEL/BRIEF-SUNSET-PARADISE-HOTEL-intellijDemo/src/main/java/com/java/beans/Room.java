package com.java.beans;

public class Room {
	
	private Integer roomId;
	private String roomType;
	private Integer roomPrice;
	private Integer roomCapacity;
	private Boolean roomAvailability;
	private String roomPicture;
	private String equipement;
	
//	public Room(Integer roomId, String roomType, Integer roomPrice, Integer roomCapacity, String roomAmenities,
//			Boolean roomAvailability, String roomPicture) {
//		super();
//		this.roomId = roomId;
//		this.roomType = roomType;
//		this.roomPrice = roomPrice;
//		this.roomCapacity = roomCapacity;
//
//		this.roomAvailability = roomAvailability;
//		this.roomPicture = roomPicture;
//	}

	public Room(Integer roomId, String type, Integer price, Integer capacity, String equipement, Boolean availability, String picture) {
		this.roomId = roomId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Integer getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Integer roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Integer getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}





	public Boolean getRoomAvailability() {
		return roomAvailability;
	}

	public void setRoomAvailability(Boolean roomAvailability) {
		this.roomAvailability = roomAvailability;
	}

	public String getRoomPicture() {
		return roomPicture;
	}

	public void setRoomPicture(String roomPicture) {
		this.roomPicture = roomPicture;
	}

	public String getEquipement() {
		return equipement;
	}

	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}
}
