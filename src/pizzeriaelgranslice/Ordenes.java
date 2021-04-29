/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;


public class Ordenes 
{
    int numeroOrden;
    int mesa;
    String pedidos;

    public Ordenes() {
    }

    public Ordenes(int numeroOrden, int mesa, String pedidos) {
        this.numeroOrden = numeroOrden;
        this.mesa = mesa;
        this.pedidos = pedidos;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Numero de Orden: " + numeroOrden + " Mesa: " + mesa + " Pedido: " + pedidos;
    }

    
    
}
