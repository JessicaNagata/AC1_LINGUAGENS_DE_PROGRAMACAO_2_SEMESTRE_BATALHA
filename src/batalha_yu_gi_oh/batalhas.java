package batalha_yu_gi_oh;

public class batalhas {

    public cartas escolhaDeCarta(int opcao) {

        switch (opcao) {
            case 1:
                cartas carta1 = new cartas("Elemental HERO Neos", "Luz", 7, 2500, 2000);
                return carta1;

            case 2:
                cartas carta2 = new cartas("Dark Magician", "Trevas", 7, 2500, 2100);
                return carta2;

            case 3:
                cartas carta3 = new cartas("Dragão Branco de Olhos Azuis", "Luz", 8, 3000, 2500);
                return carta3;

            case 4:
                cartas carta4 = new cartas("Battle Ox", "Terra", 4, 1700, 1000);
                return carta4;

        }
        return null;

    }

    public int round(cartas player1, cartas player2) {
        int contadorRound = 0;
        int jogada;

        do {
            contadorRound++;
            jogada = player1.getAtaque() - player2.getDefesa();
            if (jogada >0) {
                player2.setVida(player2.getVida() - player1.getAtaque());
            }
            jogada = player2.getAtaque() - player1.getDefesa();
            if (jogada > 0) {
                player1.setVida(player1.getVida() - player2.getAtaque());
            }
            System.out.println("****************PLACAR ROUND: " + contadorRound + "****************");
            System.out.println("PLAYER 1: " + player1.getVida() + " X PLAYER 2: " + player2.getVida());
            System.out.println("");
            System.out.println("");
        } while (player1.getVida() > 0 && player2.getVida() > 0);

        if (player1.getVida() < 1 && player2.getVida() < 1) {
            return 9;
        } else if (player1.getVida() < 1) {
            return 2;
        } else {
            return 1;
        }

    }

}
