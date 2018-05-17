# poo-unis-ead
package unis;

public class Guitarra {

    
        private String numeroSerie, fabricante, modelo, tipo, madeira;
        private double preco;
        
        
        public Guitarra (
        
                        String numeroSerie, String fabricante, String modelo, String tipo,
                        String madeira, double preco) {
            
            numeroSerie = this.numeroSerie;
            fabricante = this.fabricante;
            modelo = this.modelo;
            tipo = this.tipo;
            madeira = this.madeira;
            preco = this.preco;     
            
        }

    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    
    public String getFabricante() {
        return fabricante;
    }

    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getMadeira() {
        return madeira;
    }

    
    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    
    public double getPreco() {
        return preco;
    }

   
    public void setPreco(double preco) {
        this.preco = preco;
    }     
        
        
    }
    
    
    
    
package com.unisead;

public class Unis {

    
    public static void main(String[] args) {
        
        
        Guitarra minhaGuitarra = new Guitarra ("123", "Marshall", "1", "2", "3", 330);
        
        System.out.println(minhaGuitarra.getNumeroSerie());
        System.out.println(minhaGuitarra.getMadeira());
        System.out.println(minhaGuitarra.getPreco());
        System.out.println(minhaGuitarra.getTipo());
        
    }
    
}
