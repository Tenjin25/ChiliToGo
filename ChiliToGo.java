//:Name: Shamar Davis
//Date: June 2,2025
//Purpose: This program calculates the total revenue from adult and child meals sold at a fundraiser conduced by the Huntington Boys and Girls Club.

//input
//Enter the number of adult meals numAdultMeals int
//Enter the number of child meals numChildMeals int
//processing
//Calculate the quantity of adult and child meals along with total price totalRevenue double
//output
//The total revenue from adult meals is: 
//The total revenue from adult meals is:
//The total combined revenue is:

import java.util.Scanner;

public class ChiliToGo
{
   
    public static void main (String[] args)
    {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of adult meals: ");
            int numAdultMeals = input.nextInt();
            
            System.out.print("Enter the number of child meals: ");
            int numChildMeals = input.nextInt();
            
            double totalAdultRevenue = numAdultMeals * 7.00;
            double totalChildRevenue = numChildMeals * 4.00;
            double totalRevenue = totalAdultRevenue + totalChildRevenue;
            
            System.out.println("");
            System.out.println("");
            System.out.println("The total revenue from adult meals is: $" + totalAdultRevenue);
            System.out.println("The total revenue from child meals is: $" + totalChildRevenue);
            System.out.println("The total combined revenue is: $" + totalRevenue);
            input.close();
    }
}