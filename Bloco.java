public class Bloco {
    int inicio;
    int tamanho;
    String estado;
    String identificador;

    Bloco filhoEsquerdo;
    Bloco filhoDireito;
    Bloco pai;

    public Bloco(int inicio, int tamanho, Bloco pai) {
        this.inicio = inicio;
        this.tamanho = tamanho;
        this.estado = "LIVRE";
        this.identificador = null;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
        this.pai = pai;
    }

    public boolean naoDividido(){
        return filhoEsquerdo == null && filhoDireito == null;
    }

    public boolean estaLivre() {
        return estado == "Livre";
    }

    public boolean estaOcupado() {
        return estado == "Ocupado";
    }

    public boolean estaDividido() {
        return estado == "Dividido"
    }
}