package laboratorio3;

public class Persona {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;

    public Persona(int codigo, String nombre, String direccion, String telefono, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Persona "+"codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo;
    }
    
    
}
