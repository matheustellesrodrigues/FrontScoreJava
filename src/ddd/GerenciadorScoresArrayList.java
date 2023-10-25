package ddd;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorScoresArrayList implements GerenciadorScores {
    private List<Score> scores;

    public GerenciadorScoresArrayList() {
        scores = new ArrayList<>();
    }

    
    public void adicionar(Score score) {
        scores.add(score);
    }

    
    public List<Score> consultar() {
        return scores;
    }
}
