package exercicio3;

public class Elevador {
    private Integer ocupacao;
    private Integer andarAtual;
    private Integer totalAndares;
    private Integer capacidade;

    public Elevador(Integer totalAndares, Integer capacidade) {
        this.ocupacao = 0;
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public Integer getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(Integer ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void embarcarPessoa(){
        if (getOcupacao() < getCapacidade()){
            setOcupacao(ocupacao + 1);
            System.out.println("\nOcupação: " + getOcupacao());
        } else {
            System.out.println("\nO elevador está cheio!");
        }
    }

    public void desembarcarPessoa(){
        if (getOcupacao() > 0){
            setOcupacao(ocupacao - 1);
            System.out.println("\nOcupação: " + getOcupacao());
        } else {
            System.out.println("\nO elevador está vazio!");
        }
    }

    public void mover(Integer andar){
        String indicador;
        if (andar >= 0 && andar <= getTotalAndares()){
            if(andar >  getAndarAtual()){
                indicador = String.format("%dº andar", andar);
                System.out.println("\nSubindo para o " + indicador);
                
            } else if (andar == 0) {
                System.out.println("\nDescendo para o térreo");
                indicador = "Térreo";                
            } else {
                indicador = String.format("%dº andar", andar);
                System.out.println("\nDescendo para o " + indicador);
            }
            setAndarAtual(andar);
            System.out.println("\nAndar atual: " + indicador);
        } else {
            System.out.println("\nAndar inválido!");
        }
    }
}
