public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println("O desenvolvedor está programando.");
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Linguagem: " + linguagem);
    }
}
