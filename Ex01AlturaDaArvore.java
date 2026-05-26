public class Ex01AlturaDaArvore {
    static class No {
        String nome;
        No left;
        No right;
        No(String nome){
            this.nome = nome;
        }
    }
    public static int altura(No raiz){
        if (raiz == null){
            return 0;
        }
        int alturaEsquerda = altura(raiz.left);
        int alturaDireita = altura(raiz.right);
        int maiorAltura = Math.max(alturaEsquerda, alturaDireita);
        return 1 + maiorAltura;
        //return 1 + Math.max(alturaEsquerda, alturaDireita);
    }
    public static No pastasEmpresa(){
        No raiz = new No("root");
        raiz.left = new No("home");
        raiz.right = new No("user");
        raiz.left.left = new No("documents");
        raiz.right.right = new No("downloads");
        return raiz;
 
    }
     public static void main(String[] args) {
        No raiz = pastasEmpresa();
        //arvore pequena
        System.out.println("Altura da arvore: " + altura(raiz));
        //arvore vazia
        System.out.println("Altura arvore vazia: " + altura(null));
    }  
 }
 