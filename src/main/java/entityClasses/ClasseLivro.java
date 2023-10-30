/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityClasses;

/**
 *
 * @author enzob
 */
public class ClasseLivro {

    public String title;
    private int id;
    public String autor;
    public String editora;
    private double preco;

    public ClasseLivro(int id, String title, String autor, String editora, double preco) {
        this.title = title;
        this.autor = autor;
        this.id = id;
        this.editora = editora;
        this.preco = preco;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Livro: " + title + " por " + autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}