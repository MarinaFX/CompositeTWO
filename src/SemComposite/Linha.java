package SemComposite;

import java.util.ArrayList;
import java.util.List;

public class Linha {
    private List<Celula> celulas = new ArrayList<Celula>();

    public void imprimir() {
        // Imprime a borda lateral.
        System.out.println(" |");

        // Imprime a linha.
        int tamanho = (celulas.size() * 17) + 5;
        char[] linha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) linha[i] = '-';
        System.out.println(" " + new String(linha));
    }
    public void adicionar(Celula c) {
        celulas.add(c);
    }
}
