/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Gabriel
 */
public class Carro {
    private String Placa;
    private String Marca;
    private String Classe;
    private String cor;
    private String Disponivel;
    private String Modelo;
    private String Ano;
    
    public Carro() {
    }

    public Carro(String Placa, String Marca, String Classe, String cor, String Disponivel, String Modelo, String Ano) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Classe = Classe;
        this.cor = cor;
        this.Disponivel = "Disponivel";
        this.Modelo = Modelo;
        this.Ano = Ano;
    }
    
    public void IncluirCarro(String Placa, String Marca, String Classe, String cor, String Disponivel, String Modelo, String Ano){
        
        this.Placa = Placa;
        this.Marca = Marca;
        this.Classe = Classe;
        this.cor = cor;
        this.Disponivel = Disponivel;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(String Disponivel) {
        this.Disponivel = Disponivel;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
}
