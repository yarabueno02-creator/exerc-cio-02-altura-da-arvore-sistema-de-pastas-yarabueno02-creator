import java.util.ArrayList;
import java.util.List;

public class Ex05PreOrdem {
     static class No {
       String etapa;
       No esquerda;
       No direita;
       public No(String etapa) {
           this.etapa = etapa;
       }
   }
   public static List<String> preOrdem(No raiz) {
       List<String> resultado = new ArrayList<>();
       preOrdemRec(raiz, resultado);
       return resultado;
   }
   public static void preOrdemRec(No atual, List<String> resultado) {
       if (atual == null) {
           return;
       }
       resultado.add(atual.etapa);
       preOrdemRec(atual.esquerda, resultado);
       preOrdemRec(atual.direita, resultado);
   }
   public static void main(String[] args) {
       No raiz = new No("Deploy");
       raiz.esquerda = new No("Backend");
       raiz.direita = new No("Frontend");
       raiz.esquerda.esquerda = new No("Banco");
       raiz.direita.direita = new No("Testes");
       List<String> resultado = preOrdem(raiz);
       System.out.println(resultado);
   }
}
// yara