
public class Funcionario {
    
    private String name;
    private String cpf;
    private double salario;

    public Funcionario(String name, String cpf, double salario){
        setName(name);
        setCpf(cpf);
        setSalario(salario);        
    }


    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }
    public double getSalario() {
        return salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
