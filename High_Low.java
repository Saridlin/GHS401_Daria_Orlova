import javax.swing.JOptionPane;

public class High_Low
{
    public static void High_Low()
    {
        String size = JOptionPane.showInputDialog("How many random numbers would you like?");
        String low = JOptionPane.showInputDialog("Please enter a number");
        String high = JOptionPane.showInputDialog("Please enter a number higher than the previous one");
        
        int nLow = Integer.parseInt(low);
        int nHigh = Integer.parseInt(high);
        int range = nHigh - nLow;
        
        int nSize = Integer.parseInt(size);
        int[] randArray = new int[nSize];
        
        int odd = 0;
        int even = 0;
        
        if (nLow >= nHigh){
            System.out.println("ERROR: please make sure your second number is higher than the first.");
        } else {
            for (int i = 0; i < randArray.length; i++){
                randArray[i] = (int)(Math.random()*range) + nLow;
                
            }
            for (int i = 0; i < randArray.length; i++){
                String strVal = "";
                if (randArray[i] % 2 == 0){
                    //even
                    even++;
                    strVal = "even";
                } else {
                    //odd
                    odd++;
                    strVal = "odd";
                }
                
                System.out.println("Element #" + (i + 1) + " in the array is " + randArray[i] + " which is " + strVal + "."); 
            }
            
            System.out.println("The array has " + odd + " odd numbers and " + even + " even numbers.");
            
        }
        
    }
}
