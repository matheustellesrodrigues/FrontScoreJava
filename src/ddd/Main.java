package ddd;

public class Main {
    public static void main(String[] args) {
        GerenciadorScores gerenciador = new GerenciadorScoresArrayList();
        FrontScores frontScores = new FrontScores(gerenciador);
        frontScores.dialogar();
    }
}