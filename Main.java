public class Main {
    public static  void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNumber());
    }

    public static void main(String[] args) {
        Flight flight = new Flight(203,"Air India",49,19,true);
        Passenger passenger= new Passenger(true,"Pool pada Road","Mumbai","Maharashtra","Chandra Shekhar",987654321,"chandrashekhar@gmail.com");
        String[] services ={"Food","Water","Snacks"};
        String[] locations ={"Thrissur","Bangalore","Mumbai","Pune","Chennai"};
        RegularTicket regularTicket= new RegularTicket(2690,9,"cx123",false,"Bangalore","19/12/21","20:12","Mumbai","20/12/21","01:00",5,8000.0f, flight,passenger,true,services);
        TouristTicket touristTicket= new TouristTicket(26901,7,"dx456",false,"Mumbai","19/12/21","15:00","Thrissur","19/12/21","17:00",2,12000.0f, flight,passenger,"Mumbai",locations);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

}
