package class3_Conditions;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("New York");
		int age;
		age = 34;
		System.out.println("Employee age" + age);
		
		age = 56;
		System.out.println("Employee age is" + age + " years");
		
		//here + sign is called concat sign
		//whole process is called concatatenation
		// if day is 3 then print wednesday
		// if day value is 4 then print thursday
		
		int dayValue;
		dayValue = 6;
		
		if (dayValue==6) 
			{System.out.println("Monday");
			} //if
		
	
		if (dayValue==1) 
		{System.out.println("Monday");
		
		} //if
		
		if (dayValue ==2) {
			System.out.println("Tuesday");
			
		}
		
		if (dayValue ==3) {
			System.out.println("Wednesday");
	
		}//if
		
		if (dayValue ==4) {
			System.out.println("thurday");
			
		}//if
		
		//if dayValue is 1 or 2 or 3 or 4 or 5 then print "Weekday"
		//if dayValue id 1 or 2 or 3 or 5 then print "Weekday"
		
	//	if (dayValue ==1 || dayValue ==2  || dayValue ==3 || dayValue ==4 || dayValue == 5) {
	//		System.out.println("Weekday");
	//	}
		
		//if dayValue is 1 to 5 Print "Weekday"
		
		if (dayValue>=1 && dayValue<=5)
			System.out.println("Weekday");
		//if dayValue is 6 to 7 then print "Weekend"
		
		if (dayValue>=6 && dayValue<=7)  {
			System.out.println("Weekend");
		}//if
		
		if (dayValue==6 && dayValue==7) {  //For random version we must use OR
			System.out.println("Weekend");
		}//if 
		
		if (dayValue ==1) System.out.println("Monday");
		if (dayValue ==2) System.out.println("Tuesday");
		if (dayValue == 3) System.out.println("Wednesday");
		if (dayValue == 4) System.out.println("thurday");
		if (dayValue == 5) System.out.println("Friday");
		if (dayValue == 6) System.out.println("Saturday");
		if (dayValue == 7) System.out.println("Sunday");
		// here = sign is called assignment operator
		// == sign is called equal sign
		
	
		boolean isMarried;
		isMarried = false;
		
		if (isMarried ==true) System.out.println("Employee is Married");
		if (isMarried == false) System.out.println("Employee is Married");
		
		int n;
		n = 9;  //assignment operator
		if(n==1) System.out.println("One");
		if (n==2) System.out.println("Two");
		if (n==3) System.out.println("Three");
		if(n==4) System.out.println("Four");
		if (n==5) System.out.println("Five");
		if (n==6) System.out.println("Six");
		if (n==7) System.out.println("Seven");
		if (n==8) System.out.println("Eight");
		if (n==9) System.out.println("Nine");
		/*
		int x;
		x = 3;
		
		if(x==1) System.out.println("Odd number");
		if(x==3) System.out.println("Odd Number");
		if(x==5) System.out.println("Odd NUmber");
		if(x==7) System.out.println(" Odd Number");
		if (x==9) System.out.println("Odd number");
		
		int y;
		y = 2;
		if(y==1) {
			System.out.println("One");
			System.out.println("Odd Number");
		}//if
		
		if (y==2) {
			System.out.println("Two");
			System.out.println("Even number");
		}//if
		
		*/
		
		int w;
		w = 5;
		if (w==5 || w==7) System.out.println("Odd Number");
		
		 
		
		
	}//main

}//class
