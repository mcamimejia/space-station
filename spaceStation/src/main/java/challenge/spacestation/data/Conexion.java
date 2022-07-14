package challenge.spacestation.data;

import challenge.spacestation.data.modelos.Lanzadera;
import challenge.spacestation.data.modelos.Robotica;
import challenge.spacestation.data.modelos.Tripulada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mcami
 */
public class Conexion {
    public ResultSet result;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/space_station_db";
            String user = "root";
            String password = "Tg110618*m";
            Connection conexion = DriverManager.getConnection(url, user, password);
            
            return conexion;
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("Error -> " + e.getMessage());
        }
        
        return null;
    }
    
    public boolean agregarLanzadera(Lanzadera lanzadera){
        try{
            Connection cnx = conectar();
            String sql = "INSERT INTO naves_lanzaderas VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, lanzadera.getName());
            pstmt.setString(2, lanzadera.getCountry());
            pstmt.setInt(3, lanzadera.getActivity_start());
            pstmt.setInt(4, lanzadera.getActivity_end());
            pstmt.setString(5, lanzadera.getFuel());
            pstmt.setString(6, lanzadera.getCargo());
            
            int conteo = pstmt.executeUpdate();
            return conteo > 0;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean agregarRobotica(Robotica robotica){
        try{
            Connection cnx = conectar();
            String sql = "INSERT INTO naves_roboticas VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, robotica.getName());
            pstmt.setString(2, robotica.getCountry());
            pstmt.setInt(3, robotica.getActivity_start());
            pstmt.setInt(4, robotica.getActivity_end());
            pstmt.setString(5, robotica.getFuel());
            pstmt.setString(6, robotica.getResearch());
            
            int conteo = pstmt.executeUpdate();
            return conteo > 0;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean agregarTripulada(Tripulada tripulada){
        try{
            Connection cnx = conectar();
            String sql = "INSERT INTO naves_tripuladas VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, tripulada.getName());
            pstmt.setString(2, tripulada.getCountry());
            pstmt.setInt(3, tripulada.getActivity_start());
            pstmt.setInt(4, tripulada.getActivity_end());
            pstmt.setString(5, tripulada.getFuel());
            pstmt.setInt(6, tripulada.getCapacity());
            pstmt.setString(7, tripulada.getObjective());
            
            int conteo = pstmt.executeUpdate();
            return conteo > 0;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean datosTripulada(){
        try{
            Connection cnx = conectar();
            String sql = "SELECT * FROM naves_tripuladas";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            result = pstmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                String country = result.getString(3);
                int activity_start = result.getInt(4);
                int activity_end = result.getInt(5);
                String fuel = result.getString(6);
                int capacity = result.getInt(7);
                String objective = result.getString(8);
                
                String respuesta = "\t*********************\n";
                respuesta += "\tId: " + id + "\n";
                respuesta += "\tNombre de la nave: " + name + "\n";
                respuesta += "\tPaís propietario: " + country + "\n";
                respuesta += "\tActividad: " + activity_start + " - " + activity_end + "\n";
                respuesta += "\tCombustible: " + fuel + "\n";
                respuesta += "\tCapacidad: " + capacity + "\n";
                respuesta += "\tObjetivo: " + objective + "\n";
                
                System.out.println(respuesta);
            }
            result.close();
           
            return true;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean datosRobotica(){
        try{
            Connection cnx = conectar();
            String sql = "SELECT * FROM naves_roboticas";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            result = pstmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                String country = result.getString(3);
                int activity_start = result.getInt(4);
                int activity_end = result.getInt(5);
                String fuel = result.getString(6);
                String research = result.getString(7);
                
                String respuesta = "\t*********************\n";
                respuesta += "\tId: " + id + "\n";
                respuesta += "\tNombre de la nave: " + name + "\n";
                respuesta += "\tPaís propietario: " + country + "\n";
                respuesta += "\tActividad: " + activity_start + " - " + activity_end + "\n";
                respuesta += "\tCombustible: " + fuel + "\n";
                respuesta += "\tÁrea de estudio: " + research + "\n";
                
                System.out.println(respuesta);
            }
            result.close();
           
            return true;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean datosLanzadera(){
        try{
            Connection cnx = conectar();
            String sql = "SELECT * FROM naves_lanzaderas";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            result = pstmt.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                String country = result.getString(3);
                int activity_start = result.getInt(4);
                int activity_end = result.getInt(5);
                String fuel = result.getString(6);
                String cargo = result.getString(7);
                
                String respuesta = "\t*********************\n";
                respuesta += "\tId: " + id + "\n";
                respuesta += "\tNombre de la nave: " + name + "\n";
                respuesta += "\tPaís propietario: " + country + "\n";
                respuesta += "\tActividad: " + activity_start + " - " + activity_end + "\n";
                respuesta += "\tCombustible: " + fuel + "\n";
                respuesta += "\tCarga útil: " + cargo + "\n";
                
                System.out.println(respuesta);
            }
            result.close();
           
            return true;
        } catch (SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
}
