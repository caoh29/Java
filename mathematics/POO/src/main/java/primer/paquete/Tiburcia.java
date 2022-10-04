package primer.paquete;

public class Tiburcia
{

    // Propiedades

    private static int cantidad;
    private Boolean tiburciaMuerde;

    private  Boolean tiburciaSalta;

    private Boolean tiburciaVuela;

    private String name;

    // Metodos

    // Constructor default
    public Tiburcia()
    {
        tiburciaMuerde = true;
        tiburciaSalta = true;
        tiburciaVuela = false;
        name = "Dog";
        cantidad++;

    }

    // Nuevo constructor
    public Tiburcia(Boolean tiburciaMuerde, Boolean tiburciaSalta, Boolean tiburciaVuela, String name)
    {
        this.tiburciaMuerde = tiburciaMuerde;
        this.tiburciaSalta = tiburciaSalta;
        this.tiburciaVuela = tiburciaVuela;
        this.name = name;
        cantidad++;
    }

    // Getters and Setters

    public Boolean getTiburciaMuerde() {
        return tiburciaMuerde;
    }

    public void setTiburciaMuerde(Boolean tiburciaMuerde) {
        this.tiburciaMuerde = tiburciaMuerde;
    }

    public Boolean getTiburciaSalta() {
        return tiburciaSalta;
    }

    public void setTiburciaSalta(Boolean tiburciaSalta) {
        this.tiburciaSalta = tiburciaSalta;
    }

    public Boolean getTiburciaVuela() {
        return tiburciaVuela;
    }

    public void setTiburciaVuela(Boolean tiburciaVuela) {
        this.tiburciaVuela = tiburciaVuela;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCantidad() {
        return cantidad;
    }

    // ToString

    @Override
    public String toString() {
        return "Tiburcia{" +
                "tiburciaMuerde=" + tiburciaMuerde +
                ", tiburciaSalta=" + tiburciaSalta +
                ", tiburciaVuela=" + tiburciaVuela +
                ", name=" + name +
                '}';
    }
}
