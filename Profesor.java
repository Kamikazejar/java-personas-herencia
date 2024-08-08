package laboratorio3;

public class Profesor extends Empleado {
        private String Cargo;
        private int horas;
        private String rango;

        public Profesor(int codigo, String nombre, String direccion, String telefono, String correo, String oficina, int salario, String Cargo, int horas, String rango) {
            super(codigo, nombre, direccion, telefono, correo, oficina, salario);
            this.Cargo = Cargo;
            this.horas = horas;
            this.rango = rango;
            
        }

    public String getCargo() {
        return Cargo;
    }

    public int getHoras() {
        return horas;
    }

    public String getRango() {
        return rango;
    }


        @Override
        public String toString() {
            return "Profesor " + super.toString() + "Cargo= " + Cargo + ", horas= " + horas + ", rango= " + rango;
        }
        
}
