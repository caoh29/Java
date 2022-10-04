package primer.paquete;


import java.io.*;

public class ReadFromFile
{

    public static void main (String[] args) throws IOException
    {

        File file = new File("C:\\Users\\crono\\Documents\\Agility Gold\\pequenoCachorros.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br2 = new BufferedReader(new FileReader(file));

        while (true)
        {
            String input = br.readLine();
            String newLine = br2.readLine();

            if (newLine == null )
            {
                break;
            }
            System.out.println(input);

        }


    }

}
