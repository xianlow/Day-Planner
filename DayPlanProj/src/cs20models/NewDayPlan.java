package cs20models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import cs20viewcontroller.*;

/**
 * A class to model the problem or situation your program solves
 * 
 * @author cheng
 */

public class NewDayPlan{

    private double question1;
    private double question2;
    private double question3;
    private double question4;
    private double question5;
    private double addUp;
    private double total;
    private int questionsAsked;
    String[] schoolQuestions;
    int questionsCount;
    private String[] hints;
    private String questionsHours;
    private String saveTotal;
    private String hintTotal;
    

    public NewDayPlan(){
        this.hintTotal = "";
        this.saveTotal = "";
        this.questionsHours = "";
        
        
        this.questionsCount = 0;
        
        this.schoolQuestions = new String[1000];
        this.schoolQuestions[0] = "How long do you sleep for?";
        this.schoolQuestions[1] = "How long do you stay at school?";
        this.schoolQuestions[2] = "How long do you have free time for?";
        this.schoolQuestions[3] = "How long does it take to eat your meals?";
        this.schoolQuestions[4] = "How long does it take to prepare for school?";
        
        this.hints = new String[1000];
        this.hints[0] = "Do you have enough sleep? A study says that you need at least 8 hours of sleep";
        this.hints[1] = "Are you skipping school? A normal school day is 8 hours";
        this.hints[2] = "Are you having proper time to rest? Scheduling for free time is helpful \n "
                + "in many ways such as improving work quality.";
        this.hints[3] = "Are you sure you are eating proper meals? It is recomended that you have atleast "
                + "1 hour to fully digest your meal.";
        this.hints[4] = "Why does it take so long to prepare? The average time for "
                + "people to get ready for school is at max two hours";
        
    }
    

    
    public String getHints(int x){
        return this.hints[x];
    }
    
    public String getQuestions(int x){
        return this.schoolQuestions[x];
    }

    public double getAddUp(){
        return this.addUp;
    }
    public void setAddUp(double x){
        this.addUp = x;
    }
    
    public double getTotal(){
        return this.total;
    }
    public void setTotal(double x){
        this.total = x;
    }

    public String setQuestion(int x){
        return this.schoolQuestions[x];
    }
    
    public void getQuestionsAsked(){
        this.questionsAsked++;
    }
    
    public int setQuestionsAsked(){
        return questionsAsked;
    }
    
    public String setHints(int x){
        return this.hints[x];
    }
    
    public void setQuestion1(double x){
        this.question1 = x;
    }
    public double getQuestion1(){
        return this.question1;
    }
    public void setQuestion2(double x){
        this.question2 = x;
    }
    public double getQuestion2(){
        return this.question2;
    }
    public void setQuestion3(double x){
        this.question3 = x;
    }
    public double getQuestion3(){
        return this.question3;
    }
    public void setQuestion4(double x){
        this.question4 = x;
    }
    public double getQuestion4(){
        return this.question4;
    }
    public void setQuestion5(double x){
        this.question5 = x;
    }
    public double getQuestion5(){
        return this.question5;
    }
    

    
    public void setSaveString(String x){
        this.questionsHours = x + " " + this.addUp + " hours";
        this.saveTotal += this.questionsHours + "\n";
        
    }
    public String getSaveString(){
        return this.questionsHours;
    }
    
    public void setHintTotal(String x){
        this.hintTotal = x ;
    }
    public String getHintTotal(){
        return this.hintTotal;
    }
    
    
    public void saveToFile(String pathToFile) throws IOException{
        
        FileWriter fw = new FileWriter(pathToFile);
        PrintWriter pw = new PrintWriter(fw);
        String saveStr = this.saveTotal;
        pw.print(saveStr);
        pw.close();
    }

}