public class Transaction{
    
    //fields
    private int month;
    private int day;
    private double charge;

    //constructors

    public Transaction(int myMonth, int myDay, double myCharge){
        month = myMonth;
        day = myDay;
        charge = myCharge;
    }


    //methods
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public double getCharge(){
        return charge;
    }

    public String toString(){
        return "(" + month + "/" + day + ", " + charge + ") ";
    }
}