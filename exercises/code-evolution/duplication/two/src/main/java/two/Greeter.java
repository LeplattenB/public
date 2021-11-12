package two;

import java.util.Scanner;

public class Greeter {
	
	private static String askForArguments(String type) {
		Scanner s = new Scanner(System.in);
        System.out.println("Please enter your " + type + ":");
        String argument = s.next();
        s.close();
        return argument;
	}

    // prints: Nice to meet you Willy
    public static void askForFirstName() {
        String firstName = askForArguments("first name");
        System.out.println("Nice to meet you " + firstName);
    }

    // prints: Nice to meet you Wonka
    public static void askForLastName() {
        String lastName = askForArguments("last name");
        System.out.println("Nice to meet you " + lastName);
    }

    // prints: Nice to meet you Willy Wonka
    public static void askForFullName() {
    	String firstName = askForArguments("first name");
    	String lastName = askForArguments("last name");
        System.out.println("Nice to meet you " + firstName + " " + lastName);
    }

    // prints: Nice to meet you Willy Wonka (23 years old)
    public static void askForFullNameAndAge() {
    	String firstName = askForArguments("first name");
        String lastName = askForArguments("last name");
        String age = askForArguments("age");
        System.out.println("Nice to meet you " + firstName + " " + lastName + " (" + age + " years old)");
    }
}
