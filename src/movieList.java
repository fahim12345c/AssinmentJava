import java.io.File;
import java.util.Scanner;

public class movieList {
    public static String Game()   {
        String movie =null;
        try {
            File file = new File("movie.txt");
            Scanner myFile = new Scanner(file);
            String[] st=new String[100];
            int a = 0;
            while (myFile.hasNextLine()) {
                a++;
                st[a] = myFile.nextLine();
            }
            int b = random(a);
            movie=st[b];
            return movie;

        }
        catch (Exception e)
        {
            System.out.println("not found");
        }
        return movie;

    }
    public static  int random(int a)
    {
        int  index=(int)(Math.random()*(a+1));
        return index;

    }
}
