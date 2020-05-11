package com.hexa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import com.pojo.Sample;

import junit.framework.Assert;

public class JSONRead {
	@Test
	public void jsonRead() throws IOException, ParseException {
		FileReader rd = new FileReader(
				"C:\\Users\\arumu\\eclipse\\JSONExmaple\\src\\test\\resources\\JSon Files\\sample.json");
		JSONParser parser = new JSONParser();
		Object o = parser.parse(rd);
		JSONObject j = (JSONObject) o;
		Sample sample=new Sample();
		//setter
		sample.setFrom(j.get("from").toString());
		sample.setTo(j.get("to").toString());
		sample.setTripType(j.get("tripType").toString());
		sample.setFromDate(j.get("fromDate").toString());
		sample.setReturnDate(j.get("returnDate").toString());
		sample.setFlightNo(j.get("flightNo").toString());
		sample.setName(j.get("name").toString());
		sample.setDob(j.get("dob").toString());
		sample.setStreetName(j.get("streetName").toString());
		sample.setCityName(j.get("cityName").toString());
		sample.setDistrictName(j.get("districtName").toString());
		sample.setStateName(j.get("stateName").toString());
		sample.setCountry(j.get("country").toString());
		sample.setMobileNo(Integer.valueOf(j.get("mobileNo").toString()));
		sample.setLandLineNo(Integer.parseInt(j.get("landLineNo").toString()));
		sample.setPersonal(j.get("personal").toString());
		sample.setOfficial(j.get("official").toString());
		sample.setCardName(j.get("cardName").toString());
		sample.setCardHolderName(j.get("cardHolderName").toString());
		sample.setCardNo(Long.valueOf(j.get("cardNo").toString()));
		sample.setCvvNo(Integer.parseInt(j.get("cvvNo").toString()));
		//getters
		System.out.println("*******Travel Details*****");
		System.out.println("Source         : "+sample.getFrom());
		System.out.println("dest           :"+sample.getTo());
		System.out.println("TripType       :"+sample.getTripType());
		System.out.println("FromDate       :"+sample.getFromDate());
		System.out.println("ToDate         :"+sample.getReturnDate());
		System.out.println("FlightNo 	   :"+sample.getFlightNo());
		System.out.println("*****Customer Details*****");
		System.out.println("Passenger name :"+sample.getName());
		System.out.println("Dob            : "+sample.getDob());
		System.out.println("Streetname     :"+sample.getStreetName());
		System.out.println("Cityname       :"+sample.getCityName());
		System.out.println("DistrictName   :"+sample.getDistrictName());
		System.out.println("StateName      :"+sample.getStateName());
		System.out.println("Country	       :"+sample.getCountry());
		System.out.println("Phone	       :"+sample.getMobileNo());
		System.out.println("*****Payment Details******");
		System.out.println("Email id       :"+sample.getPersonal());
		System.out.println("CardName       :"+sample.getCardName());
		System.out.println("CardHolderName :"+sample.getCardHolderName());
		System.out.println("cardNo         :"+sample.getCardNo());
		System.out.println("Cvv number     :"+sample.getCvvNo());
		
		///Assertion
		Assert.assertEquals("Verify Source place","Chennai",sample.getFrom());
		Assert.assertEquals("verify Destination Place","Dubai",sample.getTo());
		Assert.assertEquals("verify tripType","Round Trip", sample.getTripType());
		Assert.assertEquals("verify from Date","08-05-2020",sample.getFromDate());
		Assert.assertEquals("verify Return Date","17-05-2020",sample.getReturnDate());
		Assert.assertEquals("verify Flight no","12345",sample.getFlightNo());
		Assert.assertEquals("verify phone no ",1234567897l,sample.getMobileNo());
		Assert.assertEquals("verify card number",14245679978898l,sample.getCardNo());
		Assert.assertEquals("verify cvv",123,sample.getCvvNo());

	}
	
}
