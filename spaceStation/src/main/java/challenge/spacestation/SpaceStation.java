package challenge.spacestation;

import java.util.Scanner;
import challenge.spacestation.data.Conexion;
import challenge.spacestation.data.modelos.Lanzadera;
import challenge.spacestation.data.modelos.Robotica;
import challenge.spacestation.data.modelos.Tripulada;

/**
 *
 * @author mcami
 */
public class SpaceStation {
    
    public static void addLanzadera(Conexion cnx, String[] data){
        Lanzadera nave = new Lanzadera();
        nave.setName(data[0]);
        nave.setCountry(data[1]);
        nave.setActivity_start(Integer.parseInt(data[2]));
        nave.setActivity_end(Integer.parseInt(data[3]));
        nave.setFuel(data[4]);
        nave.setCargo(data[5]);
        
        if(cnx.agregarLanzadera(nave)){
            System.out.println("La nave se ha agregado satisfactoriamente");
        }else {
            System.out.println("Error agregando la nave");
        }
    }
    
    public static void addRobotica(Conexion cnx, String[] data){
        Robotica nave = new Robotica();
        nave.setName(data[0]);
        nave.setCountry(data[1]);
        nave.setActivity_start(Integer.parseInt(data[2]));
        nave.setActivity_end(Integer.parseInt(data[3]));
        nave.setFuel(data[4]);
        nave.setResearch(data[5]);
        
        if(cnx.agregarRobotica(nave)){
            System.out.println("La nave se ha agregado satisfactoriamente");
        }else {
            System.out.println("Error agregando la nave");
        }
    }
    
    public static void addTripulada(Conexion cnx, String[] data){
        Tripulada nave = new Tripulada();
        nave.setName(data[0]);
        nave.setCountry(data[1]);
        nave.setActivity_start(Integer.parseInt(data[2]));
        nave.setActivity_end(Integer.parseInt(data[3]));
        nave.setFuel(data[4]);
        nave.setCapacity(Integer.parseInt(data[5]));
        nave.setObjective(data[6]);
        
        if(cnx.agregarTripulada(nave)){
            System.out.println("La nave se ha agregado satisfactoriamente");
        }else {
            System.out.println("Error agregando la nave");
        }
    }

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            System.out.println("***Naves espaciales que pasaron a la Historia***");
            System.out.println("---Menú principal---");
            System.out.println("1. Agregar nueva Nave");
            System.out.println("2. Listado de Naves Lanzaderas");
            System.out.println("3. Listado de Naves Robóticas o No tripuladas");
            System.out.println("4. Listado de Naves Tripuladas");
            System.out.println("5. Salir");
            
            String opcion = sc.nextLine();
            
            switch (opcion) {
                case "1" -> {
                    System.out.println("---Agregar Nave---");
                    System.out.println("1. Agregar nave lanzadera");
                    System.out.println("2. Agregar nave robótica");
                    System.out.println("3. Agregar nave tripulada");
                    System.out.println("4. atrás");
                    
                    String opcionAgregar = sc.nextLine();
                    
                    switch (opcionAgregar) {
                        case "1" -> {
                            String[] dataToSent = new String[6];
                            System.out.println("Nombre de la nave: ");
                            dataToSent[0] = sc.nextLine();
                            System.out.println("País propietario: ");
                            dataToSent[1] = sc.nextLine();
                            System.out.println("Año inicio de actividad: ");
                            dataToSent[2] = sc.nextLine();
                            System.out.println("Año fin de actividad: ");
                            dataToSent[3] = sc.nextLine();
                            System.out.println("Combustible: ");
                            dataToSent[4] = sc.nextLine();
                            System.out.println("Carga útil: ");
                            dataToSent[5] = sc.nextLine();
                            
                            addLanzadera(conexion, dataToSent);
                            
                            break;
                        }
                        case "2" -> {
                            String[] dataToSent = new String[6];
                            System.out.println("Nombre de la nave: ");
                            dataToSent[0] = sc.nextLine();
                            System.out.println("País propietario: ");
                            dataToSent[1] = sc.nextLine();
                            System.out.println("Año inicio de actividad: ");
                            dataToSent[2] = sc.nextLine();
                            System.out.println("Año fin de actividad: ");
                            dataToSent[3] = sc.nextLine();
                            System.out.println("Combustible: ");
                            dataToSent[4] = sc.nextLine();
                            System.out.println("Área de estudio: ");
                            dataToSent[5] = sc.nextLine();
                            
                            addRobotica(conexion, dataToSent);
                            
                            break;
                        }
                        case "3" -> {
                            String[] dataToSent = new String[7];
                            System.out.println("Nombre de la nave: ");
                            dataToSent[0] = sc.nextLine();
                            System.out.println("País propietario: ");
                            dataToSent[1] = sc.nextLine();
                            System.out.println("Año inicio de actividad: ");
                            dataToSent[2] = sc.nextLine();
                            System.out.println("Año fin de actividad: ");
                            dataToSent[3] = sc.nextLine();
                            System.out.println("Combustible: ");
                            dataToSent[4] = sc.nextLine();
                            System.out.println("Capacidad: ");
                            dataToSent[5] = sc.nextLine();
                            System.out.println("Objetivo: ");
                            dataToSent[6] = sc.nextLine();
                            
                            addTripulada(conexion, dataToSent);
                            
                            break;
                        }
                        case "4" -> {
                            break;
                        }
                    }
                }
                case "2" -> {
                    conexion.datosLanzadera();
                    break;
                }
                case "3" -> {
                    conexion.datosRobotica();
                    break;
                }
                case "4" -> {
                    conexion.datosTripulada();
                    break;
                }
                case "5" -> {
                    salir = true;
                    break;
                }
                    
            }
        }
       
     
        
    }
}
