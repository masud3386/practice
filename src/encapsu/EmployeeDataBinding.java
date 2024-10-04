package encapsu;

import java.util.Scanner;

public class EmployeeDataBinding {
	Scanner scanner;
	private int eid;
	private int  exp;
	private float sal;
	
	
	public void seteid(int eid){
		scanner = new Scanner(System.in) ;
			System.out.println("enter key");
			int key = scanner.nextInt();
			if(key==1234) {
				this.eid=eid;
			}
		}
			
	
	
     public int geteid() {
		scanner = new Scanner(System.in);
		System.out.println("enter key");
		int key = scanner.nextInt();
		if(key==1234) {
			return eid;
		}else {
			return 0;
			
		}
		
	}
     public void setexp(int  exp) {
    	 this.exp=exp;
     }

	public int  getexp() {
		return exp;
		
		}
	
	public void setsal(float sal) {
		this.sal=sal;
	}
	

	public float getsal() {
		return sal;
			
		}
	
	
	}
	



