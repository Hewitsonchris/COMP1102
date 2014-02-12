public class Student 
{ 
 private String name;
 private int totalScore;
 private int scoreCount;
 
 
 public void addQuiz(int score) 
 { 
    totalScore += score;
    scoreCount++;
 } 
 public String getName() 
 { 
    return name;
    
 }
 public int getTotalScore() 
 { 
    return scoreCount;
 } 
 public double getAverageScore() 
 { 
     if (scoreCount == 0 || totalScore <= 0)
     {
        return 0.0;
     }
     else
         return (totalScore/scoreCount);
     
 } 
 
 public String toString() 
 {
      return "Name: " + getName() +
         "\n  Total number of Quizes: " + scoreCount +
         "\n  Average Score (/20): " + getAverageScore();
 }
 
 /* Constructor */ 
 public Student(String thisName) 
 { 
    name = thisName;
    totalScore = 0;
    scoreCount =  0;
 } 
 }
