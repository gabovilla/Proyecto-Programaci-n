/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;


public class MueblesDeCocina 
{
 int sillas;
 int mesas;
 int cubiertos;
 int vasos;
 int platos;
 int servilletas;
 int manteles;

    public MueblesDeCocina() {
    }

    public MueblesDeCocina(int sillas, int mesas, int cubiertos, int vasos, int platos, int servilletas, int manteles) {
        this.sillas = sillas;
        this.mesas = mesas;
        this.cubiertos = cubiertos;
        this.vasos = vasos;
        this.platos = platos;
        this.servilletas = servilletas;
        this.manteles = manteles;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(int cubiertos) {
        this.cubiertos = cubiertos;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getServilletas() {
        return servilletas;
    }

    public void setServilletas(int servilletas) {
        this.servilletas = servilletas;
    }

    public int getManteles() {
        return manteles;
    }

    public void setManteles(int manteles) {
        this.manteles = manteles;
    }


 
}
