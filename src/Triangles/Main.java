package Triangles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triangle test = new Triangle();
		Scanner input = new Scanner(System.in);
		test.setTriangle(test, input);
		test.isTriangle(test);
		if(!test.real) {
			input.close();
			return;
		}
		test.typeOfTriangle(test);
		test.rightAngle(test);
		input.close();
		return;
	}

}
