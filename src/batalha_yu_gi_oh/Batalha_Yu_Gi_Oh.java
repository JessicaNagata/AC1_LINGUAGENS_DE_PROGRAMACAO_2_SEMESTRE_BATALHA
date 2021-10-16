package batalha_yu_gi_oh;

import java.util.Scanner;

public class Batalha_Yu_Gi_Oh {

    public static void main(String[] args) {

        cartas cartaplayer1;
        cartas cartaplayer2;
        int opcao;
        int vencedor;

        batalhas battle = new batalhas();
        Scanner ler = new Scanner(System.in);

        System.out.println("******************Batalha Yu-Gi-Oh******************");
        System.out.println("PLAYER 1 - ESCOLHA SUA CARTA DE ACORDO COM O NÚMERO INDICADO: ");
        System.out.println("OPÇÃO 1 - Elemental HERO Neos ");
        System.out.println("OPÇÃO 2 - Dark Magician");
        System.out.println("OPÇÃO 3 - Dragão Branco de Olhos Azuis");
        System.out.println("OPÇÃO 4 - Battle Ox");
        opcao = ler.nextInt();

        cartaplayer1 = battle.escolhaDeCarta(opcao);

        System.out.println("******************Batalha Yu-Gi-Oh******************");
        System.out.println("PLAYER 2 - ESCOLHA SUA CARTA DE ACORDO COM O NÚMERO INDICADO: ");
        System.out.println("OPÇÃO 1 - Elemental HERO Neos ");
        System.out.println("OPÇÃO 2 - Dark Magician");
        System.out.println("OPÇÃO 3 - Dragão Branco de Olhos Azuis");
        System.out.println("OPÇÃO 4 - Battle Ox");
        opcao = ler.nextInt();

        cartaplayer2 = battle.escolhaDeCarta(opcao);

        System.out.println(".......................VAI COMEÇAR A BATALHA.......................");
        cartaplayer1.imprimeCarta();
        System.out.println(".................................X.................................");
        cartaplayer2.imprimeCarta();
        System.out.println("");
        System.out.println("");

        vencedor = battle.round(cartaplayer1, cartaplayer2);

        if (vencedor == 1) {
            System.out.println(".......................GAME OVER.......................");
            System.out.println("_______________O vencedor é o PLAYER 1_________________");
        }

        if (vencedor == 2) {
            System.out.println(".......................GAME OVER.......................");
            System.out.println("_______________O vencedor é o PLAYER 2_________________");
        }

        if (vencedor == 9) {
            System.out.println(".......................GAME OVER.......................");
            System.out.println("_______________O resultado deu empate!_________________");
        }
    }
}
