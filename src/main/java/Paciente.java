
import java.util.ArrayList;


public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void mostraDados(){
        System.out.println("======= Dados =======");
        System.out.println("Nome: "     + this.nome);
        System.out.println("Altura: "   + this.altura);
        System.out.println("Peso: "     + this.peso);
    }
    
    public double calcularIMC(){
        return (peso / (altura * altura));
    }
    
    public Paciente(int rgm, String nome1){
        
    }

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> pacientes = new ArrayList<String>();
        pacientes.add("Alan");
        pacientes.add("Lucas");
        pacientes.add("Marcelo");
        System.out.println(pacientes.toString());
        
        Paciente p1 = new Paciente("Alan", 85.4f, 1.85f);
        Paciente p2 = new Paciente("Lucas", 78.3f, 1.72f);
        Paciente p3 = new Paciente("Marcelo", 65.4f, 1.78f);
        
        p1.mostraDados();
        p2.mostraDados();
        p3.mostraDados();
        System.out.println("IMC: " + p1.calcularIMC());
        
        
    }
}