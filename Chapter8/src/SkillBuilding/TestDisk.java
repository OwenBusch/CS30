package SkillBuilding;

import java.util.Scanner;

/*
 * TestDisk.java
 * A simple application for testing the Disk class.
 * Lawrenceville Press
 * June 10, 2011
 */

 /**
  * The Disk class is tested.
  */
 public class TestDisk {

	public static void main(String[] args) {
		Disk saucer = new Disk(10, 0.02);

		System.out.println("Disk radius: " + saucer.getRadius());
		System.out.println("Disk surface area: " + saucer.area());
		System.out.println("Disk volume: " + saucer.volume());

		System.out.println("Enter a radius for the first disk");
		Scanner sc = new Scanner(System.in);
		double radius1 = sc.nextDouble();
		System.out.println("Enter a thickness for the first disk");
		sc = new Scanner (System.in);
		double thickness = sc.nextDouble();
		
		System.out.println("Enter a radius for the second disk");
		Scanner sc2 = new Scanner(System.in);
		double radius2 = sc.nextDouble();
		System.out.println("Enter a thickness for the second disk");
		sc2 = new Scanner (System.in);
		double thickness2 = sc.nextDouble();


		Disk plate1 = new Disk(radius1, thickness);
		Disk plate2 = new Disk(radius2, thickness2);
		if (plate1.equals(plate2)) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
		System.out.println(plate1);
		System.out.println(plate2);
	}
}