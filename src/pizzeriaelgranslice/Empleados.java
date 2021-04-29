/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;


public class Empleados 
{
    String nombreEmpleado;
    String tipoEmpleado;
    int salario;
    int antiguedad;
    int edad;
    int telefono;

    public Empleados() {
    }

    public Empleados(String nombreEmpleado, String tipoEmpleado, int salario, int antiguedad, int edad, int telefono) {
        this.nombreEmpleado = nombreEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreEmpleado + " Puesto: " + tipoEmpleado + " Salario: " + salario + " Antiguedad: " + antiguedad + " Edad: " + edad + " Telefono: " + telefono + '}';
    }

    
    
    
    
}
