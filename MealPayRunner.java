import java.util.ArrayList;

public class MealPayRunner {
    public static void main(String[] args) {
       
        System.out.println("Welcome to the MealPay program!");

       Roster school = new Roster();

        System.out.println("Adding students to the program...");
        
        Student bobbyBobbs1 = new Student("Bobby Bobbs");
        Student joeSchmo = new Student("Joe Schmo");
        Student kellyShelly = new Student("Kelly Shelly");
        Student bobbyBobbs2 = new Student("Bobby Bobbs");

        school.addStudent(bobbyBobbs1);
        school.addStudent(joeSchmo);
        school.addStudent(kellyShelly);
        school.addStudent(bobbyBobbs2);

        System.out.println();

        System.out.println("Displaying students...");
        System.out.println(school.toString());
        System.out.println();

        System.out.println("Adding some funds and making some purchases...");
        bobbyBobbs1.chargeMeal(2, 4, 1);
        bobbyBobbs1.chargeMeal(2, 6, 1);
        joeSchmo.addFunds(2, 4, 2, 40);
        joeSchmo.chargeMeal(2, 5, 2);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 4, 3);
        kellyShelly.chargeMeal(2, 8, 3);
        kellyShelly.chargeMeal(2, 8, 3);
        bobbyBobbs2.addFunds(2, 9, 4, 5);
        bobbyBobbs2.addFunds(2, 9, 4, 5);

        System.out.println(school.toString());
        System.out.println();

System.out.println("Displaying just those with negative balances...");
        System.out.println(school.isNegative().toString());;
        System.out.println();

        System.out.println("Looking for student with ID number of 2:");
        System.out.println(school.hasIdNo(2).toString());;
        System.out.println();

        System.out.println("Displaying all transaction on 2/4...");
        System.out.println(school.getTransactions(2, 4).toString());;


    }
}
