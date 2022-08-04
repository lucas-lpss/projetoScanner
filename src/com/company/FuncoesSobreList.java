package com.company;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;


public class FuncoesSobreList {

    private List<String> bancoDeDadosFakeNomeAluno = new ArrayList<>();


    private List<String> nomeDosAlunos(String s) {
        this.bancoDeDadosFakeNomeAluno.add(s);
        return bancoDeDadosFakeNomeAluno;
    }

    void metodoDoAdicionamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduza um nome Aluno:");
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            List<String> listDoNome = this.nomeDosAlunos(str);
        }
        for (String s : this.bancoDeDadosFakeNomeAluno) {
            System.out.println("nome do aluno: " + s);
        }
    }
}