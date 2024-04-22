package main;

import model.Alunos;
import java.util.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Alunos> listasimples = new ArrayList<>();

        int opcao = -1;
        while (opcao != 9){

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu de Cadastro Aluno \n"
                + "1 - Inserir (Create) \n"
                + "2 - Consultar (Retrive) \n"
                + "3 - Atualizar (Update) \n"
                + "4 - Deletar (Delete) \n"
                + "5 - Listar tudo (List All) \n"
                + "9 - Sair  \n"));

        switch (opcao) {
            case 1:
                Alunos novo = new Alunos();
                novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Aluno:")));
                novo.setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno:"));
                novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Aluno:")));
                novo.setCurso(JOptionPane.showInputDialog("Digite o Curso do Aluno:"));
                novo.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite a Fase do Aluno:")));

                listasimples.add(novo);
                JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso");
                break;
            case 2:

                int idConsultar = (Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Aluno:")));

                int posicaoConsultar = -1;
                for (int i = 0; i < listasimples.size(); i++) {
                    if (listasimples.get(i).getId() == idConsultar) {
                        posicaoConsultar = i;
                    }
                }
                if (posicaoConsultar == -1) {
                    JOptionPane.showMessageDialog(null, "Não existe o aluno com o ID: " + idConsultar);
                } else {
                    listasimples.remove(posicaoConsultar);
                    JOptionPane.showMessageDialog(null, "Aluno encontrado com sucesso: " + idConsultar);
                }
                
                break;
            case 3:
                break;
            case 4:

                int idExcluir = (Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Aluno:")));

                int posicaoExcluir = -1;
                for (int i = 0; i < listasimples.size(); i++) {
                    if (listasimples.get(i).getId() == idExcluir) {
                        posicaoExcluir = i;
                    }
                }
                if (posicaoExcluir == -1) {
                    JOptionPane.showMessageDialog(null, "Não existe o aluno com o ID: " + idExcluir);
                } else {
                    listasimples.remove(posicaoExcluir);
                    JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso: " + idExcluir);
                    JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso: " + idExcluir);
                }

                break;
            case 5:
                for (int i = 0; i < listasimples.size(); i++) {
                    JOptionPane.showMessageDialog(null, "ID: " + listasimples.get(i).getId());
                    JOptionPane.showMessageDialog(null, "Nome: " + listasimples.get(i).getNome());
                    JOptionPane.showMessageDialog(null, "Idade: " + listasimples.get(i).getIdade());
                    JOptionPane.showMessageDialog(null, "Curso: " + listasimples.get(i).getCurso());
                    JOptionPane.showMessageDialog(null, "Fase: " + listasimples.get(i).getFase());
                }
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida.");
                break;
        }
    }

}
}