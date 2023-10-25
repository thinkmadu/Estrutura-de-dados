public class No {
    protected int posicao;
    protected int informacao;
    protected No proximo;
    protected No anterior;

    public No(int informacao) {
        this.informacao = informacao;
        this.proximo = null;
        this.anterior = null;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}

