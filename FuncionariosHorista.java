
public class FuncionariosHorista extends Funcionarios {
    private double salarioHora;
    private int HorasTrabalhadas;

    public FuncionariosHorista(String nomeFuncionario, String cpf, int HorasTrabalhadas,double salarioHora) {
        super(nomeFuncionario, cpf);
        this.HorasTrabalhadas = HorasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public int getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public double salarioMes() {
        return salarioHora * HorasTrabalhadas;
    }
}
