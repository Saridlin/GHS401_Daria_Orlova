import javax.swing.JOptionPane;

public class Fibonacci_Fun
{
    public static void Fibonacci_Fun()
    {
       /*
        * To make columns, write everything that lines up in one row
        * place tabs (\t) in the sequence to properly space them out
        * 
        * Need: 
        * Possibly 2 Arrays
        * Keep a Running total through an extra variable (add array values)
        * 
        */
       
       String strFib = JOptionPane.showInputDialog("How many Fibonacci numbers do you want to see?");
       int numFib = Integer.parseInt(strFib);
       
       int[] numbers = new int[numFib];
       
       int[] fibonacci = new int[numFib];
       fibonacci[0] = 0;
       fibonacci[1] = 1;
       
       int runningTotal = 0;
       
       for (int i = 0; i < numFib; i++){
           numbers[i] = i + 1;
       }
       for (int i = 2; i < numFib; i++){
           fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
       }
       
       System.out.println("Index \t Fib Num. \t Running Total");
       
       for (int i = 0; i < numFib; i++){
           runningTotal = fibonacci[i] + runningTotal;
           System.out.println(numbers[i] + "\t " + fibonacci[i] + "\t \t " + runningTotal);
       }
    }
}
