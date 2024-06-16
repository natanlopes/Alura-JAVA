package br.com.projeto.conversormoeda;

import br.com.projeto.conversormoeda.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    
    // Taxa de conversão fixa (exemplo: 1 dólar = 5 reais)
    private static final double TAXA_CONVERSAO = 5.0;

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_CONVERSAO;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmDolar = 100.0;
        double valorEmReais = conversor.converterDolarParaReal(valorEmDolar);
        System.out.println("Valor em dólares: " + valorEmDolar);
        System.out.println("Valor em reais: " + valorEmReais);
    }
}
