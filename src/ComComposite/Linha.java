package ComComposite;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Component {
    private List<Celula> celulas = new ArrayList<>();

    public void adicionar(Object c){
        if (c instanceof Component)
            celulas.add((Celula) c);
        else
            throw new IllegalArgumentException("ERR_TYPE_NOT_FOUND");
    }

    @Override
    public void imprimir() {
        Component object = null;
        for (Celula f : celulas){
           object = (Component) f;
           object.imprimir();
        }
    }
}
