public class FilaRequisicoes {
    private Fila inicio;
    private Fila fim;
    private int quantidade;

    public FilaRequisicoes() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public void enfileirar(Requisicoes requisicoes) {
        Fila novo = new Fila(requisicoes);

        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }

        quantidade++;
    }

    public Requisicoes desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        Requisicoes requisicoes = inicio.requisicoes;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        quantidade--;
        return requisicoes;
    }

    public Requisicoes espiar() {
        if (estaVazia()) {
            return null;
        }

        return inicio.requisicoes;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return quantidade;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Fila de pendentes vazia.");
            return;
        }

        Fila atual = inicio;

        System.out.println("Fila de pendentes:");
        while (atual != null) {
            System.out.println("ID: " + atual.requisicoes.id + " | Tamanho: " + atual.requisicoes.tamanho + " KB");
            atual = atual.proximo;
        }
    }
}