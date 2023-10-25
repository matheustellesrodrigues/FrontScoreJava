package ddd;

public class Score {
    private String nome;
    private int pontuacao;

    public Score(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    
    public String toString() {
        return "Jogador: " + nome + ", Pontos: " + pontuacao;
    }
}
