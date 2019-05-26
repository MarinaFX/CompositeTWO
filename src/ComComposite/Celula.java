package ComComposite;

public class Celula implements Component {
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        conteudo = conteudo + "               ";
        conteudo = conteudo.substring(0,15);

        System.out.println(" | " + conteudo);
    }
}
