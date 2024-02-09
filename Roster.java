import java.util.ArrayList;

public class Roster {


    //Fields

    ArrayList<Student> students = new ArrayList<Student>();



    //Constructors

    public Roster(){

    }


    //Methods

    public ArrayList<Transaction> getTransactions(int month, int day){
        charges.getTransactionsByDate(month, day);
    }


    public ArrayList<Student> isNegative(){
        ArrayList<Student> negative = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getBalance() < 0){
                negative.add(students.get(i));
            }
        }
        return negative;
    }

    public Student hasIdNo(int idNumber){
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getIdNo() == idNumber){
                return students.get(i);
            }
        }
    }

}
