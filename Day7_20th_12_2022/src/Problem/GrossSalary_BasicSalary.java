package Problem;
import java.util.Scanner;
public class GrossSalary_BasicSalary {
	public static void main(String[] args) {
		float grossSalary, basicSalary,DA,HRA;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
        basicSalary = sc.nextFloat();
        System.out.println("Basic Salary: "+ basicSalary);
        if(basicSalary<1500) {
        	HRA = (basicSalary*10)/100;
        	DA =  (basicSalary*70)/100;
        }
        else {
        	HRA = 500;
        	DA =  (basicSalary*80)/100;	
        }
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        grossSalary = basicSalary+DA+HRA;
        System.out.println("Gross Salary: "+grossSalary);
        
	}
}

