// Programmers: Josue Sanchez
// Course: CS 212, Mr.John Nweke
// Due Date: 02/01/2024
//Lab Assignment: 3
// Problem Statement: Determine the distance and points for the user.
// Data In: Integers, strings
// Data Out: distance, points, how well they did
// Credits: Notes
import java.lang.Math;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What was your hill type: Normal or Large? ");
        String input = scan.next().toUpperCase();

        // Error check in order to determine if they put a valid input.
        while (!input.equals("NORMAL")  && !input.equals("LARGE")) {
            System.out.println("Invalid input, try again.");
            System.out.println("What was your hill type: Normal or Large? ");
            input = scan.next().toUpperCase();
        }

        // if their input was equal to normal, this will execute.
        if (input.equals("NORMAL")) {
            System.out.println("What was the you speed? ");
            double speed = scan.nextDouble();

            // Obtain user's speed which will be used to determine distance
            double airTime = Math.sqrt((2*46)/9.8);
            System.out.println(airTime);
            double distance = airTime * speed;
            System.out.println(distance);
            int par = 90;
            int points_per_meter = 2;

            // Calculate the points the user will receive and determine how well they did.
            int user_points = (int) ((int) 60 + (distance - par) * points_per_meter);
            if (user_points >= 61){
                System.out.println("Great job for doing better than par! ");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);
            }
            else if (user_points < 61 && user_points > 10) {
                System.out.println("Sorry you didn't go very far");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);

            }
            else if (user_points <= 10) {
                System.out.println("What Happened??");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);

            }
        }
        else if (input.equals("LARGE")){
            System.out.println("What was the you speed? ");
            double speed = scan.nextDouble();

            // Obtain user's speed which will be used to determine distance
            double airTime = Math.sqrt((2*70)/9.8);
            System.out.println(airTime);
            double distance = airTime * speed;
            int par = 120;
            double points_per_meter = 1.8;

            // Calculate the points the user will receive and determine how well they did.
            int user_points = (int) ((int) 60 + (distance - par) * points_per_meter);
            if (user_points >= 61){
                System.out.println("Great job for doing better than par! ");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);

            }
            else if (user_points < 61 && user_points > 10) {
                System.out.println("Sorry you didn't go very far");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);

            }
            else if (user_points <= 10) {
                System.out.println("What Happened??");
                System.out.println("Points: " + user_points);
                System.out.println("Distance: " + distance);

            }
        }

    }
}
