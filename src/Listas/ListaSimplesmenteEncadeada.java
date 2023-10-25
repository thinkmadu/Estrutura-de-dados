package Listas;

import Listas.No;

public class ListaSimplesmenteEncadeada {
	protected No cabeca;
	protected No cauda;


    public ListaSimplesmenteEncadeada() {
        cabeca = null;
        cauda = null;
    }

    public void adicionarNoInicio(int informacao) {
        No novoNo = new No(informacao);

        if (cabeca == null) { //caso a lista esteja vazia
        	cabeca=novoNo;
        	cauda = novoNo;
        } else { //caso a lista já tenha elementos
        	novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
    }

    public void adicionarNoFinal(int informacao) {
        No novoNo = new No(informacao);

        if (cauda == null) { //caso a lista esteja vazia
            cabeca = novoNo;
            cauda = novoNo;
        } else { //caso a lista já tenha elementos
            cauda.setProximo(novoNo);
            cauda = novoNo;
        }
    }

    public boolean buscar(int informacao) {
        No pointer = cabeca;

        while (pointer != null) {
            if (pointer.getInformacao() == informacao) {
                return true;
            }
            pointer = pointer.getProximo();
        }
        return false;
    }
}
