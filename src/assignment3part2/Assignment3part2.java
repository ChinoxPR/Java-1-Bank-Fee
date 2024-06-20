/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3part2;
//imported so program can use imput in my program
import javax.swing.JOptionPane;
/**
 *
 * @author John Hernandez 06/07/2024
 */
public class Assignment3part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //DECLARING VARAIABLES
        int checks;
        double fees;
        double totalFee;
        int baseFee = 10;
        
        
        
        //INPUT
        String str = JOptionPane.showInputDialog("How many checks written for the month");
        checks = Integer.parseInt(str);
        
        // USEING IF ELSE-IF STATEMENT FOR CHECKS
        // EACH STATEMENT HAS STATIC FEE'S AND CALCULATION'S FOR OUTPUT 
        if(checks < 20 )
        {
            fees = .10;
            totalFee = fees + baseFee;
            System.out.println("Bank Service fee's for the month: $"+ totalFee);
        }
        else if(20 <= checks && checks < 40)
        {
             fees = .08;
            totalFee = fees + baseFee;
            System.out.println("Bank Service fee's for the month: $"+ totalFee);
        }
        else if(40 <= checks && checks < 60)
        {
             fees = .06;
            totalFee = fees + baseFee;
            System.out.println("Bank Service fee's for the month: $"+ totalFee);
        }
        else if(checks >= 60)
        {
             fees = .04;
            totalFee = fees + baseFee;
            System.out.println("Bank Service fee's for the month: $"+ totalFee);
        }
        else 
        {
            System.out.println("Somthing went wrong please enter number next time");
        }
               
    }
    
}
