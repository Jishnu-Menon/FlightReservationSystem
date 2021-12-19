public class RegularTicket extends Ticket{
    private String[] specialService;
        public RegularTicket(boolean isSpecialService) {
            super();
        }

    public RegularTicket(int pnrNumber, int seatNumber, String flightName, boolean isCancelled, String departure, String dateOfDeparture, String timeOfDeparture, String arrival, String dateOfArrival, String timeOfArrival, int durationOfJourney, float ticketPrice, Flight flight, Passenger passenger, boolean isSpecialService, String[] specialService) {

        super(pnrNumber, seatNumber, flightName, isCancelled, departure, dateOfDeparture, timeOfDeparture, arrival, dateOfArrival, timeOfArrival, durationOfJourney, ticketPrice, flight, passenger);
        this.specialService = specialService;
    }

    public String[] getSpecialService(){
            String[] str =new String[3];
            str[0]=specialService[0];
            str[1]=specialService[1];
            str[2]=specialService[2];
        return  str;
        }

    @Override
    public void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
}
