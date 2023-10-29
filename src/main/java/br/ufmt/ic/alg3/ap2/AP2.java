/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.ufmt.ic.alg3.ap2;

import br.ufmt.ic.alg3.ap2.util.ConnDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jivag
 */
public class AP2 {

    public static void main(String[] args) {
        
        Connection con = ConnDB.getInstance().getConnection();
        
        Statement stm;
        try {
            stm = con.createStatement();
            ResultSet result = stm.executeQuery("Select * From alunos");
            
            while (result.next()) {
                System.out.println("Aluno: "+result.getString("nome"));
            }
            
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.println("Erro retornando dados do banco de dados: "+ex.getMessage());
        }
        
        
        
        
        
        
        
        
    }
}
