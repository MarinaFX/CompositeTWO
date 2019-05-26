package SemComposite;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
    private List<Linha> linhas = new ArrayList<Linha>();

    public void adicionar(Linha l) {
        linhas.add(l);
    }
}
