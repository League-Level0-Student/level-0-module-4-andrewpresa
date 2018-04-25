//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
     int response = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
      if(response==0) {isWeekday=true;
 }
      if(isWeekday==true) {
    	  JOptionPane.showMessageDialog(null,"Get up Lazybones");
    	  
      }
      if(response==1) {isVacation=true;
      }
           if(isVacation==true) {
         	  JOptionPane.showMessageDialog(null,"sleep in");
         	  
           }
      }
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    


        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }


