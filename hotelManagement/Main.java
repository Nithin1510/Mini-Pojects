package hotelManagement;

import java.util.*;

public class Main {
	
	private ArrayList<Reservation> reservations = new ArrayList<>();
	
	public void addReservation(String guestName, int roomNumber, int numberOfNights) {
		Reservation reservation = new Reservation(guestName, roomNumber, numberOfNights);
		reservations.add(reservation);
		System.out.println("Reservation added successfully!");
	}
	
	public void viewReservation() {
		if(reservations.isEmpty()) {
			System.out.println("No Reservations found!");
		}else {
			System.out.println("List of Reservations : ");
			for(Reservation reserve : reservations) {
				System.out.println(reserve);
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Main hotel = new Main();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------> Hotel Reservation system <--------");
			System.out.println("Click 1 to add reservation");
			System.out.println("Click 2 to view reservation");
			System.out.println("Click 3 to Exit from Application" + "\n");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter guest name: ");
				String guestName = sc.next();
				System.out.println("Enter room number: ");
				int roomNumber = sc.nextInt();
				System.out.println("Enter number of nights: ");
				int numberOfNights = sc.nextInt();
				System.out.println();
				hotel.addReservation(guestName, roomNumber, numberOfNights);
				break;
			case 2:
				hotel.viewReservation();
				break;
			case 3:
				System.out.println("Thank you using our website!");
				System.out.println("------ Visit Again! ------");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
				break;
			}
			
		}

	}
}
