class Ticket {
	int ticket, code;
	String dot;
	String Seat;
	int noSeats;

	public void setticket(int t, String dt, String s, int nos, int cd) {
		this.ticket = t;
		this.dot = dt;
		this.Seat = s;
		this.noSeats = nos;
		this.code = cd;
	}

	public void getticket() {
		System.out.println("\nTicket Id : " + ticket);
		System.out.println("Flight Date :" + dot);
		System.out.println("Seat type :" + Seat);
		System.out.println("No of seats booked :" + noSeats);
	}
}
