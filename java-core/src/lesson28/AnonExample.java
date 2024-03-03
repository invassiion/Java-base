package lesson28;

import collection.animal.Flight;

public class AnonExample {
    public static void run(){
        Flight flight = new Flight() {
            @Override
            public void takeOff() {
                System.out.println("Flight.takeOff");
            }

            @Override
            public void landing() {
                System.out.println("Flight.landing");
            }
        };

        flight.landing();
        flight.takeOff();
    }
}
