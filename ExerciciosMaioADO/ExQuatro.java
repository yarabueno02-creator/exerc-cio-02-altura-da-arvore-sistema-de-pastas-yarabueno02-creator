package ExerciciosMaioADO;

public class ExQuatro {
static class No {
       int codigo;
       No left;
       No right;
       public No(int codigo) {
           this.codigo = codigo;
       }
   }
   public static No inserir(No raiz, int codigo) {
       if (raiz == null) {
           return new No(codigo);
       }
       if (codigo < raiz.codigo) {
           raiz.left = inserir(raiz.left, codigo);
       }
       else if (codigo > raiz.codigo) {
           raiz.right = inserir(raiz.right, codigo);
       }
       return raiz;
   }
   public static boolean buscar(No raiz, int codigo) {
       No atual = raiz;
       while (atual != null) {
           if (codigo == atual.codigo) {
               return true;
           }
           if (codigo < atual.codigo) {
               atual = atual.left;
           }
           else {
               atual = atual.right;
           }
       }
       return false;
   }
   public static void main(String[] args) {
       No raiz = null;
       raiz = inserir(raiz, 50);
       raiz = inserir(raiz, 30);
       raiz = inserir(raiz, 70);
       raiz = inserir(raiz, 20);
       raiz = inserir(raiz, 40);
       raiz = inserir(raiz, 60);
       raiz = inserir(raiz, 80);
       System.out.println(buscar(raiz, 40)); // true
       System.out.println(buscar(raiz, 90)); // false
   }
}