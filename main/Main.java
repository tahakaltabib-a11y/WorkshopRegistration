
package main;

import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
    WorkshopRegistration workshop =
            new WorkshopRegistration();
    System.out.println("Enter the name: ");
    String name = input.nextLine();
    System.out.println("Enter the age: ");
    int age = input.nextInt();
      
    

    try {

        workshop.registerParticipant(name,age);

    } catch (InvalidAgeException e) {

        System.out.println(e.getMessage());

    }


    }
}


