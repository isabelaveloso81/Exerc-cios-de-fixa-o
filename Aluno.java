public class Aluno {

    private String nome;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setPrimeiraNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            primeiraNota = nota;
        } else {
            System.out.println("Primeira nota inválida.");
        }
    }

    public void setSegundaNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            segundaNota = nota;
        } else {
            System.out.println("Segunda nota inválida.");
        }
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + calcularMedia());
    }
}
