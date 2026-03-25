public class LojaService {

    public void finalizarCompra(Pedido pedido) {
        double total = pedido.calcularTotal();

        PagamentoService pagamento = PagamentoService.getInstancia();

        boolean sucesso = pagamento.processarPagamento(total);

        if (sucesso) {
            System.out.println("Pagamento aprovado!");
        } else {
            System.out.println("Pagamento recusado!");
        }
    }
}