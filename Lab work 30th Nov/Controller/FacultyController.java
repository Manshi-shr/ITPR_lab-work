package com.jdbcconnectivity.learningmanagementsystem.controller;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import com.jdbcconnectivity.learningmanagementsystem.service.impl.*;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;

import java.util.*;

public class FacultyController {

private FacultyService facultyService;
	
	//constructor
	public FacultyController()
	{
		//to initailize service
		facultyService = new FacultyServiceImpl();
	}
	//user interface for registration of new faculty
	public void registerFacultyUI()
	{
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		//creating choice variable
		String choice = "";

		do {
		//input of faculty id
		System.out.print("Enter Faculty id : ");
		String facultyId = sc.nextLine();
		//input of faculty name
		System.out.print("Enter Faculty Name : ");
		String name = sc.nextLine();
		//input of faculty qualification
		System.out.print("Enter Qualification : ");
		String qualification = sc.nextLine();
		//input of faculty status
		System.out.print("Enter Status : ");
		String status = sc.nextLine();
	
		 // consume leftover newline before nextLine()
	    sc.nextLine();
		
		//calling register method
		facultyService.registerFaculty(new Faculty(facultyId, name, qualification,status));
		

	    System.out.println("Do You want to enter more data (y | n) :");
	    choice = sc.nextLine();
		}while (!choice.equalsIgnoreCase("n"));
		
		sc.close();
		
	}

}
