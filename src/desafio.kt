import kotlin.system.exitProcess

fun main() {

    println("Seja bem vindo ao Sistema")
     while(true){
         val media = calcularMedia()
         println("A média do aluno é $media")
         var opcao = 0
         while (opcao != 1){
             println("novo cálculo (1) ->sim (2) ->não")
             opcao = readln().toInt()
             when(opcao){
                 1-> println("Novo cálculo")
                 2-> exitProcess(0)
                 else -> println("Opção inválida")
             }
         }
    }
}
fun calcularMedia(): Double{
    var aluno = DoubleArray(4)
    var soma = 0.0
    for(i in aluno.indices) {
        println("Digite a ${i + 1}º nota")
        aluno[i] = readln().toDouble()
        while (aluno[i] !in 0.0 .. 10.0 ){
            println("Opçao inválida, digite novamente")
            aluno[i] = readln().toDouble()
        }

        soma += aluno[i]

    }
    return soma / 4
}
// Jéssica, ainda estou com um pouco de dificuldade com os comandos, as vezes eu esqueço,
// as vezes fico meio perdido, Dani me ajudou a concluir o exercício, fds vou dar uma estudada
// pra reforçar o conteudo
