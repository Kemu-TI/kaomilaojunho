/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Kemu27
 */
public class AbstractDao {

    protected PreparedStatement stm = null;
    protected ResultSet rs = null;
    protected String driver = "org.postgresql.Driver";
    protected String url = "jdbc:postgresql://localhost:5432/kaoMilao";
    protected String usuario = "postgres";
    protected String senha = "vitoria";
    Connection con;

}
