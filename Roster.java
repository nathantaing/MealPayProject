import java.util.ArrayList;

public class Roster {


    //Fields

    ArrayList<Student> students = new ArrayList<Student>();



    //Constructors

    public Roster(){

    }


    //Methods

    public ArrayList<ArrayList<Transaction>> getTransactions(int month, int day){
        ArrayList<ArrayList<Transaction>> result = new ArrayList<ArrayList<Transaction>>();
        for (int i = 0; i < students.size(); i++){
           if(students.get(i).getTransactionByDate(month, day) != null){
            result.add(students.get(i).getTransactionByDate(month, day));
           } 
            
    }
        return result;
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
       Student Mark = new Student("Mark");
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getIdNo() == idNumber){
                Mark = students.get(i);
            }
        }
        return Mark;
    }

}
