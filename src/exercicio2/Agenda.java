package exercicio2;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import exercicio1.Pessoa;

public class Agenda {
    List <Pessoa> listaPessoas= new ArrayList<>();

    public Agenda() {

    }

    public void armazenaPessoa(String nome, int idade, Double altura){
        Integer dtNasc = Year.now().getValue() - idade;
        Pessoa pessoa = new Pessoa(nome, dtNasc, altura);

        if (listaPessoas.size() < 10){
            listaPessoas.add(pessoa);
        } else {
            System.out.println("Limite de pessoas atingido!\n");
        }
    }

    public void armazenaPessoa(Pessoa pessoa){
        if (listaPessoas.size() < 10){
            listaPessoas.add(pessoa);
        } else {
            System.out.println("\nLimite de pessoas atingido!");
        }
    }

    public void removePessoa(String nome){
        Pessoa pessoa = listaPessoas.stream().filter(x -> x.getNome() == nome).findFirst().orElse(null);
        if (pessoa == null){
            System.out.println("\nNão encontrado\n");
        } else {
            System.out.println("Removendo indivíduo:\n\n" + pessoa);
            listaPessoas.remove(pessoa);
            System.out.println("\nAgenda atualizada:\n");
            imprimeAgenda();
        }
    }

    public int buscaPessoa(String nome){
        int pos = 0;
        Pessoa pessoa = listaPessoas.stream().filter(x -> x.getNome() == nome).findFirst().orElse(null);
        if (pessoa == null){
            System.out.println("\nNão encontrado\n");
        } else {
            pos = listaPessoas.indexOf(pessoa);
            System.out.println(pessoa + "\nPosição na agenda: " + (pos + 1));
        }
        return pos;
    }

    public void imprimeAgenda(){
        System.out.println("Agenda:\n");
        for (Pessoa item : listaPessoas) {
            System.out.println(item + "\n");
        }
    }

    public void imprimePessoa(int index){
        System.out.println(listaPessoas.get(index));
    }

}