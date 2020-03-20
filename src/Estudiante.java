public class Estudiante extends Persona{
    public Estudiante(String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }

    public void comer(){System.out.println("Ñom Ñom Gorbea!!");}

    public void dormir(){
        System.out.println("ZzZzZz");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "+ anime y Netflix!!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
