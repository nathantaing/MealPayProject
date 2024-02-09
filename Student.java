import java.util.ArrayList;

public class Student {
    


    //fields

    private String name;
    private int idNo;
    private static int idGen;
    private double balance;
    ArrayList<Transaction> charges = new ArrayList<Transaction>();


    //constructors

    public Student(String myName){
		idNo = idGen;
		idGen++;
        name = myName;
        balance = 0;
    }

    //methods

    public void addFunds(int month, int day, int idNo, double amount){
        Transaction inherit = new Transaction(month, day, idNo);
        balance += amount;
        charges.add(inherit);
    }


    public void chargeMeal(int month, int day, int idNo){
        Transaction yoink = new Transaction(month, day, idNo);
        balance-=7.0;
        charges.add(yoink);
    }

    public String toString(){
        return "Student: " + name + ", ID: " + idNo + ", Balance: " + balance + ", Transaction: " + charges.toString();
    }

    public ArrayList<Transaction> getTransactionByDate(int month, int day){
        ArrayList<Transaction> inADay = new ArrayList<Transaction>();
        for (int i = 0; i < charges.size(); i++){
            if ((charges.get(i).getMonth() == month) && (charges.get(i).getDay() == day)){
                inADay.add(charges.get(i));
            }
        }
        if (inADay.size() == 0){
            return null;
        } else {
            return inADay;
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getIdNo(){
        return idNo;
    }
}
