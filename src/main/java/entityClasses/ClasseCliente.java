/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityClasses;

/**
 *
 * @author enzob
 */
public class ClasseCliente {
    private int id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

    public ClasseCliente(int id, String cpf, String nome, String endereco, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public ClasseCliente() {}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", Nome=" + nome + ", CPF=" + cpf + ", Telefone=" + telefone
                + ", Endereço=" + endereco + "]";
    }
    
}
