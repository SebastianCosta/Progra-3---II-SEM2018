/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.FindPlaceFromTextRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.FindPlaceFromText;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.IOException;

/**
 *
 * @author Mata
 */
public class Main {
    public static void main(String[] args) throws ApiException, InterruptedException, IOException{
        GeoApiContext context = new GeoApiContext.Builder()
    .apiKey("AIzaSyA8lxfkfQs_Vq8AosNrtMehzQVvVmAer9A")
    .build();
GeocodingResult[] results =  GeocodingApi.geocode(context,
    "La 33").await();
Gson gson = new GsonBuilder().setPrettyPrinting().create();

//System.out.println(gson.toJson(results[0].addressComponents));
       
    FindPlaceFromTextRequest x= new FindPlaceFromTextRequest(context);
    x.inputType(FindPlaceFromTextRequest.InputType.TEXT_QUERY);
    x.input("La 33");
    
        System.out.println(lookupAddr("The fallen stag"));
        
    }
    
public static String lookupAddr(String establishment) throws ApiException, InterruptedException, IOException {
	
	//set up key
	GeoApiContext lookupDoodad = new GeoApiContext.Builder()
		    .apiKey("AIzaSyA8lxfkfQs_Vq8AosNrtMehzQVvVmAer9A")
		    .build();
		GeocodingResult[] results =  GeocodingApi.geocode(lookupDoodad,
		    establishment).await();
		
		//converts results into usable address
		
		String address = (results[0].placeId);
	
	return address;
}
public static LatLng lookupCoord(String establishment) throws ApiException, InterruptedException, IOException {
		
	//set up key
	GeoApiContext lookupDoodad = new GeoApiContext.Builder()
		    .apiKey("AIzaSyA8lxfkfQs_Vq8AosNrtMehzQVvVmAer9A")
		    .build();
	GeocodingResult[] results =  GeocodingApi.geocode(lookupDoodad,
	  establishment).await();
			
		//converts results into usable Coordinates
	
		LatLng coords = (results[0].geometry.location);
			//System.out.println(results[0].geometry.location);
	return coords;
}
 

    
}
