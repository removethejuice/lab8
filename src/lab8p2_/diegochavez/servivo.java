 
package lab8p2_.diegochavez;

 
public class servivo {
 
    private  String nombre;
    private String ID;
    private int poder;
    private int anios;
    private universo x1;
    private String raza;

    public servivo(String nombre, String ID, int poder, int anios, universo x1, String raza) {
        this.nombre = nombre;
        this.ID = ID;
        this.poder = poder;
        this.anios = anios;
        this.x1 = x1;
        this.raza = raza;
    }

    public servivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public int getPoder() {
        return poder;
    }

    public int getAnios() {
        return anios;
    }

    public universo getX1() {
        return x1;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setX1(universo x1) {
        this.x1 = x1;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "servivo{" + "nombre=" + nombre + ", ID=" + ID + ", poder=" + poder + ", anios=" + anios + ", x1=" + x1 + ", raza=" + raza + '}';
    }
    
    
}
