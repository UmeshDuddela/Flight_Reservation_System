import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class FlightTicketReservationSystem {
	public static void main(String[] args) {
		Random rand = new Random();
		try (Scanner sc = new Scanner(System.in)) {
			LocalDate dt = LocalDate.now();
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String pdate = dt.format(df);

			int op = 1, cnf, pmt, id = 0, flag = 0;

			String section = new String();
			String[] city = new String[] { "Kerala", "Hyderabad", "Goa", "Gujarat" };
			String[] airporttype = new String[] { "Single", "Multihop" };
			int[] arr = new int[2];
			int[] mark = new int[2];

			System.out.println("\n---------------------------------------------------------------------");
			System.out.println("--------WELCOME TO SPICEJET AIRLINE TICKET RESERVATION CENTER--------");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("For Flight Booking of : Kerala-Hyderabad-Goa-Gujarat");
			System.out.println("Book your advance tickets between 31-01-2023 to " + pdate + " now.\n");

			Route[] flt = new Route[20];
			Aircraft[] acft = new Aircraft[5];
			Ticket[] tck = new Ticket[10];

			for (int i = 0; i < 20; i++)
				flt[i] = new Route();
			for (int i = 0; i < 5; i++)
				acft[i] = new Aircraft();
			for (int i = 0; i < 10; i++) {
				tck[i] = new Ticket();
				tck[i].ticket = 111;
			}

			acft[0].setdetails("Airbus A320-200", "passenger", 180, 730);
			acft[1].setdetails("Boeing 737-700", "passenger", 132, 510);
			acft[2].setdetails("Airbus A330-900neo", "passenger", 210, 650);
			acft[3].setdetails("Boeing 737-900", "passenger", 140, 580);
			acft[4].setdetails("Airbus A340-300F", "passenger", 126, 850);

			// mumbai-chennai = 1025km
			// mumbai-delhi = 1166km
			// mumbai-kolkata = 1664km
			// delhi-kolkata = 1304km
			// delhi-chennai = 1757km
			// kolkata-chennai = 1363km

			flt[0].setroute("moderate", 4531, "Kerala", "Hyderabad", "11:00-AM", 4450, 5);
			flt[1].setroute("moderate", 1328, "Kerala", "Hyderabad", "04:30-PM", 4000, 5);
			flt[2].setroute("busy", 5214, "Hyderabad", "Kerala", "10:45-AM", 5100, 4);
			flt[3].setroute("busy", 4589, "Hyderabad", "Kerala", "03:00-PM", 4100, 6);
			flt[4].setroute("low", 7842, "Kerala", "Goa", "11:45-AM", 9000, 6);
			flt[5].setroute("low", 1310, "Kerala", "Goa", "06:00-PM", 9310, 7);
			flt[6].setroute("low", 8659, "Goa", "Kerala", "10:00-PM", 8420, 4);
			flt[7].setroute("moderate", 3162, "Goa", "Gujarat", "10:30-AM", 5560, 5);
			flt[8].setroute("low", 7159, "Gujarat", "Goa", "09:50-AM", 6120, 5);
			flt[9].setroute("moderate", 5214, "Hyderabad", "Gujarat", "12:00-AM", 5700, 6);
			flt[10].setroute("moderate", 1159, "Hyderabad", "Gujarat", "07:00-PM", 6100, 4);
			flt[11].setroute("busy", 5326, "Gujarat", "Hyderabad", "02:00-PM", 5990, 7);
			flt[12].setroute("busy", 8832, "Gujarat", "Hyderabad", "09:00-PM", 6150, 4);
			flt[13].setroute("busy", 5214, "Hyderabad", "Goa", "08:00-AM", 4090, 5);
			flt[14].setroute("moderate", 1453, "Hyderabad", "Goa", "10:00-PM", 5130, 5);
			flt[15].setroute("low", 6432, "Goa", "Hyderabad", "01:00-PM", 9150, 7);
			flt[16].setroute("low", 8937, "Goa", "Hyderabad", "11:35-PM", 8430, 5);
			flt[17].setroute("busy", 8659, "Goa", "Gujarat", "10:00-AM", 4520, 6);
			flt[18].setroute("moderate", 8659, "Goa", "Gujarat", "09:00-PM", 4130, 4);
			flt[19].setroute("low", 5326, "Gujarat", "Goa", "02:00-PM", 5990, 6)
