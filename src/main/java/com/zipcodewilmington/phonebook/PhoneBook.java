package com.zipcodewilmington.phonebook;



import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.*;
import java.lang.String;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {


    public Map<String, ArrayList<String>> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(Map<String, ArrayList<String>> phonebook) {
        this.phonebook = phonebook;
    }

    Map<String, ArrayList<String>> phonebook = new TreeMap<String, ArrayList<String>>();


    public Boolean hasEntry(String name) {

        if (phonebook.containsKey(name)) {


            return true;
        } else {
            return false;
        }


    }


    public void add(String name, String phone) {


        if (hasEntry(name)) {
            getArrayListFor(name).add(phone);
        } else {
            ArrayList pphone = new ArrayList();
            pphone.add(phone);
            phonebook.put(name, pphone);
        }


    }

    public void remove(String name) {


        phonebook.remove(name);


    }

    public void display() {
        Set keys = phonebook.keySet();
        String phonelist = "";

        for (Iterator iterator = keys.iterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();

            ArrayList phone = (ArrayList) phonebook.get(name);
            phonelist = phonelist.join(",", phone);


            System.out.println("Name= " + name + " " + "phonelist " + phonelist);
        }


    }

    public ArrayList getArrayListFor(String name) {
        //PhoneBook myphone = new PhoneBook();


        //List <String> phonenum1 = new ArrayList<String>();


        return phonebook.get(name);
        //System.out.println("c="+phonenum1);
        //return (ArrayList) phonenum1;


    }


    public String lookUp(String name) {


        String phonelook = phonebook.get(name).toString();


        return phonelook;
    }


    public void clear() {
        phonebook.clear();
    }

    public String[] lookupNumbersFor(String name) {
        //PhoneBook myphone = new PhoneBook();


        //List <String> phonenum1 = new ArrayList<String>();


        String[] Stringlist = (String[]) getArrayListFor(name).toArray(new String[0]);


        return (Stringlist);
    }

    public String reverseLookup(String phonenumber) {

        String name = "";


        for (Map.Entry<String, ArrayList<String>> entry : phonebook.entrySet()) {
            System.out.println("entry :" + entry.getValue().toString());

            if (entry.getValue().toString().contains(phonenumber)) {

                System.out.println("phonenumber :" + phonenumber);

                name = entry.getKey();

                System.out.println("namelook :" + name);

            }

        }
        return name;

    }

    public String ListNameandNumbers() {

        String result = "";
        StringBuilder sb = new StringBuilder();


        for (Map.Entry<String, ArrayList<String>> entry : phonebook.entrySet()) {


            sb.append(entry.getKey() + " " + entry.getValue().toString().join(",",entry.getValue())+"\n");

             result = sb.toString();






        }
        System.out.println("list :" + result);


        return result;


    }
}
