package lab8p2_.diegochavez;

import java.util.ArrayList;
import javax.swing.JProgressBar;

public class hilo implements Runnable {

    public static final long Serialversionid = 675L;
    
    private JProgressBar barra;
    private int numero;
    private ArrayList<universo> fr = new ArrayList();
    private ArrayList<servivo> fi = new ArrayList();

    public hilo(JProgressBar barra , int numero) {
        this.barra = barra;
        this.numero = numero;
    }

    public hilo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFr(ArrayList<universo> fr) {
        this.fr = fr;
    }

    public void setFi(ArrayList<servivo> fi) {
        this.fi = fi;
    }

    public ArrayList<universo> getFr() {
        return fr;
    }

    public ArrayList<servivo> getFi() {
        return fi;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void run() {
        int num2 = 0;
        while (num2 <= numero) {
            barra.setValue(barra.getValue() + 1);
            if(num2>fr.size()){
            adminuniverso ui = new adminuniverso();
            ui.leer();
            ui.getListauniversos().add(fr.get(num2));
            ui.escribir();
            }
            
              if(num2>fi.size()){
            adminseresvivos uo = new adminseresvivos();
            uo.leer();
            uo.getListaseresvivos().add(fi.get(num2));
            uo.escribir();
            }
            num2++;
            
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        }
        
    }

}
