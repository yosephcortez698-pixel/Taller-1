public class Tejóndelamiel extends Animal {

    protected String nombre;
    protected int edad;
    protected String dueño;
    protected String color;
    protected String raza;
    protected String Tipo;

    public Tejóndelamiel(String nombre, int edad, String dueño, String color, String raza, String Tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
        this.color = color;
        this.raza = raza;
        this.Tipo = Tipo;
    }

    public void haserSonido() {
        System.out.println(" bufidos ");
    }
