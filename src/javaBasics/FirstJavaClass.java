package javaBasics;

//import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {
		
//		Java is Case-Sensitive so, 's' and 'S' both have different meaning.
		
//		System.out.println("Hello World"); { We can make our own templates such as sysout then press ctrl + space }
		
//		Variable : Container to store data
		
//		Always use camelCase convention
		
//		Data Types : int(4 bytes), float, char, string, long(8 bytes), double, boolean, byte or short for small integer 
//		Ex: int 4 byte -> 32 bits -> 2 ^ 32 large number store in it if all positive, but to store both +ve or -ve
//		We take first bit to denote +ve or -ve numbers as most significant bit.
		
//      Primitive : It's value defined by Java and its size doesn't change.
//		Non-primitive: Size is vary, define by others
		
//		Rules to create Variable : 
//		1. We can only use Alpha-numeric Characters, Underscore and $ while making a variable.
//		2. It always start with alphabet,underscore or $
//		3. Not use keywords as Variable name
		
//		int age = 18;
//		float averageMarks = 19.345f; // bydefault value is double
//		char grade = 'A';
//		String firstName = "Dharmit";
//		boolean isValid = true;
//		long bigNumber = 98756483757684l; // specify l
	
//		Operators :
		
//		Arithmatic Operators : +, -, *, /, %, ++, --
	
//		a++; -> first use then increment { post-increment }
//		++a; -> first increment then use { pre-increment }
		
//		int firstNumber = 1234;
//		int secondNumber = 234;
//		int sum = firstNumber + secondNumber;
//		int a= 12;
//		a = a + 1;
//		a++;
//		a--;
//		System.out.println(a);
		
//		Type Casting : double sum = (double)firstNumber + (double)secondNumber;
		
//		Assignment Operators :  =, -=, +=, *=
//		Logical Operators : !, ||, &&
//		Conditional(ternary) Operator : Expression1? expression2: expression3;  
//		Comparison Operators : >, <, >=, <=, ==
//		Bitwise Operators : &, |, 
				
//		Taking User Input
//		Scanner sc = new Scanner(System.in); // Scanner class in JDK in java.util package
//		System.out.print("Enter your name : ");
//		String name = sc.nextLine();
//		System.out.println(name);
//		sc.close(); // To avoid memory leaks
//		nextInt(), nextByte(), nextLine() ->  String Input, nextShort(), nextFloat()
		
//		int age = 12;
//		if(age > 18) {
//			System.out.println("You can vote.");
//		}else {
//			System.out.println("You can not vote.");
//		}
		
//		String result = age > 18 ? "You can vote":"You can not vote.";
//		System.out.println(result);
		
//		boolean isEqual = 18 == 18;
//		System.out.println(isEqual);
//		System.out.println(19 != 18);
		
//		if-else { less efficient }
//		char grade = 'A';
//		if(grade == 'A') {
//			System.out.println("Your grade is very good.");
//		}else if(grade == 'B') {
//			System.out.println("Very Good, Keep learning.");
//		}else if(grade == 'C') {
//			System.out.println("Keep improving");
//		}else {
//			System.out.println("Invalid grade");
//		}
		
//		Switch Case { more efficient by comparison with cases }
//		char grade = 'C';
//		switch(grade) {
//		case 'A':
//			System.out.println("Your grade is very good.");
//			break;
//		case 'B':
//			System.out.println("Very Good, Keep learning.");
//			break;
//		case 'C':
//			System.out.println("Keep improving");
//			break;
//		default :
//			System.out.println("Invalid grade");
//		}
		
//		Logical Operator - To compare two things &&, ||, !
//		int age = 12;
//		if(age > 18 && age < 50) {
//			System.out.println("You can vote.");
//		}else {
//			System.out.println("You can not vote.");
//		}
		
//		Loops : for, while, do-while
		
//		break : To come out of the block/loop
//		continue : To skip current iteration
		
//		for -> When we know how many time loop runs 
//		for(;;) -> Infinite for-loop
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Anuj");
//		}
		
//		while (entry-control)-> When we don't know how many time loop runs
//		int a = 0;
//		while(a < 10) {
//			a++; 
//			if(a == 5) continue;
//			System.out.print(a + " ");
//		}

//		do-while (exit-control)-> It is run atleast once even condition is false , Don't generally used
//		int i = 1;
//		do {
//			System.out.print(i + " ");
//			i++;
//		}while(i >= 10);
		
//		Arrays (Data Structure): It stores collection of similar type of variable in one variable.
//		Store data in contiguous fashion from index 0 to N-1
//		Marks = 23, 12, 56, 34, 99
		
//		1st method :
//		int marks[] = new int[5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
		
//		2nd method :
//		int marks[] = {23, 12, 56, 34, 99, 12, 34};
//		
//		for(int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
//		Matrix : Create 2D Array
//		int a[][] = new int[3][3];
		
//		int a[][] = { {1,2,3},{3,4,5},{7,8,9} };
//	
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		Call static method
//		System.out.println(average(3,6));
		
//		Exception Handling
//		Exception is way of java telling that you are doing something wrong.
//		int marks[] = {23, 12, 56, 34, 99, 12, 34};
//		try {
////			System.out.println(marks[7]);
//			System.out.println(2/0);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Error aya tha...");
//			System.out.println(e.getLocalizedMessage());
//		}catch(ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage());
//		}catch(Exception e) {
//			System.out.println(e.getLocalizedMessage());
//		}
//		
//		System.out.println("Niche ki line");
		 		
	}
	
//	Methods : returnType functionName(arguments) { }
//	static means it belong to main class and we can call it without creating object of a class
//	static method only access static variables
	static int average(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum/2;
	}
	
	

}

