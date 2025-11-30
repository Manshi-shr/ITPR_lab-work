package com.jdbcconnectivity.learningmanagementsystem.controller;

import java.util.Scanner;

import java.util.*;
import com.jdbcconnectivity.learningmanagementsystem.model.*;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import com.jdbcconnectivity.learningmanagementsystem.service.impl.*;


public class CourseController {
	

	private CourseService courseService;
	public CourseController()
	{
		//to initailize service
		courseService = new CourseServiceImpl();
	}
	
	
	
	
	public void registerCourseUI()
	{
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		//creating choice variable
		String choice = "";

		do {
			//input of course id
		    System.out.print("Enter Course ID: ");
		    String courseId = sc.nextLine();
		    //input of course name
		    System.out.print("Enter Course Name: ");
		    String courseName = sc.nextLine();
		    //input of course description
		    System.out.print("Enter Course Description: ");
		    String courseDesc = sc.nextLine();
		    //input of course duration
		    System.out.print("Enter Course Duration: ");
		    int duration = sc.nextInt();
		    //input of course minimum enrollment
		    System.out.print("Enter Course Min Enrollment: ");
		    int minEnroll = sc.nextInt();
		  //input of course maximum enrollment
		    System.out.print("Enter Course Max Enrollment: ");
		    int maxEnroll = sc.nextInt();

		    // consume leftover newline before nextLine()
		    sc.nextLine();
		    //calling register method
		    courseService.registerCourse(new Course(courseId, courseName, courseDesc, duration, minEnroll, maxEnroll));
		    
		   
		    //taking user choice
		    System.out.println("Do You want to enter more data (y | n) :");
		    choice = sc.nextLine();

		} while (!choice.equalsIgnoreCase("n"));
		//closing scanner object
		sc.close();

		
	}
	
	
	

	public static void main(String[] args) {


	}

}
