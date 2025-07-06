package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBSTTest {
    private Node raiz;

    public Node getRaiz() {
        return raiz;
    }

    
    public void insertar(int value) {
        raiz = insert(raiz, value);
    }

    
    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }

    public void printTree(Node node, int level) {
        if (node == null) return;
        printTree(node.getRight(), level + 1);
        System.out.println("  ".repeat(level) + "└── " + node.getValue());
        printTree(node.getLeft(), level + 1);
    }
    

}
