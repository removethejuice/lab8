package lab8p2_.diegochavez;

import javax.swing.JProgressBar;

public class hilo implements Runnable {

    public static final long Serialversionid = 675L;
    
    private JProgressBar barra;
    private int numero;

    public hilo(JProgressBar barra) {
        this.barra = barra;
        this.numero = numero;
    }

    public hilo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            num2++;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }

}
