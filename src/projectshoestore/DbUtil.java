/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshoestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saroj_000
 */
public class DbUtil {
    public static Connection getConnection()throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hamroshoestore","root","1234");
        return con;
    }
}
