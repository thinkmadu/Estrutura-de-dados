package Listas;

public class ListaDuplamenteEncadeada {
    protected No cabeca;
    protected No cauda;

    public void ListaDuplamenteEncadeada() {
        cabeca = null;
        cauda = null;
    }

    public void adicionarNoInicio(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) { //caso a lista esteja vazia
            cabeca = novoNo;
            cauda = novoNo;

        } else { //caso a lista já tenha elementos
            novoNo.setProximo(cabeca);
            cabeca.setAnterior(novoNo);
            cabeca = novoNo;
        }
    }

    public void adicionarNoFinal(int valor) {
        No novoNo = new No(valor);

        if(cauda == null) { //caso a lista esteja vazia
            cabeca = novoNo;
            cauda = novoNo;
        } else { //caso a lista já tenha elementos
            novoNo.setAnterior(cauda);
            cauda.setProximo(novoNo);
            cauda = novoNo;
        }
    }

    public boolean buscar(int valor) {
        No pointer = cabeca;

        while (pointer != null) {
            if (pointer.getInformacao() == valor) {
                return true;
            }
            pointer = pointer.getProximo();
        }
        return false;
    }

    public void remover(int valor) {
        No atual = cabeca;

        while (atual != null) {
            if (atual.getInformacao() == valor) {
                if (atual == cabeca) {
                    cabeca = atual.getProximo();
                    if (cabeca != null) {
                        cabeca.setAnterior(null);
                    }
                    if (atual == cauda) {
                        cauda = null;
                    }
                } else if (atual == cauda) {
                    cauda = atual.getAnterior();
                    cauda.setProximo(null);
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                return;
            }
            atual = atual.getProximo();
        }

        System.out.println("Tem esse valor aqui não, parça");
    }

    public void adicionarNaPosicaoK(int informacao, int posicao) {
        No novoNo = new No(informacao);

        if (posicao <= 0) {
            adicionarNoInicio(informacao);
            return;
        }

        No atual = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            if(atual == null)
                break;
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) {
            adicionarNoFinal(informacao);
            return;
        }

        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;
        atual.proximo.anterior = novoNo;
        atual.proximo = novoNo;
    }
}
