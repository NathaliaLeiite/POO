public class Produto{
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque){
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}