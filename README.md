# Revisão de POO em Java (básico)

Fazia tempo que eu não punha minhas mãos em código Java então eu decidi pegar uma lista de exercícios aleatória na internet e fazê-los. Algumas instruções ou não eram muito claras ou não faziam muito sentido. Por não saber exatamente o que o exercício esperava de mim, fiz do jeito que eu achei mais conveniente. Segue uma reprodução da lista de exercícios (os enunciados estão da forma como foram escritos no pdf que eu achei):

## Lista de Exercícios 1 - Revisão de POO em Java

Para cada exercício crie um novo projeto ou separe as classes por pacotes (packages). Teste todos os programas na classe principal (classe que contém o método main).

1. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados de uma pessoa. Crie um método para calcular a idade da pessoa.
2. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
   ~~~
   void armazenaPessoa(String nome, int idade, float altura);
   void removePessoa(String nome);
   int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
   void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
   void imprimePessoa(int index); // imprime os dados da pessoa que está na posição "i" da agenda.
   ~~~
3. Crie uma classe denominada <ins>**Elevador**</ins> para armezenar as informações de um elevador dentro de um prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponilizar os seguintes métodos:\
**Inicializa**: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);\
**Entra**: para acresentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);\
**Sai**: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
**Sobe**: para subir um andar (não deve subir se ele já estiver no último andar);
**Desce**: para descer um andar (não deve descer se já estiver no térreo);\
Encapsular todos os atributos da classe (criar os métodos set e get).
4. Crie uma classe <ins>**Televisão**</ins> e uma classe <ins>**ControleRemoto**</ins> que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade
 * trocar para um canal indicado;
 * consultar o valor do volume de som e o canal selecionado.

---
Mantenha a mente aberta e tente resolver antes de olhar a minha implementação.\
Sem mais.

Éde.