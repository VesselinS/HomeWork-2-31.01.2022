package qa.automation;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args)
    {
        String firstname = "Vesselin";
        String str = "My name is " + firstname;

        //writes the text in the console
        System.out.println("Please write your first name:");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user
        String firstName = scanner.nextLine();

        // Replace 'firstname' with new 'firstName'.
        String new_str = str.replaceAll(firstname, firstName);

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
        System.out.println("--------------------------------");

        //writes the text in the console
        System.out.println("Please write your first name: ");

        //a string variable that will store the value entered from the user
        String firstName1 = scanner.nextLine();

        //writes the text in the console
        System.out.println("Please write again your first name: ");

        //a string variable that will store the value entered from the user
        String lastName = scanner.nextLine();

        // Display the strings for comparison.
        System.out.println(firstName1.equals(lastName));
        System.out.println("--------------------------------");

        //writes the text in the console
        System.out.println("Please write one sentence:");

        //a string variable that will store the value entered from the user
        String stringText = scanner.nextLine();

        String [] stringArray = stringText.split(" ");
        System.out.println( "\""+stringText + "\"" + " has " + stringArray.length + " words.");
        System.out.println("--------------------------------");

        //writes the text in the console
        System.out.println("Please write your first name: ");

        //a string variable that will store the value entered from the user
        String firstName11 = scanner.nextLine();

        //writes the text in the console
        System.out.println("Please write your middle name: ");

        //a string variable that will store the value entered from the user
        String middleName = scanner.nextLine();

        //writes the text in the console
        System.out.println("Please write your last name: ");

        //a string variable that will store the value entered from the user
        String lastName1 = scanner.nextLine();

        System.out.println(firstName11 + " " + middleName + " " + lastName1);
    }
}