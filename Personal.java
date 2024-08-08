package laboratorio3;

public class Personal extends Empleado{
        private String titulo;

        public Personal(int codigo, String nombre, String direccion, String telefono, String correo, String oficina, int salario, String titulo) {
            super(codigo, nombre, direccion, telefono, correo, oficina, salario);
            this.titulo = titulo;
        }
        
      
        

     

    @Override
    public String toString() {
        return "Personal "+ super.toString() + "titulo=" + titulo;
    }
   


    }
   
    
    
