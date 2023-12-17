package org.arbolbinario;
class ArbolBinario {
    Nodo raiz;
    public ArbolBinario() {
        raiz = null;
    }
    // Método para insertar un nuevo nodo en el árbol
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }
    Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        else if (valor > raiz.valor)
            raiz.derecha = insertarRec(raiz.derecha, valor);

        return raiz;
    }

    // Método para realizar el recorrido en inorder (izquierda, raíz, derecha)
    void inorder(Nodo nodo) {
        if (nodo != null) {
            inorder(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inorder(nodo.derecha);
        }
    }

    // Método para realizar el recorrido en preorder (raíz, izquierda, derecha)
    void preorder(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorder(nodo.izquierda);
            preorder(nodo.derecha);
        }
    }

    // Método para realizar el recorrido en posorder (izquierda, derecha, raíz)
    void posorder(Nodo nodo) {
        if (nodo != null) {
            posorder(nodo.izquierda);
            posorder(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }
}
