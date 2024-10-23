public class Persona {
    private String nombre;
    private double peso;
    private double altura;

    public Persona(String nombre, double peso, double altura){
        this.altura = altura;
        this.nombre = nombre;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void IMC(){
        double imc = peso / (altura * altura);
        String categoria;
        if (imc < 18.5) {
            categoria = "BAJO PESO";
        } else if (imc >= 18.5 && imc < 25) {
            categoria = "PESO NORMAL";
        } else if (imc >= 25 && imc < 30) {
            categoria = "SOBREPESO";
        } else if (imc >= 30 && imc < 35) {
            categoria = "OBESIDAD TIPO 1";
        } else if (imc >= 35 && imc < 40) {
            categoria = "OBESIDAD TIPO 2";
        } else {
            categoria = "OBESIDAD TIPO 3";
        }
        System.out.println("Hola " + nombre + " tu IMC es igual a : " + imc + "\n" +
                "Por lo que tienes " + categoria);
    }
}
