public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento feito com sucesso");
        return true;
    }

}