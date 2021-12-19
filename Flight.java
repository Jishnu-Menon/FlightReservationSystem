public class Flight {
    private int flightNumber;
    private String airlineName;
    private int capacity;
    private int noOfSeatsBooked;
    private boolean isAvailable;

    // Parameterized constructor for Flight
    public Flight(int flightNumber, String airlineName, int capacity, int noOfSeatsBooked, boolean isAvailable) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
        this.isAvailable = isAvailable;
    }

    // getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatsBooked() {
        return noOfSeatsBooked;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.noOfSeatsBooked = noOfSeatsBooked;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}