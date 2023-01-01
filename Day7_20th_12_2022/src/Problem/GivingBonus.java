package Problem;

import java.util.Scanner;

public class GivingBonus {

	
	public static void main(String[] args) {
		float joiningYear,currentYear,serving_year;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee: ");
        name = sc.nextLine();
		System.out.println("Enter year of joining: ");
        joiningYear = sc.nextFloat();
        System.out.println("Enter current year: ");
        currentYear = sc.nextFloat();
       
        serving_year=currentYear-joiningYear;
        if(serving_year>3) {
        	System.out.println(name +" is eligible for bonus, given 3000Rs ");
        }
        else {
        	System.out.println(name +" is not eligible for bonus");
        }
        
	}
}

