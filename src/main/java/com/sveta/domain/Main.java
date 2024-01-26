package com.sveta.domain;

public class Main {
       public static void main(String[] args) {
        Event event = new Event();
        Customer customer = event.createCustomer();
        event.customerReturnInventoryToStore();
        event.customerRentInventory(customer);
        event.newFilmWasMade();
    }

}

