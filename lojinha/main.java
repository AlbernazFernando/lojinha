public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "João", "joao@email.com");

        Produto p1 = new Produto(1, "Notebook", 3000);
        Produto p2 = new Produto(2, "Mouse", 100);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(p1, 1));
        pedido.adicionarItem(new ItemPedido(p2, 2));

        LojaService loja = new LojaService();
        loja.finalizarCompra(pedido);
    }
}