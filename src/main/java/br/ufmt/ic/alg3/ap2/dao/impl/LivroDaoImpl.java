package br.ufmt.ic.alg3.ap2.dao.impl;

import br.ufmt.ic.alg3.ap2.dao.DAO;
import br.ufmt.ic.alg3.ap2.util.ConnDB;
import entityClasses.ClasseCliente;
import entityClasses.ClasseLivro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroDaoImpl implements DAO<ClasseLivro> {
    private Connection connection;

    public LivroDaoImpl() {
        // Initialize the database connection
        connection = ConnDB.getConnection();
    }

    public boolean salvar(String title, String autor, String editora, Double preco) {
    String sql = "INSERT INTO livro (tituloLivro, autorLivro, editoraLivro, precoLivro) VALUES (?, ?, ?, ?)";
    
    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
        System.out.println("Connected to the database successfully");        
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, autor);
        preparedStatement.setString(3, editora);
        preparedStatement.setDouble(4, preco);
        
        int rowsInserted = preparedStatement.executeUpdate();
        con.close();
        
        if (rowsInserted > 0) {
            System.out.println("Livro salvo com sucesso!");
            return true;
        } else {
            System.out.println("Nenhum Livro foi salvo.");
            return false;
        }
    } catch (SQLException e) {
        System.err.println("Erro ao salvar Livro: " + e.getMessage());
        return false;
    }
}

    public boolean deletar(int idLivro) {
         try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
            String sql = "DELETE FROM livro WHERE idLivro = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, idLivro);
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

      public List<ClasseLivro> Verificar() {
        List<ClasseLivro> livros = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boaleiturabd", "Enzo", "Enzo!22");
            Statement statement = con.createStatement();
            String consultaSQL = "SELECT * FROM livro";
            ResultSet resultSet = statement.executeQuery(consultaSQL);
            while(resultSet.next()) {
                int id = resultSet.getInt("idLivro");
                String titulo = resultSet.getString("tituloLivro");
                String autor = resultSet.getString("autorLivro");
                String editora = resultSet.getString("editoraLivro");
                double preco = resultSet.getDouble("precoLivro");
                ClasseLivro livro = new ClasseLivro(id, titulo, autor, editora, preco);
                livros.add(livro);
            }
            resultSet.close();
            statement.close();
            con.close();
        } catch(SQLException e) {
            System.err.println("Erro ao consultar Banco de Dados");
            e.printStackTrace();
        }
        return livros;
    }
    @Override
    public boolean salvar(ClasseLivro t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deletar(ClasseLivro t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ClasseLivro> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

