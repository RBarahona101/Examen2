package examenp2_rigobertobarahona;


public class Empleados {
    String nombre;
    int edad;
    int ID;
    int carros;

    public Empleados(String nombre, int edad, int ID, int carros) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.carros = carros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCarros() {
        return carros;
    }

    public void setCarros(int carros) {
        this.carros = carros;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
