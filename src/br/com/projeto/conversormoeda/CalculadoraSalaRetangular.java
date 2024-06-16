package br.com.projeto.conversormoeda;

import br.com.projeto.conversormoeda.interfaces.CalculoGeometrico;
public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    // Construtor para inicializar altura e largura
    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        double altura = 5.0;
        double largura = 10.0;

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(altura, largura);
        double area = calculadora.calcularArea();
        double perimetro = calculadora.calcularPerimetro();

        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}


