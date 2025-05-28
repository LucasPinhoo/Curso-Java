package aprendendo.javacore.Gassociacao.Exercicio;

public class AssociacaoExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Avenida Santos Dumont");
        Aluno aluno = new Aluno("Tifa", 21);
        Professor professor = new Professor("Zangan", "Combate");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como desenvolver seu próprio estilo de combate.",
                alunosParaSeminario, local);

        Seminario[] seminarosDisponiveis = {seminario};

        professor.setSeminarios(seminarosDisponiveis);

        professor.imprime();
    }
}
