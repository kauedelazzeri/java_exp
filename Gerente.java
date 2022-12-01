
public class Gerente extends Funcionario{
    
    /**
     * @param name
     * @param cpf
     * @param salario
     */
    public Gerente(String name, String cpf, double salario) {
        super(name, cpf, salario);
        //TODO Auto-generated constructor stub
    }

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }
}