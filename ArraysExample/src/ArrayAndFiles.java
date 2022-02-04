import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayAndFiles
{
    public static void main(String[] args) throws IOException {
        int [] values= new int[12];

        int i=0;
        File file= new File("values.txt");

        if(file.exists())
        {
            Scanner inputfile =new Scanner(file);
            while(inputfile.hasNext() && i<values.length)
            {
                values[i]=inputfile.nextInt();
                i++;
            }
            inputfile.close();
            for(int value: values)
            {
                System.out.println(value);
            }
        }

    }
}
