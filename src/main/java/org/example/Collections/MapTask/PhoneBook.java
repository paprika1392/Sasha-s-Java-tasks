package org.example.Collections.MapTask;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> phoneBookMap = new HashMap<>();

    public void edEntry(String name, String phoneNumber) {
        phoneBookMap.put(name, phoneNumber);
        System.out.println("Has been added user: " + name + " with phone number: " + phoneNumber);
    }

    public void removeEntry(String name) {
        if(phoneBookMap.remove(name) != null) {
            System.out.println("Has been removed: " + name);
        } else {
            System.out.println("The user not found.");
        }
    }

    public void updateEntry(String name, String newPhoneNumber) {
        if(phoneBookMap.containsKey(name)) {
            phoneBookMap.put(name, newPhoneNumber);
            System.out.println("Have been updated phone number of" + name + ": " + newPhoneNumber);
        } else {
            System.out.println("The user: " + name + " is not found.");
        }
    }

    public void printAllEntries() {
        if (phoneBookMap.isEmpty()) {
            System.out.println("The phone book is empty.");
        } else {
            System.out.println("The users and phone numbers: ");
            for (Map.Entry<String, String> entry : phoneBookMap.entrySet()) {
                System.out.println(entry.getKey() + " , " + entry.getValue());
            }
        }
    }
}
