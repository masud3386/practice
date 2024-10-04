package encapsu;

import java.util.Scanner;

public class Launch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
			System.out.println("enter eid");
			int eid = scanner.nextInt();
			
			
			
			System.out.println("enter exp");
			int exp = scanner.nextInt();
			
			
			System.out.println("enter sal");
			float sal = scanner.nextFloat();

			EmployeeDataBinding binding = new EmployeeDataBinding();
			binding.seteid(eid);
			binding.setexp(exp);
			binding.setsal(sal);
			Demo de=new Demo();
			de.xyz(binding);
		}

	}

