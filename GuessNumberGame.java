

57
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 
 */
public class GuessNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randomValue = new Random();

     int minNumber =1;
     int maxNumber=100;
      
     int computerNo = randomValue.nextInt(maxNumber - minNumber + 1);
     //
     
             int attemptsNum=0;
             final int maxAttempts = 30;
                
     while(attemptsNum < maxAttempts){

                 int userNumber= Integer.parseInt(JOptionPane.showInputDialog(null, "  Welcome to Our Number Guessing game!!! "
                         + "\n  You have 30 attempts!!!! "
                         + "\n  Guess any number between 1 and 100 :"));
                 
                 if (userNumber < minNumber || userNumber> maxNumber )
               {
                   JOptionPane.showMessageDialog(null," Please enter a number between 1  and 100");
                   continue;
               }
                 
                 attemptsNum++;
                 
                 
                 
                 
                 if (userNumber == computerNo )
                 {
                 
                    JOptionPane.showMessageDialog(null,"Congradulations!!!! you guessed the correct Number");
                       
                      if ( computerNo % 2 == 0){
                      JOptionPane.showMessageDialog(null, "Our correct number is even:" + computerNo);
                      }
                      else{
                              JOptionPane.showMessageDialog(null,"Our correct number is odd:" + computerNo);
                              }
                    break;
                 }
                 else 
                 
                   if( userNumber < computerNo ){
                       
                       JOptionPane.showMessageDialog(null," Sorry the Number you guessed is Less than Generated number , so try again " );
                     
                   }else{ 
                       
                       JOptionPane.showMessageDialog(null," Sorry the Number you guessed is Greater than Generated number , so try again " );
                    }
                    
              
                    
                 
     }
                          JOptionPane.showMessageDialog(null,"Total Guessing Attempts :" + attemptsNum );
     
            if (attemptsNum == maxAttempts)    
            {
             JOptionPane.showMessageDialog(null,"Sorry!!!You have exhausted your  attempts and  our Correct Number is :" +  computerNo );
            }
                 
           
                  
}  
}

        
        
    
    

