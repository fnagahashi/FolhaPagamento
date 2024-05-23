
public class FuncionariosMensalistas extends Funcionarios {
    private double salarioMes;

    public FuncionariosMensalistas(java.lang.String nomeFuncionario, java.lang.String cpf, double salarioMes) {
        super(nomeFuncionario, cpf);
        this.salarioMes = salarioMes;

    }
    public double getSalarioMes() {
        return salarioMes;
    }


}
