import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso, altura;
        try {
            System.out.print("Digita tu nombre: ");
            nombre = sc.nextLine();
            System.out.print("Digita tu peso en Kg: ");
            peso = sc.nextDouble();
            System.out.print("Digita tu altura en M: ");
            altura = sc.nextDouble();
            Persona persona1 = new Persona(nombre, peso, altura);
            persona1.IMC();
        } catch (Exception e) {
            System.out.println("Error: Asegúrate de ingresar valores correctos para peso y altura.");
        }
    }
}
