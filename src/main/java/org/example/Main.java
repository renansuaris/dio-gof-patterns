package org.example;


import org.example.model.Cliente;
import org.example.pattern.PagamentoPorCartao;
import org.example.pattern.PagamentoPorPix;
import org.example.pattern.TipoPagamento;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente;

        System.out.println("Bem vindo ao Sistema de Delivery.");

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String emailCliente = scanner.nextLine();

        System.out.println("Digite seu CEP de entrega");
        String cepCliente = scanner.nextLine();

        System.out.println("O valor final do seu pedido é: 75.00R$");
        System.out.println("Escolha como realizar sua forma de pagamento:" +
                "\n1) Pagamento por Cartão" +
                "\n2) Pagamento por Pix");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o numero do cartao: ");
                String numeroCartao = scanner.nextLine();
                TipoPagamento pagamentocartao = new PagamentoPorCartao(numeroCartao);

                cliente = new Cliente(nomeCliente, cpfCliente, emailCliente, cepCliente, pagamentocartao);
                pagamentocartao.pagar(75.00);
                break;
            case 2:
                System.out.println("Digite sua chave Pix: ");
                String chavePix = scanner.nextLine();
                TipoPagamento pagamentopix = new PagamentoPorPix(chavePix);
                cliente = new Cliente(nomeCliente, cpfCliente, emailCliente, cepCliente, pagamentopix);
                break;
            default:
                throw new IllegalStateException("Erro. Digite um número válido.");
        }

    }
}