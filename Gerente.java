public class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void realizarReuniao() {
        System.out.println("O gerente está realizando uma reunião.");
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Setor: " + setor);
    }
}
