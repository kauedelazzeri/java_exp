

public class Gerente extends Funcionario{
    
    /**
     * @param name
     * @param cpf
     * @param salario
     */
    public Gerente(String name, String cpf, double salario) {
        super(name, cpf, salario);
    }

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
}