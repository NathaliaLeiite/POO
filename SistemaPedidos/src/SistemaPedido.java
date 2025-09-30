import java.time.LocalDate;

public class SistemaPedido{
    public static void main(String[] args) {
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 150.0, 10);
        Produto mousePad = new Produto("Mouse Pad Preto", 250.0, 10);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 100.0, 10);

        ClientePF cliente1 = new ClientePF("Marcelo", "marcelo22@gmail", "123.456.789-00");
        ClientePJ cliente2 = new ClientePJ("Empresa X", "contato@empresax.com", "12.345.678/0001-99");


        Pedido pedido1 = new Pedido(LocalDate.now(), cliente1, new PagamentoCartaoCredito("123"));
        pedido1.adicionarItem(teclado, 1);
        pedido1.processar();

        Pedido pedido2 = new Pedido(LocalDate.now(), cliente2, new PagamentoCartaoCredito("123"));
        pedido2.adicionarItem(mousePad, 2);

        Pedido pedido3 = new Pedido(LocalDate.now(), cliente1, new PagamentoBoleto("123"));
        pedido3.adicionarItem(mouse, 8);

        Pedido pedido4 = new Pedido(LocalDate.now(), cliente1, new PagamentoBoleto("123"));
        pedido4.adicionarItem(mouse, 15);

    }
}