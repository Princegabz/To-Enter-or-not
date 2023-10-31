/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toenterornot;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ToEnterOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int Age;
        Age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Age","Name Required",JOptionPane.QUESTION_MESSAGE));
       
        if(Age<18)
        {
            JOptionPane.showMessageDialog(null,"You are too young to enter! Entry Denied");
            System.exit(0);
        }
        else if (Age>18 && Age<35)
        {
           JOptionPane.showMessageDialog(null,"You are of age! Entry Allowed");
        }
        else if (Age>=35)
        {
           JOptionPane.showMessageDialog(null,"You are Too OLD! Entry Denied");
            System.exit(0);
        }
        
        String Gender;
        Gender = JOptionPane.showInputDialog(null,"Enter your Gender","Gender Required",JOptionPane.QUESTION_MESSAGE);
        if(Gender.equals("female"))
        {
            JOptionPane.showMessageDialog(null,"You have free entry proceed");
        }
        else
        {
           JOptionPane.showMessageDialog(null,"Please pay R10 person");
           
           int AmountOfPeople;
           AmountOfPeople = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of male guests","Number Required",JOptionPane.QUESTION_MESSAGE));
           
           JOptionPane.showMessageDialog(null,"Amount paybale for all your guests combined is: "+10*AmountOfPeople);
        }
    }
    
}
