package Corte2;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        GestionPersonal gestionPersonal = new GestionPersonal();

        do {
            System.out.println("----Menu ----");
            System.out.println("1. Agragar nuevo empleado");
            System.out.println("2. Calcular salario de empleado");
            System.out.println("3. General reporte de productividad");
            System.out.println("4. Mostar estructura jerarquica de la empresa");
            System.out.println("5. Generar reportes avanzados");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionPersonal.agregarEmpleado();

                    break;

                case 2:
                    String mensajeSalario = gestionPersonal.calcularSalario();
                    System.out.println(mensajeSalario);
                    break;

                case 3:
                    double productividad = gestionPersonal.calcularProductividad();
                    if (productividad > 0) {
                        System.out.println("La productividad del empleado es: " + " $ " + productividad + " La hora");
                    }

                    break;

                case 4:
                    System.out.println("Jerarquia de empleados");
                    break;

                case 5:
                    gestionPersonal.ReporteAvanzado();
                    break;

                case 6:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion no validad");

            }

        }while (opcion !=6);

    }

}
