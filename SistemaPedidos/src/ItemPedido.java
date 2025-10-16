public class ItemPedido{
    private Produto produto;
    private int quantidade;


    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal(){

        return quantidade * produto.getPreco();
    }


    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}