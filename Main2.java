public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Isabela");

        aluno.setPrimeiraNota(8);
        aluno.setSegundaNota(9);

        // Teste de nota inválida
        aluno.setPrimeiraNota(11);
        aluno.setSegundaNota(-2);

        aluno.mostrarDados();
    }
}
