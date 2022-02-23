package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Service;
@Service
public class MySecondService {
	private static HashMap<Integer, SmartPhone> smartPhoneMap = new HashMap<>();
	private static Integer smartPhoneIMEI = new Integer(0);
	
	
	public String crateStudent(SmartPhone s1) {
		
		int temp = smartPhoneIMEI + 1;
		smartPhoneIMEI = temp;

		smartPhoneMap.put(temp, s1);

		System.out.println("My Data " + smartPhoneMap.get(temp));

		
		return "Created With Student id = " + temp;
	}

	
	public SmartPhone getsmartPhone(int smartPhoneIMEI) {
		return smartPhoneMap.get(smartPhoneIMEI);
	}


	public String newsmartPhone(SmartPhone sell) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	


	
	
	
}