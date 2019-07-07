package br.com.casadocodigo.loja.models;

import java.util.Objects;

public class CarrinhoItem {


    private Produto produto;
    private TipoPreco preco;

    public CarrinhoItem(Produto produto, TipoPreco preco) {

        this.produto = produto;
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TipoPreco getPreco() {
        return preco;
    }

    public void setPreco(TipoPreco preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarrinhoItem that = (CarrinhoItem) o;
        return Objects.equals(produto, that.produto) &&
                preco == that.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, preco);
    }
}
