public class Ator {

    protected String nome;

    protected Integer qtdHorasTrabalhadas;

    protected Double valorHoraTrabalhadas;

    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhadas) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhadas = valorHoraTrabalhadas;
    }

    public Double getSalario (){
        return qtdHorasTrabalhadas * valorHoraTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhadas() {
        return valorHoraTrabalhadas;
    }

    public void setValorHoraTrabalhadas(Double valorHoraTrabalhadas) {
        this.valorHoraTrabalhadas = valorHoraTrabalhadas;
    }

    @Override
    public String toString() {
        return """
               Nome: %s
               Horas trabalhadas: %d
               Valor de Horas Trabalhasdas: %.2f""".formatted(nome, qtdHorasTrabalhadas, valorHoraTrabalhadas );
    }
}
