package br.ufmt.ic.alg3.ap2.dao.impl;

import br.ufmt.ic.alg3.ap2.dao.DAO;
import br.ufmt.ic.alg3.ap2.util.ConnDB;
import database.Clientlist;
import entityClasses.ClasseCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteDaoImpl implements DAO<ClasseCliente> {
    private Connection connection;

    public ClienteDaoImpl() {
        // Initialize the database connection
        connection = ConnDB.getConnection();
    }

    public boolean salvar(String cpf, String nome, String endereco, String telefone) {
    String sql = "INSERT INTO cliente (cpfCliente, nomeCliente, enderecoCliente, telefoneCliente) VALUES (?, ?, ?, ?)";
    
    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
            System.out.println("Connected to the database successfully");        
        preparedStatement.setString(1, cpf);
        preparedStatement.setString(2, nome);
        preparedStatement.setString(3, endereco);
        preparedStatement.setString(4, telefone);
        
        int rowsInserted = preparedStatement.executeUpdate();
        con.close();
        
        if (rowsInserted > 0) {
            System.out.println("Cliente salvo com sucesso!");
            return true;
        } else {
            System.out.println("Nenhum cliente foi salvo.");
            return false;
        }
    } catch (SQLException e) {
        System.err.println("Erro ao salvar cliente: " + e.getMessage());
        return false;
    }
}

    public boolean deletar(int idCliente) {
         try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
            String sql = "DELETE FROM cliente WHERE idCliente = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, idCliente);
            int linhasAfetadas = preparedStatement.executeUpdate();
            preparedStatement.close();
            con.close();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao excluir dados.");
            e.printStackTrace();
            return false;
        }
}

     public List<Clientlist> Verificar() {
        List<Clientlist> clientes = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
            Statement statement = con.createStatement();
            String consultaSQL = "SELECT * FROM cliente";
            ResultSet resultSet = statement.executeQuery(consultaSQL);
            while(resultSet.next()) {
                int id = resultSet.getInt("idCliente");
                String cpf = resultSet.getString("cpfCliente");
                String nome = resultSet.getString("nomeCliente");
                String endereco = resultSet.getString("enderecoCliente");
                String telefone = resultSet.getString("telefoneCliente");
                Clientlist cliente = new Clientlist(id, cpf, nome, endereco, telefone);
                clientes.add(cliente);
            }
            resultSet.close();
            statement.close();
            con.close();
        } catch(SQLException e) {
            System.err.println("Erro ao consultar Banco de Dados");
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public List<ClasseCliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean salvar(ClasseCliente t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deletar(ClasseCliente t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

