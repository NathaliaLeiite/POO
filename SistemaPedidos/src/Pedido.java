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

     public void adicionarItem(Produto p, int q){
        ItemPedido item= new ItemPedido(p, q);
        itens.add(item);
    }

    public double calcularTotal(){
        double t=0.0;
        for(ItemPedido item: itens){
            t+= item.getSubtotal();
        }
        return t;

    }

    public void processar(){
        metodoPagamento.processarPagamento(this.calcularTotal());
    }

}