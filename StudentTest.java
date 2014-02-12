public class StudentTest 
{
    public static void main(String[ ] args) 
    { 
    Student s1 = new Student("Richard Leibrant");
      
    s1.addQuiz(18);
    s1.addQuiz(20);
    s1.addQuiz(19);
    System.out.println(s1);
    
    Student s2 = new Student("Chris Hewitson");
    System.out.println(s2);
    
    Student s3 = new Student("Sara Eisner");
    s3.addQuiz(-18);
    s3.addQuiz(-20);
    s3.addQuiz(-19);
    System.out.println(s3);
    }
}
