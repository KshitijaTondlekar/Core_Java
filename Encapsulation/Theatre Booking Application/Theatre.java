public class Theatre {
	private String theatre_name;
	private int no_of_seats;
	
	private Ticket ticket;
	
	public Theatre(String n,int no) {
		this.theatre_name=n;
		this.no_of_seats=no;	
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name=theatre_name;
	}
	public String getTheatre_name() {
		return theatre_name;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats=no_of_seats;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public Ticket setTicket(Ticket ticket) {
		return ticket;
	}
	//Code of theatre operation
	
	public int bookTicket() {
		if(ticket.getno_of_tickets()<=no_of_seats) {
			no_of_seats=no_of_seats-ticket.getno_of_tickets();
			return ticket.getno_of_tickets();
		}else {
			return -1;
		}
	}
public void showSeatAvailability() {
	System.out.println(no_of_seats+"available");
}
public void cancelTicket(int cancel_ticket) {
	if(cancel_ticket<=ticket.getno_of_tickets()) {
		no_of_seats=no_of_seats+cancel_ticket;
		ticket.setno_of_tickets(ticket.getno_of_tickets()-cancel_ticket);
	}else {
		System.out.println("=====Technical Issue=====");
	}
}
public void showTicketDetails() {
	ticket.printTicketDetails();
}
}
