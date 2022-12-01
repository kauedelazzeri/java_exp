public class TestaFuncionario {

	public static void main(String[] args) {
    final Funcionario kaue = new Funcionario( "kaue" , "02528005083", 5000);

    System.out.println(kaue.getName());
    System.out.println(kaue.getCpf());
    System.out.println(kaue.getSalario());

    Gerente jair = new Gerente("Jair", "012366423", 3120);
    jair.setSenha(2222);
    boolean autenticado = jair.autentica(22212);

    if(autenticado == true){
        System.out.println(autenticado);
        System.out.println(jair.getName());
        System.out.println(jair.getCpf());
        System.out.println(jair.getSalario());
    }else{
        System.out.println("Não autenticado");
    }
    

    }
}

