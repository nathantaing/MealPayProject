import java.util.ArrayList;

public class Roster {


    //Fields

    ArrayList<Student> students = new ArrayList<Student>();

    //Constructors

    public Roster(){

    }

    //Methods

    public ArrayList<String> getTransactions(int month, int day){
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++){
            ArrayList<Transaction> studentOnDate = students.get(i).getTransactionByDate(month, day);
           if(studentOnDate != null){
                for(int j = 0; j < studentOnDate.size(); j++){
                    result.add(studentOnDate.get(j) + "by " + students.get(i).getName() + " ID: " + students.get(i).getIdNo());
           } 
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

    public void addStudent(Student s){
        students.add(s);
    }

public String toString(){
    return "Students: " + students;
}

}
