/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saroj_000
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            String sql  = "SELECT id FROM project.producttypetable where product_type_name='sport';";
            PreparedStatement psd = DbUtil.getConnection().prepareStatement(sql);
            int id=0;
            ResultSet rs = psd.executeQuery();
            System.out.println(sql);
            while(rs.next()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
