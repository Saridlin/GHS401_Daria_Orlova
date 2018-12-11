import javax.swing.JOptionPane;

public class Getting_To_The_Roots
{
    public static void Getting_To_The_Roots()
    {
        final String strPrompt = "For the equation \"ax^2 + bx + c = 0\", please enter coefficient ";
        //String strA = JOptionPane.showInputDialog(strPrompt + "\"a\":");
        //String strB = JOptionPane.showInputDialog(strPrompt + "\"b\":");
        //String strC = JOptionPane.showInputDialog(strPrompt + "\"c\":");
        
        //int nA = Integer.parseInt(strA);
        //int nB = Integer.parseInt(strB);
        //int nC = Integer.parseInt(strC);
        
        int nA = Enter_Integer(strPrompt + "\"a\":");
        int nB = Enter_Integer(strPrompt + "\"b\":");
        int nC = Enter_Integer(strPrompt + "\"c\":");
        
        int nDisc = (nB*nB) - (4*nA*nC);
        
        double posRoot = (nB * (-1) + Math.sqrt(nDisc)) / (2*nA);
        double negRoot = (nB * (-1) - Math.sqrt(nDisc)) / (2*nA);
        
        System.out.println("The value of \"b^2\" is " + (nB*nB) + ".");
        System.out.println("The value of \"4*a*c\" is " + (4*nA*nC) + ".");
        
        if (nDisc >= 0){
            System.out.println("The value of the square root of \"b^2- 4*a*c\" is " + Math.sqrt(nDisc) + ".");
            
            System.out.println("The first root of your equation is " + posRoot + ".");
            System.out.println("The second root of your equation is " + negRoot + ".");
        } else {
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now.");
        }
    }
    
    private static int Enter_Integer(String strPrompt)
    {
        int nResult = 0;
        while (true){
            try {
                String strA = JOptionPane.showInputDialog(strPrompt);
                nResult = Integer.parseInt(strA);
            } catch (Exception e){
                //Error message here 
                //JOptionPane.showMessageDialog(null, "Please enter a valid integer", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            return nResult;
        }
    }
}
