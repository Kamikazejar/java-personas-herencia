package laboratorio3;

public class Estudiante extends Persona{
    private int año;

//Constructor
    public Estudiante(int codigo, String nombre, String direccion, String telefono, String correo, int año) {
        super(codigo, nombre, direccion, telefono, correo);
        this.año = año;
    }

    public int getAño() {
        return año;
    }



    
  

    @Override
    public String toString() {
        return "Estudiante "+super.toString()+ " año="+ año;
    }
}
