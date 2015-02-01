/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestForm;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author AnToine
 */
public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/estacionamiento","root","450420");
        }catch(Exception e){
                System.out.print(e.getMessage());
            }
        return conectar;
        }
    }

