public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String nombre, String ocupacion, int edad){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("zZzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "CUARENTENA!";
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Ocupacion='" + ocupacion + '\'' +
                ", Edad=" + edad;
    }
}
