package javaproject;

public class firstproject {

	public static void main(String[] args) {
		int x = 10;
		x += 5;
		System.out.println(x);
		
		String greeting = "H \bello";
		String a = "1";
		System.out.println(greeting + " " + greeting.length());
		System.out.println(a.toString());
		String firstname = "Rupam";
		String lastname = "Biswas";
		System.out.println(firstname + " "+ lastname);
		System.out.println(firstname+ " ".concat(lastname));
		String txt = "It\'s alright";
		System.out.println(txt);
		boolean a1 = true;
		int x1 =10;
		int y1=9;
		boolean z1 = x1 > y1;
		System.out.println(z1);
		if(x1<y1)
		{
			System.out.println("Good Morning");
		}
		else if (x1!=y1)
		{
			System.out.println("Good Day");
		}
		else
		{
			System.out.println("Good evening");
		}
		
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		int month = 3;
		switch (month) {
			case 1: 
				System.out.println("jan");
				break;
			case 2: 
				System.out.println("feb");
				break;
			case 3: 
				System.out.println("Mar");
				break;
			case 4: 
				System.out.println("Apr");
				break;
			case 5: 
				System.out.println("May");
				break;
		}
		
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
		
		for (int i1 = 0; i1 <= 10; i1 = i1 + 2) {
			  System.out.println(i1);
			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i2 : cars) {
		  System.out.println(i2);
		}
		
		for (int i5 = 0; i5 < 10; i5++) {
			  if (i5 == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		for (int i6 = 0; i6 < 10; i6++) {
			  if (i6 == 4) {
			    continue;
			  }
			  System.out.println(i6);
			}
		String [] car = {"a", "b", "c", "d"};
		System.out.println(car[0] + car.length);
		for(int i8=0; i8< car.length;i8++)
		{
			System.out.println(car[i8]);
		}
		
		for (String i10 : cars) {
			  System.out.println(i10);
			}
		
		
	    
	    try {
	        int[] myNumbers021 = {1, 2, 3};
	        System.out.println(myNumbers021[1]);
	      } 
	    catch (Exception rupam) {
	        System.out.println("Something went wrong.");
	      }
		
		System.exit(0);
	}
	
}
