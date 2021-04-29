/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;


public class Menu
{
 String refresco;
 String pizzas;


    public Menu() {
    }

    public Menu(String refresco, String pizzas, String vinos, String cocteles) {
        this.refresco = refresco;
        this.pizzas = pizzas;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getPizzas() {
        return pizzas;
    }

    public void setPizzas(String pizzas) {
        this.pizzas = pizzas;
    }
    
}
