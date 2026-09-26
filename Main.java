public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 2500, 10);

        produto.mostrarDados();

        produto.alterarPreco(2700);
        produto.adicionarEstoque(5);
        produto.retirarEstoque(3);

        // Testes inválidos
        produto.alterarPreco(-100);
        produto.adicionarEstoque(-2);
        produto.retirarEstoque(100);

        produto.mostrarDados();
    }
}
