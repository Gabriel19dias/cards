public class Jogo {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");


        jogador1.adicionarCarta(new Carta("Dragão", 90, 70));
        jogador1.adicionarCarta(new Carta("Cavaleiro", 60, 80));
        jogador1.adicionarCarta(new Carta("Elfo", 50, 40));

        jogador2.adicionarCarta(new Carta("Orc", 85, 65));
        jogador2.adicionarCarta(new Carta("Feiticeiro", 70, 50));
        jogador2.adicionarCarta(new Carta("Goblin", 40, 30));

      
        for (int i = 0; i < 3; i++) {
            Carta c1 = jogador1.jogarCarta();
            Carta c2 = jogador2.jogarCarta();

            System.out.println("\nRodada " + (i + 1));
            c1.exibirCarta();
            System.out.println("VS");
            c2.exibirCarta();

            int saldo1 = c1.getAtaque() - c2.getDefesa();
            int saldo2 = c2.getAtaque() - c1.getDefesa();

            if (saldo1 > saldo2) {
                jogador1.ganharPonto();
                System.out.println(jogador1.getNome() + " venceu a rodada!");
            } else if (saldo2 > saldo1) {
                jogador2.ganharPonto();
                System.out.println(jogador2.getNome() + " venceu a rodada!");
            } else {
                System.out.println("Empate!");
            }
        }

        System.out.println("\nResultado Final:");
        System.out.println(jogador1.getNome() + ": " + jogador1.getPontos() + " pontos");
        System.out.println(jogador2.getNome() + ": " + jogador2.getPontos() + " pontos");

        if (jogador1.getPontos() > jogador2.getPontos()) {
            System.out.println(jogador1.getNome() + " venceu o jogo!");
        } else if (jogador2.getPontos() > jogador1.getPontos()) {
            System.out.println(jogador2.getNome() + " venceu o jogo!");
        } else {
            System.out.println("Empate!");
        }
    }
}
