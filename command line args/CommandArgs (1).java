
/**
 * Write a description of class CommandArgs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;

public class CommandArgs
{
    public static void main(String[] args) throws IOException
    {

        Scanner file;
        PrintWriter pw;

        if(args.length != 2)
        {
            System.out.println("You need 2 arguments, two strings for file names.  input file and output file");
        }
        else
        {
            file = new Scanner(new File(args[0]));
            pw = new PrintWriter(args[1]);

            while(file.hasNext())
            {

                pw.println(file.nextLine());

            }
            pw.close();
            file.close();
        }
    }

}
