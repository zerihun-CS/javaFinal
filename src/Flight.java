import java.util.ArrayList;

public class Flight {
    int FLIGHTCAPACITY;
    ArrayList<String> passengers = new ArrayList<>();
    Flight(int capacity){
        FLIGHTCAPACITY = capacity;
    }
    void addPassengers(String name){
        if (passengers.size() < FLIGHTCAPACITY) {
            passengers.add(name);
            System.out.println(name + "has been added to the passengers list");
        }
        else
            System.out.println("the flight is full");

    }

    void listOfPassengers(){
        System.out.println(passengers);
    }

}

