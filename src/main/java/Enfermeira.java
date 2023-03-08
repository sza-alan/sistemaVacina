
import javax.swing.JOptionPane;

public class Enfermeira {
    
    String aplica;
    
    public Enfermeira() {
    }

    void aplicarVacina(){
        aplica = JOptionPane.showInputDialog(null, "Vacinas recebidas, Digite SIM para aplicar");
        if (aplica.equalsIgnoreCase("sim" )) {
            JOptionPane.showMessageDialog(null, "Vacinas Aplicadas", "Concluido", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Erro ao aplicar.\nVacinas não aplicadas!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    public static void main(String[] args) {
        Enfermeira pacienteTeste = new Enfermeira();
        
        pacienteTeste.aplicarVacina();
        
        

    }
}
    
    
    

