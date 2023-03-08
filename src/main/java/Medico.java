
import javax.swing.JOptionPane;


public class Medico {
    
    int registro;

    public Medico() {
    }
    
        void registrarVacina(){
        registro = 1;
        while(registro!=0){
                registro = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1 para COVID-19\n2 para H1N1\n3 para Febre\n4 para Sarampo\nDigite 0 para cancelar", "Registro de Vacina", 
                        JOptionPane.INFORMATION_MESSAGE));
            switch(registro){
                case 1: JOptionPane.showMessageDialog(null, "Vacina do COVID-19 registrada", "Concluido!", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 2: JOptionPane.showMessageDialog(null, "Vacina do H1N1 registrada", "Concluido!", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 3: JOptionPane.showMessageDialog(null, "Vacina do Febre registrada", "Concluido!", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 4: JOptionPane.showMessageDialog(null, "Vacina do Sarampo registrada", "Concluido!", JOptionPane.INFORMATION_MESSAGE);
                break;
                default: JOptionPane.showMessageDialog(null, "Vacinas Registradas", "Concluido!", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }    
    }
        
    public static void main(String[] args) {
        Medico paciente = new Medico();
        paciente.registrarVacina();
    }
    
}
