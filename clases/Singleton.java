package singleton.clases;

public class Singleton {
    private String nombre;
    private static Singleton singleton;

    private Singleton(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public static Singleton getSingleton(String nombre) 
    {
        if(singleton == null) 
        {
            singleton = new Singleton(nombre);
        }
        else 
        {
            System.out.println("ERROR - El metodo ya existe por lo que no se puede");
        }
        return singleton;
    }
}