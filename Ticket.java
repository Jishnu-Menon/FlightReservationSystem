abstract class Ticket {
    private int pnrNumber;
    private int seatNumber;
    private String flightName;
    private boolean isCancelled;
    private String departure;
    private String dateOfDeparture;
    private String timeOfDeparture;
    private String arrival;
    private String dateOfArrival;
    private String timeOfArrival;
    private int durationOfJourney;
    private float ticketPrice;
    Flight flight;
    Passenger passenger;

    public Ticket(int pnrNumber, int seatNumber, String flightName, boolean isCancelled, String departure, String dateOfDeparture, String timeOfDeparture, String arrival, String dateOfArrival, String timeOfArrival, int durationOfJourney, float ticketPrice, Flight flight, Passenger passenger) {
        this.pnrNumber = pnrNumber;
        this.seatNumber = seatNumber;
        this.flightName = flightName;
        this.isCancelled = isCancelled;
        this.departure = departure;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.arrival = arrival;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.durationOfJourney = durationOfJourney;
        this.ticketPrice = ticketPrice;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Ticket() {

    }

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public int getDurationOfJourney() {
        return durationOfJourney;
    }

    public void setDurationOfJourney(int durationOfJourney) {
        this.durationOfJourney = durationOfJourney;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Flight getFlights() {
        return flight;
    }

    public void setFlights(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

     public abstract void printTicketDetails(Ticket ticket);
}
