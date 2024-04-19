package modal;

public class Rooms {
	 private int id_room;
	    private String type;
	    private Double price;
	    private String equipement;
	    private Boolean availability;

	    public Rooms() {
	    }

	    public Rooms(int id_room, String type, Double price, String equipement, Boolean availability) {
	        this.id_room = id_room;
	        this.type = type;
	        this.price = price;
	        this.equipement = equipement;
	        this.availability = availability;
	    }

	    public int getId_room() {
	        return this.id_room;
	    }

	    public void setId_room(int id_room) {
	        this.id_room = id_room;
	    }

	    public String getType() {
	        return this.type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public Double getPrice() {
	        return this.price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }

	    public String getEquipement() {
	        return this.equipement;
	    }

	    public void setEquipement(String equipement) {
	        this.equipement = equipement;
	    }

	    public Boolean getAvailability() {
	        return this.availability;
	    }

	    public void setAvailability(Boolean availability) {
	        this.availability = availability;
	    }
	}


