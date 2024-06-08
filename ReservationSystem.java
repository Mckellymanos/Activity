
package com.mycompany.reservationsystem;


import java.util.ArrayList;

class ReservationSystem {
    private ArrayList<String> flights;
    private ArrayList<String> hotels;

   
    public ReservationSystem() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

  
    public void searchFlights(String departure, String destination, String date) {
      
        System.out.println("Searching for flights from " + departure + " to " + destination + " on " + date);
        
        flights.add("Flight1");
        flights.add("Flight2");
        System.out.println("Available flights: " + flights);
    }

    
    public void searchHotels(String city, String checkInDate, String checkOutDate) {
       
        System.out.println("Searching for hotels in " + city + " from " + checkInDate + " to " + checkOutDate);
        
        hotels.add("Freehand Los Angeles");
        hotels.add("The Hollywood Roosevelt");
        System.out.println("Available hotels: " + hotels);
    }

   
    public void bookFlight(String flight) {
        if (flights.contains(flight)) {
            flights.remove(flight);
            System.out.println("Flight to :" + flight + " booked successfully.");
        } else {
            System.out.println("Flight to :" + flight + " not found or already booked.");
        }
    }

   
    public void bookHotel(String hotel) {
        if (hotels.contains(hotel)) {
            hotels.remove(hotel);
            System.out.println("Hotel : " + hotel + " booked successfully.");
        } else {
            System.out.println("Hotel : " + hotel + " not found or already booked.");
        }
    }

    
    public void cancelFlight(String flight) {
        if (!flights.contains(flight)) {
            flights.add(flight);
            System.out.println("Flight reservation for: " + flight + " canceled.");
        } else {
            System.out.println("No reservation found for flight " + flight + ".");
        }
    }

  
    public void cancelHotel(String hotel) {
        if (!hotels.contains(hotel)) {
            hotels.add(hotel);
            System.out.println("Hotel reservation for: " + hotel + " canceled.");
        } else {
            System.out.println("No reservation found for hotel " + hotel + ".");
        }
    }

    
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

      
        reservationSystem.searchFlights("New York", "Los Angeles", "2024-06-10");
        reservationSystem.searchHotels("Los Angeles", "2024-06-10", "2024-06-15");

        
        reservationSystem.bookFlight("New York");
        reservationSystem.bookHotel("Millennium Hotel Broadway Times Square");

       
        reservationSystem.cancelFlight("New York");
        reservationSystem.cancelHotel("Park Central");
    }
}

