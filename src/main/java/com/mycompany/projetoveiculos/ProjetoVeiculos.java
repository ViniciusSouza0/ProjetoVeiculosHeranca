package com.mycompany.projetoveiculos;

import java.util.Scanner;

public class ProjetoVeiculos {
// Classe principal com o método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        // Loop para interação com o usuário
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Mover Carro");
            System.out.println("2. Mover Avião");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            // Verificar a opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    Carro carro = new Carro();
                    carro.mover();
                    break;
                case 2:
                    Aviao aviao = new Aviao();
                    aviao.mover();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}