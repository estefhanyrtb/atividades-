/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author Escola
 */
public class Main {
     public static void main(String[] args) {
        Ataque soco = new Soco();
        soco.executar();
        Ataque especial = new Especial();
        especial.executar();
        Ataque chute = new Chute();
        chute.executar();
     }
}
