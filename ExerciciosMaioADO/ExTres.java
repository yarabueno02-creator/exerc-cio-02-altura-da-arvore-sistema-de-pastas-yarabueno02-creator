package ExerciciosMaioADO;

public class ExTres {
static class No {
       int valor;
       No esquerda;
       No direita;
       public No(int valor) {
           this.valor = valor;
       }
   }
   public static int alturaDoNo(No raiz, int alvo) {
       No noAlvo = buscarNo(raiz, alvo);
       if (noAlvo == null) {
           return -1;
       }
       return alturaSubarvore(noAlvo);
   }
   public static No buscarNo(No raiz, int alvo) {
       // Caso base
       if (raiz == null) {
           return null;
       }
       if (raiz.valor == alvo) {
           return raiz;
       }
       No esquerda = buscarNo(raiz.esquerda, alvo);
       if (esquerda != null) {
           return esquerda;
       }
       return buscarNo(raiz.direita, alvo);
   }
   public static int alturaSubarvore(No raiz) {
       if (raiz == null) {
           return 0;
       }
       int alturaEsquerda = alturaSubarvore(raiz.esquerda);
       int alturaDireita = alturaSubarvore(raiz.direita);
       return 1 + Math.max(alturaEsquerda, alturaDireita);
   }
   public static void main(String[] args) {
       No raiz = new No(10);
       raiz.esquerda = new No(5);
       raiz.direita = new No(20);
       raiz.esquerda.esquerda = new No(3);
       raiz.esquerda.direita = new No(7);
       System.out.println("Altura do nó 10: " + alturaDoNo(raiz, 10));
       System.out.println("Altura do nó 5: " + alturaDoNo(raiz, 5));
       System.out.println("Altura do nó 3: " + alturaDoNo(raiz, 3));
       System.out.println("Altura do nó 99: " + alturaDoNo(raiz, 99));
   }
}