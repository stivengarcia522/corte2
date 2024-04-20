package Corte2;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionPersonal {

     private ArrayList<Empleado> empleados;
     private Scanner scanner;


     public GestionPersonal() {
          this.empleados = new ArrayList<Empleado>();
          this.scanner = new Scanner(System.in);
     }
          public void agregarEmpleado(){
               System.out.println("Ingrese el ID del empleado");
               int ID = scanner.nextInt();
               scanner.nextLine();

               System.out.println("Ingrese el nombre del empleado");
               String nombre = scanner.nextLine();

               System.out.println("Ingrese el apellido del trabajador");
               String apellido = scanner.nextLine();

               System.out.println("Ingrese el cargo del empleado");
               String cargo = scanner.nextLine();

               System.out.println("Ingrese el salario del empleado");
               double salario = scanner.nextDouble();
               scanner.nextLine();

               System.out.println("ingrese el departamento del empleado");
               String departamento = scanner.nextLine();

               Empleado nuevoEmpleado = new Empleado();
               nuevoEmpleado.setID(ID);
               nuevoEmpleado.setNombre(nombre);
               nuevoEmpleado.setApellido(apellido);
               nuevoEmpleado.setCargo(cargo);
               nuevoEmpleado.setSalario(salario);
               nuevoEmpleado.setDepartamento(departamento);

               empleados.add(nuevoEmpleado);
               System.out.println("Empleado agreago exitosamente");

          }

          public String calcularSalario(){
               System.out.println("ingrese el ID del empleado");
               int idEmpleado = scanner.nextInt();
               scanner.nextLine();

          for (Empleado empleado : empleados) {
               if(empleado.getID() == idEmpleado){
                    return "El salario del empleado es: " + Double.toString(empleado.getSalario());
               }
                        }
          return "Empleado no encontrado";
          }


          public double calcularProductividad() {
           System.out.println("Ingrese el ID del empleado para calcular productividad:");
           int idEmpleado = scanner.nextInt();
           scanner.nextLine();

            for (Empleado empleado : empleados) {
               if(empleado.getID() == idEmpleado){
                    System.out.println("Ingrese las horas trabajadas por el empleado:");
                    int horasTrabajadas = scanner.nextInt();
                    scanner.nextLine();

                    if (horasTrabajadas <= 0) {
                         System.out.println("Las horas trabajadas deben ser mayores que cero.");
                         return 0;  // Retornar 0 si las horas trabajadas son menores o iguales a cero
                    }

                    double productividad = empleado.getSalario() / horasTrabajadas;
                    return productividad;
               }
          }
          // Si no encuentra el empleado, devuelve 0
          System.out.println("Empleado no encontrado");
          return 0;
     }

     public void ReporteAvanzado() {
          System.out.println("Ingrese el ID del empleado para generar el reporte:");
          int idBuscado = scanner.nextInt();
          scanner.nextLine();

          Empleado empleadoEncontrado = null;


          for (Empleado empleado : empleados) {
               if (empleado.getID() == idBuscado) {
                    empleadoEncontrado = empleado;
                    break;
               }
          }

          if (empleadoEncontrado != null) {
               System.out.println("Reporte del empleado:");
               System.out.println("ID: " + empleadoEncontrado.getID());
               System.out.println("Nombre: " + empleadoEncontrado.getNombre());
               System.out.println("Apellido: " + empleadoEncontrado.getApellido());
               System.out.println("Cargo: " + empleadoEncontrado.getCargo());
               System.out.println("Salario: " + empleadoEncontrado.getSalario());
               System.out.println("Departamento: " + empleadoEncontrado.getDepartamento());
          } else {
               System.out.println("Empleado no encontrado.");
          }
     }
}









