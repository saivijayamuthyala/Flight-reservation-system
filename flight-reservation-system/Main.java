package com.company;

public class Main {



        public static void main(String[] args) {
            Ticket regularTicket = new RegularTicket("34567", "Hyderabad",
                    "Delhi", "DepartureDateTime", "ArrivalDateTime",
                    "6F", 15000, false, null, null, "lunch");

            Ticket touristTicket = new TouristTicket("67890", "India", "UK",
                    "DepartureDateTime", "ArrivalDateTIme",
                    "10A", 25000, false, null, null,
                    "UK Hotel", new String[]{""});

            printTicketDetails(regularTicket);
            printTicketDetails(touristTicket);
        }

        public static void printTicketDetails(Ticket ticket) {
            System.out.println(ticket.getPnr());
        }

    }


