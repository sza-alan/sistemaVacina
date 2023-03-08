
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Consulta {

    private static String usuario;
    private static String senha;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sistema de vacina");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite 1 caso você for médico \n Digite 2 caso você for enfermeira \n Digite 3 caso você for paciente \n ", "Sistema de Vacina", 
                JOptionPane.QUESTION_MESSAGE));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, " Bem vindo Doutor(a) \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                usuario = JOptionPane.showInputDialog(null, " Digite o seu usuário", "Sistema de vacina", JOptionPane.INFORMATION_MESSAGE);
                senha = JOptionPane.showInputDialog(null, " Digite a sua senha", "Sistema de vacina", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, " Bem vindo Enfermeiro(a) \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE); 
                usuario = JOptionPane.showInputDialog(null, " Digite o seu usuário", "Sistema de vacina", JOptionPane.INFORMATION_MESSAGE);
                senha = JOptionPane.showInputDialog(null, " Digite a sua senha", "Sistema de vacina", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, " Bem vindo Paciente \n faça login para continuar", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                usuario = JOptionPane.showInputDialog(null, " Digite o seu usuário", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                senha = JOptionPane.showInputDialog(null, " Digite a sua senha", "Sistema de Vacina", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showInputDialog("Opção inválida");
        }
    }
}
