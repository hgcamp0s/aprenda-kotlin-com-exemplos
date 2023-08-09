data class Pais(val habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual(): Pais { 
      val novoHabitantes = habitantes + habitantes * (taxaCrescimento / 100)
      return Pais(novoHabitantes, taxaCrescimento)
    }
}

fun main() {
   val habitantesPaisA = readLine()!!.toDouble()
   val habitantesPaisB = readLine()!!.toDouble()
   var paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
   var paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
   var quantidadeAnos = 0
   while (paisA.habitantes < paisB.habitantes) {
    paisA = paisA.crescerPopulacaoAnual()
    paisB = paisB.crescerPopulacaoAnual()
    quantidadeAnos++
   }
   
   println("$quantidadeAnos anos")
}