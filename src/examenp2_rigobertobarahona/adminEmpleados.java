package examenp2_rigobertobarahona;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminEmpleados {
    ArrayList<Empleados> empleados = new ArrayList();
    private File archivoE = null;
    
    public adminEmpleados(String path) {
        archivoE = new File(path);
    }
    
    public void cargarArchivoC() {
        try {            
            empleados = new ArrayList();
            Empleados temp;
            if (archivoE.exists()) {
                FileInputStream entrada  = new FileInputStream(archivoE);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleados) objeto.readObject()) != null) {
                        empleados.add(temp);
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
            fw = new FileOutputStream(archivoE);
            bw = new ObjectOutputStream(fw);
            for (Empleados i : empleados) {
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
