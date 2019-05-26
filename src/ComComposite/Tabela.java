package ComComposite;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Component {
    private List<Linha> linhas = new ArrayList<>();

    public void adicionar(Object l) {
        if (l instanceof Component)
            linhas.add((Linha) l);
        else
            throw new IllegalArgumentException("ERR_INCORRECT_TYPE");
    }

    @Override
    public void imprimir() {
        Component object = null;
        for (Object f : linhas){
            object = (Component) f;
            object.imprimir();
        }
    }
}
