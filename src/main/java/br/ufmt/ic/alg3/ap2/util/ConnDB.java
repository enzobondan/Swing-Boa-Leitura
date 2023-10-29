package br.ufmt.ic.alg3.ap2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Jivago Medeiros
 */
public class ConnDB {
    
    private static Connection con = null;
    private static Properties config = null;
    private static ConnDB conDB = null;
    
    private ConnDB() {
        
        try {
            loadConfig();
            
            String sgbd = config.getProperty("sgbd");
            String host = config.getProperty("host");
            Integer port = Integer.valueOf(config.getProperty("port"));
            String db_name = config.getProperty("db_name");
            String user = config.getProperty("user");
            String password = config.getProperty("password");

            String urlCon = "jdbc:%s://%s:%d/%s";
        
            String formattedUrlCon = String.format(urlCon, sgbd, host, port, db_name);            
            
            con = DriverManager.getConnection(formattedUrlCon,user,password);            
            
        } catch (IOException ex) {
            System.out.println("Erro carregando arquivo de configuração :"+ex.getMessage());            
        }
        catch (SQLException ex) {
            System.out.println("Erro conectando ao SGBD :"+ex.getMessage());
        }               
        
    }
    
    private void loadConfig() throws IOException {
        config = new Properties();
        
        InputStream inpt = new FileInputStream("db.config");
        config.load(inpt);
        
        inpt.close();        
    }

    public static ConnDB getInstance() {
        
        if (conDB == null) {
            conDB = new ConnDB();
        }
        
        return conDB;
    }    
    
    public static Connection getConnection() {
        return con;
    }
    
    
}
