/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

import conecciondb.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Heladeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection coneccionsql;
            Statement sentenciasql;
            coneccionsql = Conectar.getConnection();
            
            String stsql = "select * from usuario where nombre = 'admin'";
            sentenciasql = coneccionsql.createStatement();
            ResultSet rs = sentenciasql.executeQuery(stsql);
            if (rs.next()) {
                FormularioLogin formulariologin = new FormularioLogin();
                formulariologin.show();  
            } else {
               FormularioUsuario f = new FormularioUsuario();
               f.show(); 
            }
        } catch (Exception e) {
            Logger.getLogger(Heladeria.class.getName()).log(Level.SEVERE,null, e);
        }   
    }   
}
