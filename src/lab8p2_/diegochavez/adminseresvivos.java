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
    private File archivoservivo = new File("./genero/seresvivos.mb");

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

    public void leer() {
        try {
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            if (archivoservivo.exists()){
            listaseresvivos = new ArrayList();
            servivo temp;

            fis = new FileInputStream(archivoservivo);
            ois = new ObjectInputStream(fis);
            try {
            while ((temp = (servivo) ois.readObject()) != null) {
                listaseresvivos.add(temp);
            }// fin del while
             } catch (Exception e30) {

            }
            
                ois.close();
                fis.close();
            }
        } catch (Exception ex) {
            // encontro el fin de la pendejada esa
        }

    }

    public void escribir() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(archivoservivo);
            oos = new ObjectOutputStream(fos);
            for (servivo x99 : listaseresvivos) {
                oos.writeObject(x99);
            }

        } catch (Exception tr) {

        }
        try {
            oos.close();
            fos.close();
        } catch (Exception x3) {

        }
    }

}
