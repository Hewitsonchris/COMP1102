import java.io.FileReader;  
import java.util.Arrays; 
import java.util.Scanner;

public class StudentDataReader
{



public static void main(String[] args) throws Exception 
    {
    Scanner myScanner = new Scanner(new FileReader(
            "C://data.txt"));

    Student [] studentArray;

    String id;
    int score = 0;
    double average = 0;

    int numStudents = 100;
    studentArray = new Student[numStudents];

    for (int i=0; i< numStudents; i++)
    {
        while (myScanner.hasNext())
        {
            id = myScanner.next();
            score = myScanner.nextInt();
            System.out.println("Student " + id + " " + score);
            studentArray[i] = new Student(id, score);
        }
    }
        
        double sum = 0.0;
        sum += score;
        average = sum/numStudents;
        System.out.println("Average score for the class: " + average);
    }
}
        
     
    
  
