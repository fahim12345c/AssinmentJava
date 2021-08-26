import sun.awt.geom.AreaOp;

import javax.xml.soap.SOAPPart;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class MovieGuess {
    public static void main(String[] args) {

       String title=movieList.Game();
       char[] ch=new char[title.length()];
       //System.out.println(title);
        for(int i=0;i<title.length();i++)
        {
            if(title.charAt(i)==' ')
            {
                ch[i]=title.charAt(i);
            }
            else
            {
                ch[i]='_';
            }

        }

        Scanner scan=new Scanner(System.in);
       int point =10;int w=0,x=0;
       char[] wh=new char[100];
       boolean lose=true;
       while (point>0)
       {
           String guess=new String(ch);
           String wrong =new String(wh);

           System.out.println("You are gussing:"+guess);
           System.out.println("You have guessed("+w+")wrong letters:"+wrong);
           System.out.println("Guess a letter:");
           char c= scan.next().charAt(0);
           boolean bool=false;
           for(int i=0;i<title.length();i++)
           {

               if(title.charAt(i)==c && ch[i]=='_') {
                   point++;
                   x++;
                   ch[i] = c;
                   bool = true;
               }
               if(title.charAt(i)==' ')
               {
                   x++;
               }
           }
           if(bool==false)
           {
               w++;
               wh[w]=c;
           }

           if (x>=title.length())
           {
               lose=false;
               System.out.println("Win The Game");
               break;
           }
            String win=new String(ch);

           System.out.println(x);

       }
       if(lose)
       {
           System.out.println("Lose The Game");
       }


    }


}
