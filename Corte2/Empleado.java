package Corte2;

public class Empleado {

   private int ID;
   private String nombre;
   private String apellido;
   private String cargo;
   private double salario;
   private String departamento;

    public Empleado() {

    }

    public int getID(){
       return ID;
   }
   public  void setID(int ID)
   {
       this.ID = ID;
   }

   public String getNombre(){
       return nombre;
   }
   public  void setNombre(String nombre){
       this.nombre = nombre;
   }

   public String getApellido(){
       return apellido;
   }
   public void setApellido(String apellido){
       this.apellido = apellido;
   }

   public String getCargo(){
       return cargo;
   }
   public void setCargo(String cargo){
       this.cargo = cargo;
   }

   public double getSalario(){
       return salario;
   }
   public  void setSalario(double salario){
       this.salario = salario;
   }

   public String getDepartamento(){
       return departamento;
   }
   public void setDepartamento(String departamento){
       this.departamento = departamento;
   }

    public Empleado(int ID, String nombre, String apellido, String cargo, double salario, String departamento) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
}
