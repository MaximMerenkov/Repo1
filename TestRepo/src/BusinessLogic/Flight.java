package BusinessLogic;
import java.util.Date;

import Database.DatabaseConnector;

import java.math.BigDecimal;

public class Flight {
	protected String flightId;
	protected String departingCity;
	protected Date departingDate;
	protected String departingTime;
	protected String arrivalCity;
	protected BigDecimal price;
	protected final int seatCap = 200;
	protected int availableSeats;
	
	Flight() {
		
	}
	
	Flight(String flightId, String departingCity, Date departingDate,
			String departingTime, String arrivalCity, BigDecimal price,
			int availableSeats) {
		this.flightId = flightId;
		this.departingCity = departingCity;
		this.departingTime = departingTime;
		this.arrivalCity = arrivalCity;
		
		
	}
	
	public class ConfirmedBookings {
		protected int ticketId = 1;
		
		ConfirmedBookings() {
			
		}
		
		public void confirmBooking(String custUsername) {
			DatabaseConnector.dbPushBooking(ticketId, flightId, custUsername);
		}
	}
}