/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_.diegochavez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminuniverso {

    private ArrayList<universo> listauniversos = new ArrayList();
    private File archivouniverso = new File("./genera/universos.mb");

    public adminuniverso() {
    }

    public ArrayList<universo> getListauniversos() {
        return listauniversos;
    }

    public File getArchivouniverso() {
        return archivouniverso;
    }

    public void setListauniversos(ArrayList<universo> listauniversos) {
        this.listauniversos = listauniversos;
    }

    public void setArchivouniverso(File archivouniverso) {
        this.archivouniverso = archivouniverso;
    }

    public void leer() {
        try {
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            if (archivouniverso.exists()) {
                listauniversos = new ArrayList();
                universo temp;

                fis = new FileInputStream(archivouniverso);
                ois = new ObjectInputStream(fis);
                try {
                    while ((temp = (universo) ois.readObject()) != null) {
                        listauniversos.add(temp);
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

    public void escribir()  {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(archivouniverso);
            oos = new ObjectOutputStream(fos);
            for (universo x99 : listauniversos) {
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
