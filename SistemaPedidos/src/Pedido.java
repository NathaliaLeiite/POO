import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pedido{
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private IPagamento metodoPagamento;

    public Pedido(LocalDate data, Cliente cliente, IPagamento metodoPagamento){
        this.data = data;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
    }

    public void adicionarItem(Produto p, int q) {
        for (ItemPedido item : itens) {
            if (item.getProduto().equals(p)) {
                // se o produto já existe, soma a quantidade
                int novaQuantidade = item.getQuantidade() + q;
                item.setQuantidade(novaQuantidade);
                return;
            }
        }
        // se não existir, cria um novo item e adiciona
        itens.add(new ItemPedido(p, q));
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }


    public double calcularTotal() {
        double t = 0.0;
        for (ItemPedido item : itens) {
            t += item.getSubtotal();
        }
        return t;
    }


    public void aplicarDesconto(double desconto) {
        for (ItemPedido item : itens) {
            double precoAtual = item.getProduto().getPreco();
            double novoPreco = precoAtual - desconto;
            if (novoPreco < 0) novoPreco = 0;
            item.getProduto().setPreco(novoPreco);
        }
    }

    public boolean confirmarPedido() {
        if (metodoPagamento == null) {
            return false;
        }

        double valorTotal = calcularTotal();
        boolean aprovado = metodoPagamento.processarPagamento(valorTotal);

        return aprovado;
    }

    public void processar(){
        metodoPagamento.processarPagamento(this.calcularTotal());
    }

}