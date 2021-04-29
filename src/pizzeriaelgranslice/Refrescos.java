/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriaelgranslice;

/**
 *
 * @author Gabovilla
 */
public class Refrescos {
    
    int cocaCola;
    int cocaColaLight;
    int cocaColaZero;
    int fantaNaranja;
    int fantaColita;
    int fresca;
    int teFrio;
    int zarza;

    public Refrescos() {
    }

    public Refrescos(int cocaCola, int cocaColaLight, int cocaColaZero, int fantaNaranja, int fantaColita, int fresca, int teFrio, int zarza) {
        this.cocaCola = cocaCola;
        this.cocaColaLight = cocaColaLight;
        this.cocaColaZero = cocaColaZero;
        this.fantaNaranja = fantaNaranja;
        this.fantaColita = fantaColita;
        this.fresca = fresca;
        this.teFrio = teFrio;
        this.zarza = zarza;
    }

    public int getCocaCola() {
        return cocaCola;
    }

    public void setCocaCola(int cocaCola) {
        this.cocaCola = cocaCola;
    }

    public int getCocaColaLight() {
        return cocaColaLight;
    }

    public void setCocaColaLight(int cocaColaLight) {
        this.cocaColaLight = cocaColaLight;
    }

    public int getCocaColaZero() {
        return cocaColaZero;
    }

    public void setCocaColaZero(int cocaColaZero) {
        this.cocaColaZero = cocaColaZero;
    }

    public int getFantaNaranja() {
        return fantaNaranja;
    }

    public void setFantaNaranja(int fantaNaranja) {
        this.fantaNaranja = fantaNaranja;
    }

    public int getFantaColita() {
        return fantaColita;
    }

    public void setFantaColita(int fantaColita) {
        this.fantaColita = fantaColita;
    }

    public int getFresca() {
        return fresca;
    }

    public void setFresca(int fresca) {
        this.fresca = fresca;
    }

    public int getTeFrio() {
        return teFrio;
    }

    public void setTeFrio(int teFrio) {
        this.teFrio = teFrio;
    }

    public int getZarza() {
        return zarza;
    }

    public void setZarza(int zarza) {
        this.zarza = zarza;
    }
    
    
}
