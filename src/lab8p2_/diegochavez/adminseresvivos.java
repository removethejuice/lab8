package lab8p2_.diegochavez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminseresvivos {

    private ArrayList<servivo> listaseresvivos = new ArrayList();
    private File archivoservivo = new File ("./bua.txt");

    public adminseresvivos() {
    }

    public ArrayList<servivo> getListaseresvivos() {
        return listaseresvivos;
    }

    public File getArchivoservivo() {
        return archivoservivo;
    }

    public void setListaseresvivos(ArrayList<servivo> listaseresvivos) {
        this.listaseresvivos = listaseresvivos;
    }

    public void setArchivoservivo(File archivoservivo) {
        this.archivoservivo = archivoservivo;
    }

    public void leer() throws IOException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        listaseresvivos = new ArrayList();
        servivo temp;
        try {
            fis = new FileInputStream(archivoservivo);
            ois = new ObjectInputStream(fis);
            while ((temp = (servivo) ois.readObject()) != null) {
                listaseresvivos.add(temp);
            }
        } catch (Exception ex) {
            // encontro el fin de la pendejada esa
        }
        ois.close();
        fis.close();

    }

    public void escribir() throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        for (servivo x99 : listaseresvivos) {
            oos.writeObject(x99);
        }
        try{
        oos.close();
        fos.close();
    }
        catch(Exception x3){
    
    }
    }

}
