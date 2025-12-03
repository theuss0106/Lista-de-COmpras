/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadecompras;

/**
 *
 * @author FATEC ZONA LESTE
 */



import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {

        Scanner ler1 = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n LISTA DE COMPRAS ");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Visualizar lista");
            System.out.println("4 - Alterar lista");
            System.out.println("5 - Deletar lista");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler1.nextInt();
            ler1.nextLine();

            switch (opcao) {

                case 1: 
                    System.out.print("Digite o item para adicionar: ");
                    String itemAdd = ler1.nextLine();
                    lista.add(itemAdd);
                    System.out.println("Item adicionado!");
                    break;

                case 2: 
                    if(lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                        break;
                    }
                    System.out.print("Digite o nome do item que deseja remover: ");
                    String itemRemover = ler1.nextLine();
                    if(lista.remove(itemRemover)) {
                        System.out.println("Item removido!");
                    } else {
                        System.out.println("Item não encontrado!");
                    }
                    break;

                case 3:
                    if(lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("\n--- Lista Atualizada ---");
                        for(int i = 0; i < lista.size(); i++) {
                            System.out.println((i+1) + " - " + lista.get(i));
                        }
                    }
                    break;

                case 4: 
                    if(lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                        break;
                    }

                    System.out.println("Digite o número do item que deseja alterar:");
                    for(int i = 0; i < lista.size(); i++) {
                        System.out.println((i+1) + " - " + lista.get(i));
                    }

                    int index = ler1.nextInt();
                    ler1.nextLine();

                    if(index < 1 || index > lista.size()) {
                        System.out.println("Posição inválida!");
                    } else {
                        System.out.print("Digite o novo nome do item: ");
                        String novoNome = ler1.nextLine();
                        lista.set(index - 1, novoNome);
                        System.out.println("Item alterado!");
                    }
                    break;

                case 5:   
                    lista.clear();
                    System.out.println("Lista apagada!");
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 6);

        ler1.close();
    }
}