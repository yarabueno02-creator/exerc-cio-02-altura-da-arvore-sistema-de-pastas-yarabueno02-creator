public class Ex02ProfundidadeDoNo {
   static class Node {
       int id;
       Node left;
       Node right;
       Node(int id){
this.id = id;
       }
   }
   public static int profundidade(Node raiz, int alvo){
       return buscarProfundidade(raiz, alvo, 0);
   }
   public static int buscarProfundidade(Node atual, int alvo, int nivel){
       if (atual == null){
           return -1;
       }
       if (atual.id == alvo){
           return nivel;
       }
       int resultadoEsquerda =
               buscarProfundidade(atual.left, alvo, nivel + 1);
       if (resultadoEsquerda != -1){
           return resultadoEsquerda;
       }
       return buscarProfundidade(atual.right, alvo, nivel + 1);
   }
   public static Node criarArvore(){
       Node raiz = new Node(1);
       raiz.left = new Node(2);
       raiz.right = new Node(3);
       raiz.left.left = new Node(4);
       raiz.left.right = new Node(5);

       return raiz;
   }
   public static void main(String[] args) {
       Node raiz = criarArvore();
       //raiz
       System.out.println(profundidade(raiz, 1));
       //nó interno
       System.out.println(profundidade(raiz, 5));
       //nó inexistente
       System.out.println(profundidade(raiz, 99));
   }
}