package examenp2_rigobertobarahona;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminCarros {
    ArrayList<Carros> carros = new ArrayList();
    private File archivoC = null;

    public adminCarros(String path) {
        archivoC = new File(path);
    }

    public ArrayList<Carros> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carros> carros) {
        this.carros = carros;
    }

    public File getArchivoC() {
        return archivoC;
    }

    public void setArchivoC(File archivoC) {
        this.archivoC = archivoC;
    }
    public void cargarArchivoC() {
        try {            
            carros = new ArrayList();
            Carros temp;
            if (archivoC.exists()) {
                FileInputStream entrada  = new FileInputStream(archivoC);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carros) objeto.readObject()) != null) {
                        carros.add(temp);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoC() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoC);
            bw = new ObjectOutputStream(fw);
            for (Carros i : carros) {
                bw.writeObject(i);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
