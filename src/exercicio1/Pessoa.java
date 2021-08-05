package exercicio1;

import java.time.Year;

public class Pessoa {
    private String nome;
    private Integer dtNasc;
    private Double altura;

    public Pessoa(String nome, Integer dtNasc, Double altura) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Integer dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer calcIdade(){
        int ano = Year.now().getValue();
        return ano - dtNasc;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nData de nascimento: " + dtNasc + " (" + calcIdade()+ " anos)" +
                "\nAltura: " + String.format("%.2f", altura) +
                'm';
    }
}
