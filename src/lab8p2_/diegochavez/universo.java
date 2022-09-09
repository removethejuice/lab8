 
package lab8p2_.diegochavez;

import java.util.ArrayList;


public class universo {
    private ArrayList<servivo> listaseresvivos = new ArrayList();
    private String nombre;
    private int numero;

    public universo() {
    }

    public universo(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = listaseresvivos.size();
    }

    public ArrayList<servivo> getListaseresvivos() {
        return listaseresvivos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setListaseresvivos(ArrayList<servivo> listaseresvivos) {
        this.listaseresvivos = listaseresvivos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "universo{" + "listaseresvivos=" + listaseresvivos + ", nombre=" + nombre + ", numero=" + numero + '}';
    }
    
}
