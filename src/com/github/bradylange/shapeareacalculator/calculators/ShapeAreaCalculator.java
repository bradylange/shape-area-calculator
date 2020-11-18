/*
 * Developer: Brady Lange
 * Course: CSIS 161 - Programming I
 * Institution: University of Wisconsin-River Falls
 * Class: ShapeAreaCalculator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeareacalculator.calculators;

// Import util library - console scanner
import java.util.Scanner;

/**
 * <p>
 * 		Calculates the area of mathematical shapes such as a triangle, circle, 
 * 		square, and rectangle. Contains the {@link #main} method which 
 * 		instantiates and sets up the program.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 09/30/2016
 */
public class ShapeAreaCalculator
{ 
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up the program.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 09/30/2016
	 */
	public static void main(String[] args) 
	{ 
		// --------------------------------------------------------------------
		// General Variables
		// --------------------------------------------------------------------
		// Console scanner
		Scanner console = new Scanner(System.in);					
		
		// --------------------------------------------------------------------
		// Triangle Variables
		// --------------------------------------------------------------------
		// Base of triangle
		double triBase; 	
		// Height of triangle
		double triHeight; 	
		// Multiply the triangle's base by half of its value
		double triBaseHalf = 0.5; 		
		// Area of triangle
		double triArea; 	
		// Area of triangle formatted
		String triFrm; 										
		
		// --------------------------------------------------------------------
		// Circle Variables
		// --------------------------------------------------------------------
		// Radius of circle
		double cirRadius; 		
		// Area of circle
		double cirArea; 		
		// Area of circle formatted 
		String cirFrm; 	
		// Value of pi is 3.14, use two decimal places
		final String PI = String.format("%.2f", Math.PI);												
		
		// --------------------------------------------------------------------
		// Square Variables
		// --------------------------------------------------------------------
		// Side of square
		int sqrSide; 													
		// Area of square
		int sqrArea; 												

		// --------------------------------------------------------------------
		// Rectangle Variables
		// --------------------------------------------------------------------
		// Width of rectangle
		int rectWidth; 													
		// Length of rectangle
		int rectLength; 												
		// Area of rectangle
		int rectArea; 											
			
		System.out.println("************************************************");
		System.out.println("Shape Area Calculator:");
		System.out.println("************************************************");
		// --------------------------------------------------------------------
		// Triangle Area Calculations	
		// --------------------------------------------------------------------
		// Ask for triangle's base length
		System.out.print("What is the triangle's base length? ");	
		// Retrieve triangle's base length
		triBase = console.nextDouble();								
		// Ask for triangle's height
		System.out.print("What is the triangle's height? ");	
		// Retrieve triangle's height
		triHeight = console.nextDouble();								
		// Calculate triangle's area 
		triArea = triBaseHalf * triBase * triHeight;
		// Format triangle's area to two decimal places
		triFrm = String.format("%.2f", triArea);			
		// Print triangle's properties and area
		System.out.println("The area of the triangle with the base of " 
		                   + triBase + " and the height of " + triHeight 
		                   + " is " + triFrm + ".\n");
		
		// --------------------------------------------------------------------
		// Circle Area Calculations	
		// --------------------------------------------------------------------
		// Ask for circle's radius
		System.out.print("What is the circle's radius? ");	
		// Retrieve circle's radius
		cirRadius = console.nextDouble();								
		// Calculate circle's area
		cirArea = cirRadius * cirRadius * Math.PI; 						
		// Format circle's area to two decimal places 
		cirFrm = String.format("%.2f", cirArea); 	
		// Print circle's properties and area
		System.out.println("The area of the circle with the radius of " 
		                   + cirRadius + " and pi of " + PI + " is " 
		                   + cirFrm + ".\n");
		
		// --------------------------------------------------------------------
		// Square Area Calculations	
		// --------------------------------------------------------------------
		// Ask for square's sides length
		System.out.print("What is the length of the sides of the square? "
		                 + "(No fractions) ");	
		// Retrieve square's side length
		sqrSide = console.nextInt();									 
		// Calculate the square's area 
		sqrArea = sqrSide * sqrSide;	
		// Print the square's properties and area 
		System.out.println("The area of the square with the sides of " 
		                   + sqrSide + " in length is " + sqrArea + ".\n");
		
		// --------------------------------------------------------------------
		// Rectangle Area Calculations	
		// --------------------------------------------------------------------
		// Ask for rectangle's width
		System.out.print("What is the rectangle's width? (No fractions) ");	
		// Retrieve rectangle's width
		rectWidth = console.nextInt();									
		// Ask for rectangle's length
		System.out.print("What is the rectangle's length? (No fractions) ");	
		// Retrieve rectangle's length
		rectLength = console.nextInt();									
		// Calculate rectangle's area
		rectArea = rectWidth * rectLength;			
		// Print rectangle's properties and area
		System.out.println("The area of the rectangle with the width of " 
		                   + rectWidth + " and length of " + rectLength 
		                   + " is " + rectArea + ".");
		// Close the console
		console.close(); 											
	} 
} 