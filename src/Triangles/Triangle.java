package Triangles;

import java.util.Scanner;

public class Triangle {
	int a, b, c;
	boolean real = false;
	
	public void isTriangle(Triangle testObject) {
		
		if (testObject.a + testObject.b > testObject.c) {
			if( testObject.a + testObject.c > testObject.b) {
				if (testObject.b + testObject.c > testObject.a) {
					System.out.println("This is a triangle!");
					testObject.real = true;
				}else
					System.out.println("This is not a triangle!");
			}else
				System.out.println("This is not a triangle!");
		}else
			System.out.println("This is not a triangle!");
	}
	
	public void typeOfTriangle(Triangle testObject) {
		if(real)
			if (testObject.a == testObject.b && testObject.a == testObject.c)
				System.out.println("Equilateral triangle!");
			else
				if (testObject.a == testObject.b && testObject.a != testObject.c)
					System.out.println("Isosceles triangle!");
				else
					if (testObject.a != testObject.b && testObject.a != testObject.c)
						System.out.println("Scalene Triangle!");
	}
	
	public void rightAngle(Triangle testObject) {
		if(real)
			if (Math.pow(testObject.c, 2) == Math.pow(testObject.a, 2) + Math.pow(testObject.b, 2) )
				System.out.println("This is a right triangle!");
			else
				System.out.println("This is not a right triangle!");
	}
	
	public void setTriangle(Triangle testObject, Scanner input) {
		System.out.print("A?: ");
		testObject.a = input.nextInt();
		System.out.print("B?: ");
		testObject.b = input.nextInt();
		System.out.print("C?: ");
		testObject.c = input.nextInt();
	}
}
	

