import java.util.ArrayList;

public class MealPayRunner {
    public static void main(String[] args) {
       
        System.out.println("Welcome to the MealPay program!");

        ArrayList<Student> school = new ArrayList<Student>();

        System.out.println("Adding students to the program...");
        
        Student bobbyBobbs1 = new Student("Bobby Bobbs");
        Student joeSchmo = new Student("Joe Schmo");
        Student kellyShelly = new Student("Kelly Shelly");
        Student bobbyBobbs2 = new Student("Bobby Bobbs");

        school.add(bobbyBobbs1);
        school.add(joeSchmo);
        school.add(kellyShelly);
        school.add(bobbyBobbs2);

        school.toString();

        System.out.println("Adding some funds and making some purchases...");
        bobbyBobbs1.chargeMeal(2, 4, 1);
        bobbyBobbs1.chargeMeal(2, 4, 1);
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

        school.toString();


    }
}
