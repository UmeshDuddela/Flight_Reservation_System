class Ticket {
	int ticket, code;
	String date;
	String Seat;
	int noSeats;

	public void setticket(int Tkt, String dt, String St, int nosts, int cde) {
		this.ticket = Tkt;
		this.date = dt;
		this.Seat = St;
		this.noSeats = nosts;
		this.code = cde;
	}

	public void getticket() {
		System.out.println("\nTicket Id : " + ticket);
		System.out.println("Flight Date :" + date);
		System.out.println("Seat type :" + Seat);
		System.out.println("No of seats booked :" + noSeats);
		System.out.println("flight reservation code :" + code);
	}
}
