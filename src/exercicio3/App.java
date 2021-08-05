package exercicio3;

public class App {
    public static void main(String[] args) {
        System.out.println("\nExercício 3 - Elevador");

        Elevador elevador = new Elevador(3, 5);
        elevador.embarcarPessoa();
        elevador.embarcarPessoa();
        elevador.embarcarPessoa();
        elevador.embarcarPessoa();
        elevador.embarcarPessoa();
        elevador.embarcarPessoa();
        elevador.desembarcarPessoa();

        elevador.embarcarPessoa();
        elevador.mover(3);
        elevador.mover(2);
        elevador.mover(0);
    }
    
}
