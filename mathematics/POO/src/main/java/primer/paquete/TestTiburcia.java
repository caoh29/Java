package primer.paquete;


public class TestTiburcia
{

    public static void main (String[] args)
    {

        //create an Object
        Tiburcia dog = new Tiburcia();
        Tiburcia chloe = new Tiburcia(true,false,false,"Chloe");
        Tiburcia liz = new Tiburcia(false,true,false,"Liz");


        System.out.println(dog.toString());
        System.out.println(chloe.toString());
        System.out.println(liz.toString());


        System.out.println("Hay "+Tiburcia.getCantidad()+" objetos");



    }

}
