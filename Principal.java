package laboratorio3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Persona Personas [] = new Persona [80];        
        int k=1;
        int gente=9;
        
        //Alumnos inicializados
        Personas[0]= new Estudiante(1111,"Rodolfo","Av.Piedras","9595","rodolfo1@gmail.com",1);
        Personas[1]= new Estudiante(2222,"Romina","Av.Laguna","3232","rominita1@hotmail.com",2);
        Personas[2]= new Estudiante(3333,"Ruben","Av.Ohiggins","1212","Roben@gmail.com",3);
        Personas[3]= new Estudiante(4444,"Julian","Av.Sanpedro","1414","Juliano@hotmail.com",4);
        Personas[4]= new Estudiante(5555,"Rocio","Av.Brasil","4545","Rociocio@outlook.com",5);
        
        //Personal inicializados
        Personas[5]= new Personal(6666,"Santiago","PuntaCerro","1515","SantiagoRodriguez@gmail.com","A1",450000,"Tec.Electronico");
        Personas[6]= new Personal(7777,"Luis","LosAndes","1616","LuisPerez@gmail.com","A2",700000,"Desarollador web");
        
        //Profesores inicializados
        Personas[7]= new Profesor(8888,"Juan","SantaCruz","8181","juancarlos@gmail.com","A3",900000,"P.Algebra",30,"Director");
        Personas[8]= new Profesor(9999,"Manuel","VillaNorte","3939","ManuelAlvarez@gmail.com","A4",4500000,"Calculo",20,"Ayudante");
        
        do{
            System.out.println("--------------------------Menú--------------------------");
            System.out.println("Ingrese 1 para registrar a un nuevo alumno");
            System.out.println("Ingrese 2 para registrar a un nuevo profesor");
            System.out.println("Ingrese 3 para registrar a un nuevo miembro del personal");
            System.out.println("Ingrese 4 para emitir un listado de alumnos de un año en especifico");
            System.out.println("Ingrese 5 para emitir un listado con todos los miembros del personal que ganan mas de $500000");
            System.out.println("Ingrese 6 para emitir un listado de los profesores de la organizacion ");
            System.out.println("Ingrese 7 para emitir un listado con todos los profesores,alumnos y personal de la organizacion");
            System.out.println("Ingrese 8 para salir");
            System.out.println("--------------------------------------------------------");
            
            System.out.println("Ingrese un numero: ");
            int num=input.nextInt();
            while(num<1 || num>8){
                System.out.println("numero invalido, porfavor escoga del 1 al 8");
                System.out.println("Ingrese un numero: ");
                num=input.nextInt();
            }
            if(num==1){
                System.out.println("REGISTRAR ALUMNOS");
                System.out.println("Ingrese codigo: ");
                int codigo=input.nextInt();
                
                for(int i = 0; i<gente; i++){
                    while(codigo==Personas[i].getCodigo()){
                        System.out.println("Error, ese codigo ya está registrado, ingrese un nuevo codigo para continuar el proceso: ");
                        codigo=input.nextInt();
                    }
           
                }

                System.out.println("Ingrese nombre: ");
                String nom= input.next();
                
                System.out.println("Ingrese su direccion: ");
                String dire= input.next();
                
                System.out.println("Ingrese su telefono: ");
                String phone= input.next();
                
                System.out.println("Ingrese su correo: ");
                String correo= input.next();
                
                System.out.println("Ingrese año del estudiante: ");
                int año=input.nextInt();
                
                Personas[gente]= new Estudiante(codigo,nom,dire,phone,correo,año);
                gente++;    
            }
            if(num==2){
                System.out.println("REGISTRAR PROFESOR");
                System.out.println("Ingrese codigo: ");
                int codigo=input.nextInt();
                
                for(int i = 0; i<gente; i++){
                    while(codigo==Personas[i].getCodigo()){
                        System.out.println("Error, ese codigo ya está registrado, ingrese un nuevo codigo para continuar el proceso: ");
                        codigo=input.nextInt();
                    }
           
                }
                System.out.println("Ingrese nombre: ");
                String nom= input.next();
                
                System.out.println("Ingrese su direccion: ");
                String dire= input.next();
                
                System.out.println("Ingrese su telefono: ");
                String phone= input.next();
                
                System.out.println("Ingrese su correo: ");
                String correo= input.next();
                
                System.out.println("Ingrese oficina donde operara: ");
                String oficina= input.next();
                
                System.out.println("Ingrese salario: ");
                int salario=input.nextInt();
                
                System.out.println("Ingrese cargo: ");
                String cargo= input.next();
                
                System.out.println("Ingrese horas: ");
                int horas=input.nextInt();
                
                System.out.println("Ingrese rango: ");
                String rango= input.next();
                
                
                 
                Personas[gente]= new Profesor(codigo,nom,dire,phone,correo,oficina,salario,cargo,horas,rango);
                gente++;    
            
            }
            if(num==3){
                System.out.println("REGISTRAR MIEMBO DEL PERSONAL");
                System.out.println("Ingrese codigo: ");
                int codigo=input.nextInt();
                for(int i = 0; i<gente; i++){
                    while(codigo==Personas[i].getCodigo()){
                        System.out.println("Error, ese codigo ya está registrado, ingrese un nuevo codigo para continuar el proceso: ");
                        codigo=input.nextInt();
                    }
                }
                System.out.println("Ingrese nombre: ");
                String nom= input.next();
                
                System.out.println("Ingrese su direccion: ");
                String dire= input.next();
                
                System.out.println("Ingrese su telefono: ");
                String phone= input.next();
                
                System.out.println("Ingrese su correo: ");
                String correo= input.next();
                
                System.out.println("Ingrese oficina donde operara: ");
                String oficina= input.next();
                
                System.out.println("Ingrese salario: ");
                int salario=input.nextInt();
                
                System.out.println("Ingrese titulo: ");
                String cargo= input.next();
                
                Personas[gente]= new Personal(codigo,nom,dire,phone,correo,oficina,salario,cargo);
                gente++;
                
            }
            if(num==4){
                int m=0;
                System.out.println("LISTADO DE ALUMNOS POR AÑO");
                System.out.println("Ingrese el año:");
                int año=input.nextInt();
                for(Persona G: Personas){
                    if(G instanceof Estudiante){
                        if(((Estudiante)G).getAño()==año){
                        System.out.println(G.toString());
                        m++;                        
                        }
                    }
                }
                if(m==0)
                    System.out.println("No se han encontrado alumnos de ese año");          
            }
            if(num==5){
                 System.out.println("PERSONAL QUE GANAN MÁS DE $50000");
                 for(Persona G: Personas){
                    if(G instanceof Personal){
                        if(((Empleado)G).getSalario()>500000){
                        System.out.println(G.toString());                  
                        }
                    } 
                }
            }
            if(num==6){
                System.out.println("TODOS LOS PROFESORES DE LA ORGANIZACIÓN");
                for(Persona G: Personas){
                     if(G instanceof Profesor){
                          System.out.println(G.toString()); 
                     }
       
                }
                

            }
            if(num==7){
                 System.out.println("TODOS LOS MIEMBROS DE LA ORGANIZACION");
                  for(Persona G: Personas){
                      if(G instanceof Persona){
                      
                      System.out.println(G.toString());
                      }
                }
                 
            
            
            
            }
            if(num==8)
                k=0;


        
        
        
        }while(k==1);

    }
    
}
