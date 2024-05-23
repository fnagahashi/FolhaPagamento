//TIP To <b>Run</b> code, press <shortcut actionI/d="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FuncionariosHorista funcionario1 = new FuncionariosHorista("João", "123456789-00", 40, 10.0);
        FuncionariosMensalistas funcionario2 = new FuncionariosMensalistas ("Maria", "987654321-00", 2000.00);
        FuncionariosHorista funcionario3 = new FuncionariosHorista ("José", "123456789-00", 40, 15.0);
        FuncionariosMensalistas funcionario4 = new FuncionariosMensalistas ("Ana", "987654321-00", 2000.00);

        System.out.println("Funcionário: " + funcionario1.getNomeFuncionario() + " - Salário: " + funcionario1.salarioMes());

        System.out.println("====RECIBO DE PAGAMENTO====");
        System.out.println("CPF     Nome    Tipo    SALÁRIO" );
        System.out.println(funcionario1.getCpf() + " " + funcionario1.getNomeFuncionario() + " Horista " + funcionario1.salarioMes() + "(R$" + funcionario1.getSalarioHora() + "/hora");
        System.out.println(funcionario2.getCpf() + " " + funcionario2.getNomeFuncionario() + " Mensalista " + funcionario2.getSalarioMes());
        System.out.println(funcionario3.getCpf() + " " + funcionario3.getNomeFuncionario() + " Horista " + funcionario3.salarioMes() + "(R$" + funcionario3.getSalarioHora() + "/hora");
        System.out.println(funcionario4.getCpf() + " " + funcionario4.getNomeFuncionario() + " Mensalista " + funcionario4.getSalarioMes());


    }
}