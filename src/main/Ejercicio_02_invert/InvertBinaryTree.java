package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node raiz) {
        if (raiz == null) {
            return null;
        }
        
        Node temp = raiz.getLeft();
        raiz.setLeft(invertTree(raiz.getRight()));
        raiz.setRight(invertTree(temp));
        
        return raiz;
    }
    
    public void printTree(Node node, int level) {
        if (node == null) return;
        printTree(node.getRight(), level + 1);
        System.out.println("  ".repeat(level) + "└── " + node.getValue());
        printTree(node.getLeft(), level + 1);
    }

   

}
