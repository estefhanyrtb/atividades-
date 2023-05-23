/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author Escola
 */
public class Main {

    public static void main(String[] args) {
        CalcularSalario gerente = new Gerente();
        gerente.calcularSalario();
        CalcularSalario analista = new Analista();
        analista.calcularSalario();
        CalcularSalario desenvolvedor = new Desenvolvedor();
        desenvolvedor.calcularSalario();
    }
}
