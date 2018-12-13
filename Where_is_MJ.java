import javax.swing.JOptionPane;

public class Where_is_MJ
{
    public static void main(){
    
        String school = JOptionPane.showInputDialog("What school do you go to?");
        String mascot = JOptionPane.showInputDialog("What is the school mascot?");
        
        int username = 0;
        int password = 0;
        
        if (school.equals("Granada")){
            username = 1;
            
        }
        if (mascot.equals("Matadors")){
            password = 1;
        }
        if ((school.equals("Granada")) && (mascot.equals("Matadors"))){
            System.out.println("Access granted");
            
            String [] myArray =new String [4];
            myArray [0] = "Owl City";
            myArray [1] = "Micheal Jackson";
            myArray [2] = null;
            myArray [3] = "Mozart";
            
            for (int i=0; i<myArray.length; i++){
                if (myArray[i] == null){
                    
                    System.out.println("Element " + (i + 1) + " is empty(null).");
                    
                } else if (myArray[i].equals("Micheal Jackson")){
                    System.out.println("We found him. Element " + (i + 1) + " is Micheal Jackson");
                } else {
                    System.out.println("We did not find him. Element " + (i + 1) + " is " + myArray[i]);
                }
            }
            
            String fav = JOptionPane.showInputDialog("What is your favorite artist?");
            
            if (fav.equals("Twenty One Pilots")){
                System.out.println("We have the same taste in music!");
                
            } else {
                System.out.println("We don't have the same favorite artist.");
            }
        } else {
            if (username == 0){
                System.out.println("Wrong school :(");
                
            }
            if (password == 0){
                System.out.println("Wrong Mascot :(");
            }
        }
    }
}
