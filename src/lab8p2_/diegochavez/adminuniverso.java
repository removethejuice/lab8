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

     

   

    public void leer() throws IOException {
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;
        listauniversos = new ArrayList();
        universo temp2;
        try {
            fis2 = new FileInputStream(archivouniverso);
            ois2 = new ObjectInputStream(fis2);
            while ((temp2 = (universo) ois2.readObject()) != null) {
                listauniversos.add(temp2);
            }
        } catch (Exception ex) {
            // encontro el fin de la pendejada esa
        }
        try{
        ois2.close();
        fis2.close();
        }catch(Exception ex4){
        
        }
    }

    public void escribir() throws IOException {
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;
        for (universo x100 : listauniversos) {
            oos2.writeObject(x100);
        }
        try{
        oos2.close();
        fos2.close();
    }
        catch(Exception x3){
    
    }
    }

}
