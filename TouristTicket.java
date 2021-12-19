public class TouristTicket extends Ticket{
    private String address;
    private String[] touristLocations;

    public TouristTicket(int pnrNumber, int seatNumber, String flightName, boolean isCancelled, String departure, String dateOfDeparture, String timeOfDeparture, String arrival, String dateOfArrival, String timeOfArrival, int durationOfJourney, float ticketPrice, Flight flight, Passenger passenger, String address, String[] touristLocations) {
        super(pnrNumber, seatNumber, flightName, isCancelled, departure, dateOfDeparture, timeOfDeparture, arrival, dateOfArrival, timeOfArrival, durationOfJourney, ticketPrice, flight, passenger);
        this.address=address;
        this.touristLocations=touristLocations;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getTouristLocations() {
        String[] str = new String[5];
        str[0]=touristLocations[0];
        str[1]=touristLocations[1];
        str[2]=touristLocations[2];
        str[3]=touristLocations[3];
        str[4]=touristLocations[4];
        return str;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
    }

    @Override
    public void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
}
