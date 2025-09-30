public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    public boolean processarPagamento(double valor){
        if(valor<200.0){
            System.out.println("Pagamento feito com sucesso\n");
            return true;
        }else{
            System.out.println("Deu errado :(\n");
            return false;
        }
    }

}