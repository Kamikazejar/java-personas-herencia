package laboratorio3;

import java.time.LocalDate;

public class Empleado extends Persona {
    private String oficina;
    private int salario;
    private LocalDate fechaContratacion= LocalDate.now(); 

    public Empleado(int codigo, String nombre, String direccion, String telefono, String correo,String oficina, int salario) {
        super(codigo, nombre, direccion, telefono, correo);
        this.oficina = oficina;
        this.salario = salario;
    }


    public String getOficina() {
        return oficina;
    }

    public int getSalario() {
        return salario;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }
    

    @Override
    public String toString() {
        return "Empleado "+super.toString() + "oficina=" + oficina + ", salario=" + salario + ", fechaContratacion= " + fechaContratacion;
    }

}
