// Declaração de Variáveis e Tipagem
public class Main {
    public static void main(String[] args) {
    int numero = 10; //Declaração de uma variável inteira
    System.out.println(numero);

// Sintaxe e Estruturas de Controle
    public class Main {
        public static void main(String[] args) {
        System.out.println("Olá, Mundo!"); 
        }
        }

// Funções e Métodos
public class Main {
    public static void saudacao() {
    System.out.println("Olá de uma função em Java!");
    }
    public static void main(String[] args) {
    saudacao(); 
    }
    }

// Orientação a Objetos
public class Pessoa {
    String nome; public Pessoa(String nome) {
    this.nome = nome;
    }
    public void saudacao() {
    System.out.println("Olá, meu nome é " + nome);
    }
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Carlos");
    pessoa.saudacao();
    }
    }

// Execução Assíncrona
public class Main extends Thread {
    public void run() {
    System.out.println("Tarefa emsegundo plano em
    Java!");
    }
    public static void main(String[] args) {
    Main tarefa = new Main();
    tarefa.start();
    }
    }