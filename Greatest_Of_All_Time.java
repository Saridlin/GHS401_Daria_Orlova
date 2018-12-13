import javax.swing.JOptionPane;

public class Greatest_Of_All_Time
{
    public static void Greatest_Of_All_Time()
    {
        int nSize = Integer.parseInt(JOptionPane.showInputDialog("How many values would you like in the array? Please choose a number between 10 and 20."));
        
        while (nSize > 101 || nSize < 10){
            nSize = Integer.parseInt(JOptionPane.showInputDialog("How many values would you like in the array? Please choose a number between 10 and 20."));
        }
        
        int greatest = 10;
        int least = 100;
        
        int[] randArray = new int[nSize];
        
        for (int i = 0; i < randArray.length; i++){
            randArray[i] = (int)(Math.random()*91) + 10;
        }
        for (int i = 0; i < randArray.length; i++){
            System.out.print(randArray[i] + " ");
        }
        
        for (int i = 0; i < randArray.length; i++){
            if (greatest < randArray[i]){
                greatest = randArray[i];
            }
            if (least > randArray[i]){
                least = randArray[i];
            }
        }
        
        System.out.println("\n" + "greatest " + greatest + "\n" + "least " + least);
    }
}
