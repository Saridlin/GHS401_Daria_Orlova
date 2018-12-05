import javax.swing.JOptionPane;

public class Hello
{
    public static void main(){
        
        
        int[] myArray = new int[12];
        
        for (int i=0; i<myArray.length; i++){
            
            myArray[i]=(int)(Math.random()*3) + 10;
            
        }
        
        
         for (int i=0; i<myArray.length; i++){
            
            System.out.println("the number is " + myArray[i]);
            
        }
        
        String name = JOptionPane.showInputDialog("What is your name?");
        
        if(name.equals("Daria")){
            
            System.out.println("Access granted");
            
        }
        else{
            
            System.out.println("denied");
            
        }
    }
}
