// Declaração de Variáveis e Tipagem
let numero = 10;
numero
console.log(numero);
numero = "dez";
string
console.log(numero);

// Sintaxe e Estruturas de Controle
console.log("Olá, Mundo!");

// Funções e Métodos
function saudacao() {
    console.log("Olá de uma função em JavaScript!");
}
saudacao();

// Orientação a Objetos
class Pessoa {
    constructor(nome) {
        this.nome = nome;
    } saudacao() {
        console.log("Olá,meu nome é " + this.nome);
    }
}
const pessoa = new Pessoa("Carlos");
pessoa.saudacao();

// Execução Assíncrona
function tarefa() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve("Tarefa em segundo plano em JavaScript!");
            }, 1000);
    });
}
async function executarTarefa() {
    const resultado = await tarefa();
    console.log(resultado);
}
executarTarefa();