package primer.paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile
{

    public static void main (String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\crono\\Documents\\Agility Gold\\test.txt");

        if (file.exists())
        {
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file);

        output.println("Hola mundo");

        output.close();



    }

}
