import java.util.List;
import java.util.ArrayList;

public class Jogador {
    private String nome;
    private List<Carta> baralho;
    private int pontos;

    public Jogador(String nome) {
        this.nome = nome;
        this.baralho = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarCarta(Carta carta) {
        baralho.add(carta);
    }

    public Carta jogarCarta() {
        if (!baralho.isEmpty()) {
            return baralho.remove(0);
        }
        return null;
    }

    public void ganharPonto() {
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
}
