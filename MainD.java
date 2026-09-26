public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente(
            "Carlos", 5000, 1500
        );

        Funcionario vendedor = new Vendedor(
            "Ana", 2000, 10000, 0.05
        );

        gerente.mostrarDados();

        System.out.println();

        vendedor.mostrarDados();
    }
}
