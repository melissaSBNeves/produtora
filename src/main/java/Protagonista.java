public class Protagonista extends Ator {

    private Integer qtdHoraProtagonista;
    private Double valorHoraProtagonista;

    public Protagonista(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhadas, Integer qtdHoraProtagonista, Double valorHoraProtagonista) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhadas);
        this.qtdHoraProtagonista = qtdHoraProtagonista;
        this.valorHoraProtagonista = valorHoraProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + qtdHoraProtagonista * valorHoraProtagonista;
    }

    public Integer getQtdHoraProtagonista() {
        return qtdHoraProtagonista;
    }

    public void setQtdHoraProtagonista(Integer qtdHoraProtagonista) {
        this.qtdHoraProtagonista = qtdHoraProtagonista;
    }

    public Double getValorHoraProtagonista() {
        return valorHoraProtagonista;
    }

    public void setValorHoraProtagonista(Double valorHoraProtagonista) {
        this.valorHoraProtagonista = valorHoraProtagonista;
    }

    @Override
    public String toString() {
        return """
               %s
               Salário protagonista: %.2f""".formatted(super.toString(), getSalario()) ;
    }
}
