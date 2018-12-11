import javax.swing.JOptionPane;

public class Square_Range
{
    public static void Square_Range()
    {
       int number = 0;
       int numSquared = number*number;
       int randNum = 0;
       
       String random = "";
       
       for (int i = 1; i < 11; i++){
           number = i;
           //numberSquared = i*i;
           randNum = (int)(Math.random()*((i*i)-i + 1)) + i;
           
           if (randNum == i){
               random = "The random value is equal to the index";
            } 
           else if (randNum == (i*i)) {
               random = "The random value is equal to the square of the index";
            }
           
           System.out.println(i + "\t" + (i * i) + "\t" + randNum + "\t" + random);
           random = "";
        }
        
        
        
        String [] songs = new String [3];
        songs [0] = "song1";
        songs [1] = "song2";
        songs [2] = "song3";
        
        String [] movies = new String [4];
        movies [0] = "movie1";
        movies [1] = "movie2";
        movies [2] = "movie3";
        movies [3] = "movie4";
        
        for (int i = 0; i< songs.length; i++)
        {
            System.out.println(songs[i]);
        }
        
        int counter = 0;
        while (counter < movies.length)
        {
            if (counter <= (movies.length - 2)) {
                System.out.print(movies[counter] + ", ");
                counter++;
            } else {
                System.out.print(movies[counter]);
                counter++;
            }
        }
        
    }
}
