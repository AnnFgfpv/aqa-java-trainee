package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneList {
    public Map<String, List<String>> book;
    public PhoneList(){
        book = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber){
        List<String> phones = book.getOrDefault(lastName, new ArrayList<>());
        phones.add(phoneNumber);
        book.put(lastName, phones);
    }

    public List<String> get(String lastName) {
        return book.getOrDefault(lastName, new ArrayList<>());
    }
    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();

        phoneList.add("Ivanov", "123-456-789");
        phoneList.add("Petrov", "987-654-321");
        phoneList.add("Sidorov", "111-222-333");
        phoneList.add("Ivanov", "555-555-555");

        System.out.println("Phone numbers for Ivanov: " + phoneList.get("Ivanov"));
        System.out.println("Phone numbers for Petrov: " + phoneList.get("Petrov"));
        System.out.println("Phone numbers for Sidorov: " + phoneList.get("Sidorov"));

    }
}

