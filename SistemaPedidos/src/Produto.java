public class Produto{
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque){

        if(preco>1000){
            throw new Preco("O valor tem que ser maior do que 1000");

        }
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

    public void setPreco(double preco) {
        this.preco = preco;
    }
}