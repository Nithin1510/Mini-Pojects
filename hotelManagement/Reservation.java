package hotelManagement;

public class Reservation {
	private String guestName;
	private int roomNumber;
	private int numberOfNights;
	
	
	public Reservation(String guestName, int roomNumber, int numberOfNights) {
		this.guestName = guestName;
		this.roomNumber = roomNumber;
		this.numberOfNights = numberOfNights;
	}

	public String getGuestName() {
		return guestName;
	}
	
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	public int getNumberOfNights() {
		return numberOfNights;
	}
	
	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}
	
	public String toString() {
		return "GuestName: " + guestName + ", Room number: " + 
				roomNumber + ", Nights: " + numberOfNights;
	}
	
}
