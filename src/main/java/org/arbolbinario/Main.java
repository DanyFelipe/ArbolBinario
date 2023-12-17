package org.arbolbinario;
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        // Insertar elementos en el árbol
        arbol.insertar(40);
        arbol.insertar(25);
        arbol.insertar(60);
        arbol.insertar(15);
        arbol.insertar(35);
        arbol.insertar(50);
        arbol.insertar(75);

        System.out.println("Recorrido Inorder:");
        arbol.inorder(arbol.raiz);

        System.out.println("\nRecorrido Preorder:");
        arbol.preorder(arbol.raiz);

        System.out.println("\nRecorrido Posorder:");
        arbol.posorder(arbol.raiz);
    }
}