public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
            "Carlos", 5000, "Administrativo"
        );

        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Ana", 4000, "Java"
        );

        gerente.mostrarDados();
        gerente.realizarReuniao();

        System.out.println();

        desenvolvedor.mostrarDados();
        desenvolvedor.programar();
    }
}
