package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myfirst")
public class TestApplication2 {
	

	private static HashMap<Integer, Student> studentMap = new HashMap<>();
	private static Integer studentId = new Integer(0);
	
	private static HashMap<Integer, SmartPhone> smartPhoneMap = new HashMap<>();
	private static Integer smartPhoneIMEI = new Integer(0);
	

	private static HashMap<Integer, vehicle> vehicleMap = new HashMap<>();
	private static Integer vehicleNumber = new Integer(0);
	
	
	
	private static HashMap<Integer, MyClassRoom> MyClassRoomMap = new HashMap<>();
	private static Integer familyDetails = new Integer(0);
	
	@Autowired MyFirstService myService;
	
	@Autowired MySecondService mynewphone ;
   
	
	
	

	@GetMapping("/myfirstservice/{id}")
	@ResponseBody
	public String myFirstSevice(@PathVariable String id) {

		return "ID :" + id;

	}

	@GetMapping("/myclass")
	public String str(@RequestParam String Welcome) {

		return "Id" + Welcome;
	}

	@GetMapping("/student/{name}/{surName}")
	@ResponseBody
	public String to(@PathVariable String name, @PathVariable String surName) {

		return "Welcome my friend  " + name + " " + surName;
	}

	@GetMapping("/myFirstJsonResponse")
	@ResponseBody
	public Student myrespone() {

		return new Student("Darshan", "joshi", 35, 70, "Pass");

	}

	@GetMapping("/employ")
	@ResponseBody
	public String my(@RequestParam String employ, @RequestParam String selery) {
		return "Welcome to this Company" + employ + " " + selery;

	}

	@RequestMapping(value = "/student", method = RequestMethod.POST, consumes = "application/json")
	public String createStudentRecord(@RequestBody Student std) {

		/*
		 * int temp = studentId + 1; studentId = temp;
		 * 
		 * studentMap.put(temp, std);
		 * 
		 * System.out.println("My Data " + studentMap.get(temp));
		 * 
		 * return "Created With Student id = " + temp;
		 */	
		return myService.crateStudent(std)	;
	
	}

	@RequestMapping(value = "/student/{studentId}", method = RequestMethod.GET)
	public ResponseEntity<Student> getStudentRecord(@PathVariable int studentId) {
		System.out.println("Ide from user is " + studentId);
		System.out.println("My Data " + studentMap.get(studentId));
		//<Student>  response = new ResponseEntity<Student>();
		//return studentMap.get(studentId);

		return ResponseEntity.ok().body(myService.getMyStudentObject(studentId));
	}

	@GetMapping("/myNewBike")
	@ResponseBody
	public vehicle to() {

		return new vehicle("Bajaj", "Bike", 4, "Pass");
	}

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST, consumes = " application/json")
	public String CreatvehicleType(@RequestBody vehicle to) {
		int temp = vehicleNumber + 1;
		vehicleNumber = temp;
		vehicleMap.put(temp, to);
		System.out.println("Bike Data " + vehicleMap.get(temp));
		return "Group of vehical id =" + temp;

	}

	@RequestMapping(value = "/vehicle/{vehicleNumber}", method = RequestMethod.GET)
	public vehicle getvehicle(@PathVariable int vehicleNumber) {

		System.out.println("New User " + vehicleNumber);
		System.out.println("My Data " + vehicleMap.get(vehicleNumber));

		return vehicleMap.get(vehicleNumber);
		

	}
	
	
	
	
	@GetMapping("/myHome")
	@ResponseBody
	public MyClassRoom by() {

		return new MyClassRoom("papa", 87, "big", "Cool", "baby" );
		
	}

@RequestMapping(value = "/MyClassRoom", method = RequestMethod.POST, consumes = "application/json")
	public String myfamily(@RequestBody MyClassRoom by) {
		
	int temp = familyDetails + 1;
		familyDetails = temp;
		MyClassRoomMap.put(temp, by);
	System.out.println("Bike Data " + vehicleMap.get(temp));
		return "Group of vehical id =" + temp;


	}
	 

	@RequestMapping(value = "/MyClassRoom/{familyDetails}", method = RequestMethod.GET)
	public MyClassRoom getMyClassRoom(@PathVariable int familyDetails) {

		System.out.println("New User " + familyDetails);
		System.out.println("My Data " + MyClassRoomMap.get(familyDetails));

		return MyClassRoomMap.get(familyDetails);
	

}
	

	
	
	@GetMapping("/myNewphone")
	@ResponseBody
	public SmartPhone sell() {

		return new SmartPhone("Bajaj", "Bike", 4, 87,"good");
	
	
	}
	
	
	
	@RequestMapping(value = "/smartPhone", method = RequestMethod.POST, consumes = "application/json")
	public String creatnewsmartPhone(@RequestBody SmartPhone  sell) {

		
		//  int temp = smartPhoneIMEI + 1; smartPhoneIMEI = temp;
		  
	//	  smartPhoneMap.put(temp, sell);
		  
	//	  System.out.println(" Give a gift " + smartPhoneMap.get(temp));
		  
	//	  return "Created With Student id = " + temp;
		 	
		return mynewphone.newsmartPhone(sell)	;
	
	}

	@RequestMapping(value = "/smartPhone/{smartPhoneIMEI}", method = RequestMethod.GET)
	//public SmartPhone getsmartPhone(@PathVariable int smartPhoneIMEI) {
	public ResponseEntity<SmartPhone> getSelmobile(@PathVariable int smartPhoneIMEI) {
	//	System.out.println("Ide from user is " + smartPhoneIMEI);
	//	System.out.println("My Data " + smartPhoneMap.get(smartPhoneIMEI));
		//<SmartPhone>  response = new ResponseEntity<SmartPhone>();
	//return smartPhoneMap.get(smartPhoneIMEI);
	

		return ResponseEntity.ok().body(mynewphone.getsmartPhone(smartPhoneIMEI));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
