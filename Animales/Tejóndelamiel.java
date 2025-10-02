package Animales;

public class Tejóndelamiel extends Animal {

    public Tejóndelamiel(String nombre, int edad, String dueño, String color, String raza, String Tipo) {
        super(nombre, edad, dueño, color, raza, Tipo);
    }

    @Override
    public void haserSonido() {
        System.out.println(" Grag Grag Grag ");
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getdueño() {
        return dueño;
    }

    public void setdueño(String dueño) {
        this.dueño = dueño;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getraza() {
        return raza;
    }

    public void setraza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Tejondelamiel [Nombre=" + getnombre() + ", Edad=" + getedad() + ", Dueño=" + getdueño() + ", Color="
                + getcolor() + ", Raza=" + getraza() + "]";
    }
}