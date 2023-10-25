package ddd;

import java.util.List;

public interface GerenciadorScores {
    void adicionar(Score score);
    List<Score> consultar();
}
