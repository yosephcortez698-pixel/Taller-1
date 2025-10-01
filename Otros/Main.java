package Otros;

import Animales.Ave;
import Animales.Gato;
import Animales.Perro;
import Animales.Tejóndelamiel;

public class Main {

    public static void main(String[] args) {
        Ave ave1 = new Ave("loreta", 10, "yoseph", "rojo", "ave", "tucan");
        Perro perro1 = new Perro("oso", 10, "dylan", "marron", "perro", "brullinl");
        Gato gato1 = new Gato("gato", 10, "yoseph", "rojo", "gato", "tucan");
        Tejóndelamiel tejóndelamiel1 = new Tejóndelamiel("tejóndelamiel", 10, "yoseph", "rojo", "tejóndelamiel",
                "tucan");

        perro1.haserSonido();
        ave1.haserSonido();
        gato1.haserSonido();
        tejóndelamiel1.haserSonido();

    }
}