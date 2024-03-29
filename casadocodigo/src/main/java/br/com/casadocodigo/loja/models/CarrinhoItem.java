package br.com.casadocodigo.loja.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CarrinhoItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Produto produto;
    private TipoPreco preco;

    public CarrinhoItem(Produto produto, TipoPreco preco) {

        this.produto = produto;
        this.preco = preco;
    }

    public BigDecimal getPrecos(){
        return produto.precoPara(preco);
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

    public BigDecimal getTotal(Integer quantidade) {
        return this.getPrecos().multiply(new BigDecimal(quantidade));
    }
}
