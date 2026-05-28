public class Fila {
    Requisicoes requisicoes;
    Fila proximo;

    public NoFila(Requisicoes requisicoes) {
        this.requisicoes = requisicoes;
        this.proximo = null;
    }
}