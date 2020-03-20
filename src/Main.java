public class Main {

    public static void main(String[] args) {
        Academico profe1 = new Academico("Alejandro","DIM",50,"Paper 1");
        System.out.println(profe1.toString());
        Persona estudiante1 = new Estudiante("Diego","Ing Electrica",23);
        estudiante1.comer();
        System.out.println(estudiante1.hacerLoSuyo());
        profe1.publicarPaper("Paper 2");
        System.out.println(profe1.toString());
        System.out.println(profe1.hacerLoSuyo());
    }
}
