package singleton;

import singleton.clases.Singleton;

public class Main {
    public static void main(String args[])
    {
        Singleton martin = Singleton.getSingleton("Martin");
        System.out.println(martin.getNombre());
        
        Singleton sebas = Singleton.getSingleton("Sebastian");
        System.out.println(sebas.getNombre());
    }
}
