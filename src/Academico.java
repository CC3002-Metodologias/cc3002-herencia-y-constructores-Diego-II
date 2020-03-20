public class Academico extends Persona{
    private String paper;
    public Academico(String nombre, String ocupacion, int edad,String Paper){
        super(nombre, ocupacion, edad);
        this.paper = Paper;
    }

    public String getPaper() {
        return paper;
    }

    @Override
    public String toString() {
        return "Tipo = Academico " +
                super.toString() +
                "paper='" + paper + '\'';
    }

    public void dormir(){
        System.out.println("ZzZzZzZ");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + " y Aprender ZOOM!!";
    }

    public void publicarPaper(String newPaper){
        this.paper = newPaper;
    }

}
