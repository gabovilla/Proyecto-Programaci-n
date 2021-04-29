/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;


public class Cliente 
{
    String nombreCliente;
    String correoElectronico;
    int telefono;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String tipoCliente, String correoElectronico, int telefono) {
        this.nombreCliente = nombreCliente;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
