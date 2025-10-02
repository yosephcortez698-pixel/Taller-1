package Otros;

import Animales.Ave;
import Animales.Gato;
import Animales.Perro;
import Animales.Tejóndelamiel;

public class Main {

    public static void main(String[] args) {
        Ave ave1 = new Ave("loreta", 10, "yoseph", "rojo", "ave", "tucan");

        Perro perro1 = new Perro("oso", 11, "dylan", "marron", "perro", "brullinl");

        Gato gato1 = new Gato("gato", 20, "yes", "rojo", "gato", "tucan");

        Tejóndelamiel tejóndelamiel1 = new Tejóndelamiel("tejóndelamiel", 15, "marigen", "rojo", "tejóndelamiel",
                "tucan");

        // --- Nuevas líneas para imprimir la información completa ---
        System.out.println(ave1);
        System.out.println(perro1);
        System.out.println(gato1);
        System.out.println(tejóndelamiel1);
        System.out.println("--------------------");

        // Las llamadas a los sonidos siguen funcionando (si los métodos están
        // configurados para imprimir)
        perro1.haserSonido();
        ave1.haserSonido();
        gato1.haserSonido();
        tejóndelamiel1.haserSonido();
    }
}