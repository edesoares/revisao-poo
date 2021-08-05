package exercicio2;

import exercicio1.Pessoa;

public class App {
    public static void main(String [] args) {
        System.out.println("\nExercício 2 - Agenda\n");
        Pessoa pessoa = new Pessoa("João", 1945, 1.75);
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa(pessoa);
        agenda.armazenaPessoa("Milton", 67, 1.76);
        agenda.armazenaPessoa("Luis", 43, 1.66);
        agenda.armazenaPessoa("Astrogildo", 75, 1.81);
        agenda.armazenaPessoa("Rodolfo", 29, 1.72);
        agenda.armazenaPessoa("Mário", 49, 1.74);
        agenda.armazenaPessoa("Jerônimo", 56, 1.79);
        agenda.armazenaPessoa("Chico", 76, 1.69);
        agenda.armazenaPessoa("José", 55, 1.83);
        agenda.armazenaPessoa("Aluísio", 65, 1.70);

        agenda.imprimeAgenda();

        System.out.println("\nEstourando o limite da agenda:\n");
        agenda.armazenaPessoa("Cléber", 36, 1.65);

        System.out.println("\nRemovendo pessoa da agenda:\n");
        agenda.removePessoa("Astrogildo");

        System.out.println("Buscando pessoa\n");
        int pos = agenda.buscaPessoa("José");
        System.out.println("Posição no array: " + pos);

        System.out.println("\nImprimindo pessoa por index:\n");
        agenda.imprimePessoa(2);
    }
}
