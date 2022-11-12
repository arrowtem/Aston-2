package com.example.myapplication;

import java.util.ArrayList;

public class DataCountry {
   private ArrayList<Country> listOfCountries = new ArrayList<Country>();
   public  DataCountry(){
        listOfCountries.add(new Country(R.string.columbia,R.drawable.columbia));
        listOfCountries.add(new Country(R.string.denmark,R.drawable.denmark));
        listOfCountries.add(new Country(R.string.italy,R.drawable.italy));
        listOfCountries.add(new Country(R.string.polland,R.drawable.polland));
        listOfCountries.add(new Country(R.string.swtizerland,R.drawable.swtiz));
        listOfCountries.add(new Country(R.string.thailand,R.drawable.thai));
       listOfCountries.add(new Country(R.string.madagascar,R.drawable.madagascar));
       listOfCountries.add(new Country(R.string.austria,R.drawable.austria));
    }
    public ArrayList<Country> getListOfCountries(){
        return listOfCountries;
    }
}
