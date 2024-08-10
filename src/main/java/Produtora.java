import java.util.ArrayList;
import java.util.List;

public class Produtora {

    private String nome;

    private Integer vagas;

    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome){

        Boolean existe = false;

        for (Ator a : atores) {

            if(a.nome.equals(nome)){
                existe = true;
            }
        }

        return existe;

    }

    public void contratar(Ator ator){

        if(vagas > 0){
            atores.add(ator);
            vagas--;
        }

    }

    public Integer getQuantidadeAtores(){
        return atores.size();
    }

    public Integer getQunatidadeProtagonistas(){

        Integer totalDevs = 0;

        for (Ator a : atores) {
            if (a instanceof Protagonista){
                totalDevs++;
            }
        }

        return totalDevs;
    }

    public Double getTotalSalarios(){

        Double totalSalarios = 0.;
        for (Ator a : atores) {
          totalSalarios += a.getSalario();
        }

        return totalSalarios;

    }

    public Ator buscarAtorPorNome(String nome){

        Ator ator = null;

        if(existePorNome(nome)){

            for (int i = 0; i < atores.size(); i++) {

                if(atores.get(i).getNome().equals(nome)){
                    ator = atores.get(i);
                }

            }
        }

        return ator;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}
