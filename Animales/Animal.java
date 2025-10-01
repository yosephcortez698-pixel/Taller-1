package Animales;

public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String dueño;
    protected String color;
    protected String raza;
    protected String Tipo;

    public Animal(String nombre, int edad, String dueño, String color, String raza, String Tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
        this.color = color;
        this.raza = raza;
        this.Tipo = Tipo;
    }

    public void haserSonido() {
        System.out.println("sondido");
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
}
