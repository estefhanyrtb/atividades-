/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Escola
 */
public class Main {

    public static void main(String[] args) {
        Pagamento pagPix = new Pix();
        pagPix.realizarPagamento(500);
        Pagamento pagCartao = new Cartao();
        pagCartao.realizarPagamento(100);
        Pagamento pagTransferencia = new TransferenciaBancaria();
        pagTransferencia.realizarPagamento(200);
    }
}
