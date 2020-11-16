package com.andeeni.alarmapp.games;

import java.util.*;
//will be invoked when the user choose to answer mental qn.
public class MentalQuestions {
    int ans;
    String qn;
    String defaultLine;
    String[] qnSet = {"5x + 3 = 28", "3x + 4 = 22", "11+5 = ?"};
    //hashmap to store the qn ans set.
    public HashMap<String, Integer> BasicqnAnsSet = new HashMap<>();

    public MentalQuestions(){
        BasicqnAnsSet.put("5x + 3 = 28",  5);
        BasicqnAnsSet.put("3x + 4 = 22", 6);
        BasicqnAnsSet.put("11+5 = ?", 16);
    }



    //generate an algebra qn
    public String GenerateAlgebraQn(){
        //generate a random number between 0 and basicqnAnsSet.size()-1
        Random randomAlgebraQ = new Random();
        int index = randomAlgebraQ.nextInt(qnSet.length);
        qn = qnSet[index];

        return qn;


    }
    // this method will be used to turn off the alarm.
    //if checkresult return true, the alarm will be off and a textview will be appeared, like, You won! Have a good day.
    public boolean checkResult(int userInputAlgebra){
        int correctAnsAlgebra = BasicqnAnsSet.get(qn);
        //check if the user's answer is correct
        if (correctAnsAlgebra == userInputAlgebra){
            return true;
        }
        //Assuming that the input text box only accepts the numbers
        //and cast the input to int
        else{
            return false;
        }
    }

}
