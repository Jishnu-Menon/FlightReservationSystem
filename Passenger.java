public class Passenger {
    private boolean isPassengerRegistered;
         private static int idCounter = 0;

    private static class Contact{
        public Contact(String name, int phone, String email) {}
    }

    private static class Address{
        String street,city,state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    public Passenger(boolean isPassengerRegistered, String street, String city, String state, String name, int phoneNumber, String email) {
        Address address = new Address(street, city, state);
        Contact contact = new Contact(name, phoneNumber, email);
        ++idCounter;
        this.isPassengerRegistered = isPassengerRegistered;
    }

// getter and setter
    public void setPassengerRegistered(boolean passengerRegistered) {
        isPassengerRegistered = passengerRegistered;
    }

    Boolean isPassengerRegistered(){
        return this.isPassengerRegistered;
    }

    public Boolean getPassenger(){
        return this.isPassengerRegistered;
    }
    public int getPassengerCount(){
        return idCounter;
    }

}

