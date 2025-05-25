public class Carta {
    private String nome;
    private int ataque;
    private int defesa;

    public Carta(String nome, int ataque, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNome() {
        return nome;
    }

    public void exibirCarta() {
        System.out.println(nome + " | ATK: " + ataque + " | DEF: " + defesa);
    }
}
