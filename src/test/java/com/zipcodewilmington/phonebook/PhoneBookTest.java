package com.zipcodewilmington.phonebook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Shuchi on 1/23/18.
 */
public class PhoneBookTest {
    PhoneBook phone = new PhoneBook();


    @Test

    public void hasEntryTest1(){
        //Given

        PhoneBook ph1 = new PhoneBook();
        String name="Shuchi";
        //When

        Boolean actual = ph1.hasEntry(name);
        Boolean expected = false;

        //Then
        Assert.assertFalse(false);


    }
    @Test

    public void hasEntryTest2(){


        //Given
        String name = "Shuchi";
        String phone1 ="302-890-871";


        ArrayList<String> pho = new ArrayList<String>();
          pho.add("302-901-0981");



        PhoneBook ph1 = new PhoneBook ();
        //When
        ph1.add("Shuchi",phone1);

        Boolean actual = ph1.hasEntry(name);
        //Then
        Boolean expected = true;
        Assert.assertTrue(actual);


    }
    @Test

    public void removeTest(){


        //Given
        String name = "Shuchi";
        String mphone ="890-567-1234";
        ArrayList<String> pho = new ArrayList<String>();
        pho.add(mphone);


        PhoneBook ph1 = new PhoneBook ();
        //When
        ph1.add("Shuchi",mphone);

        Boolean actual = ph1.hasEntry(name);
        //Then
        Boolean expected = true;
        Assert.assertTrue(actual);

        ph1.remove(name);
        Boolean actual2 = ph1.hasEntry(name);
        //Then

        Assert.assertFalse(actual2);





    }
@Test
    public void getArrayListTest() {
    //Given
    //phone.clear();

    PhoneBook phone1 = new PhoneBook();
    Map<String, ArrayList<String>> myphone2 = new TreeMap<String, ArrayList<String>>();


    String name = "Shuchi";
    ArrayList<String> phonenum = new ArrayList<String>();

    String phonea="302-901-0981";
    String phoneb="302-901-0982";

    phonenum.add(phonea);
    phonenum.add(phoneb);


    System.out.println("a="+phonenum);

   phone1.add(name,phonea);
   phone1.add(name,phoneb);

   // Boolean actual = phone1.hasEntry();
    //Assert.assertTrue(actual);
    //When



    ArrayList actual = phone1.getArrayListFor(name);

    System.out.println("aa="+actual);
    //Then

    Assert.assertEquals(phonenum,  actual);
}

    @Test
    public void displaytest() {

        //Given
        String name = "Shuchi";
        String phoo = "302-901-0981";
        ArrayList<String> pho = new ArrayList<String>();
        pho.add(phoo);


        PhoneBook ph1 = new PhoneBook();
        //When
        ph1.add(name,phoo);
        String expectedlist= "Shuchi phonelist 302-901-0981";
        ph1.display();


    }
    @Test
    public void lookupTest() {

        //Given
        String name = "Shuchi";
        String phoo = "302-901-0981";
        ArrayList<String> pho = new ArrayList<String>();
        pho.add(phoo);


        PhoneBook ph1 = new PhoneBook();
        //When
        ph1.add(name,phoo);

       ph1.lookUp(name);
    }

    @Test
    public void lookupNumbersForTest() {
        //Given


        PhoneBook phone1 = new PhoneBook();



        String name = "Shuchi";
        ArrayList<String> phonenum = new ArrayList<String>();

        String phonea = "302-901-0981";
        String phoneb = "302-901-0982";

        phonenum.add(phonea);
        phonenum.add(phoneb);
        String[] expected = phonenum.toArray(new String[0]);


        System.out.println("a=" + Arrays.toString(expected));

        phone1.add(name, phonea);
        phone1.add(name, phoneb);


        String []actual = phone1.lookupNumbersFor(name);


        System.out.println("aa=" + Arrays.toString(actual));
        //Then

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void reverseLookuptest() {

        //Given
        String expectedname = "Shuchi";
        String phoo = "302-901-0981";
        String phoo2 = "302-901-1234";
        ArrayList<String> pho = new ArrayList<String>();
        pho.add(phoo);
        pho.add(phoo2);


        PhoneBook ph1 = new PhoneBook();
        ph1.add(expectedname, phoo);
        ph1.add(expectedname, phoo2);

        //When


        String actual = ph1.reverseLookup(phoo);
        //Then

        Assert.assertEquals(expectedname, actual);
    }

        @Test
        public void listNameandNumbersTest() {

            //Given
            String name = "Shuchi";
            String phoo = "302-901-0981";
            String name2 = "Nirmala";
            String phoo2 = "302-555-0981";
            String name3 = "Laxmi";
            String phoo3 = "387-901-6712";
            ArrayList<String> pho = new ArrayList<String>();
            pho.add(phoo);
            pho.add(phoo2);
            pho.add(phoo3);


            PhoneBook ph1 = new PhoneBook();
            //When
            ph1.add(name,phoo);
            ph1.add(name2,phoo2);
            ph1.add(name3,phoo3);
            String actual = ph1.ListNameandNumbers();
            Assert.assertEquals(true,actual.contains(phoo));
            Assert.assertEquals(true,actual.contains(name));




        }














}
