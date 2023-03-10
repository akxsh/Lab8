package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount());
    }

    /**
     *  checks whether there is an existing city
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
    }

    /**
     *  deletes the city
     */
    @Test
    public void testDelete() throws Exception {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.deleteCity(city);
        Assertions.assertFalse(list.hasCity(new City("Estevan","SK")));
    }

    /**
     *  counts the cities
     */
    @Test
   public  void testCountCities(){
        list = MockCityList();
        City city = new City("Edmonton","AB");
        int listSize = list.getCount();
        list.addCity(city);
        assertEquals(list.getCount(),listSize+1);
    }
}
