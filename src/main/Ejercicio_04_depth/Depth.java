package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
     public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());
        
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public void printDepthInfo(Node root) {
        int depth = maxDepth(root);
        System.out.println("EJERCICIO 04: PROFUNDIDAD DEL ÁRBOL");
        System.out.println("La profundidad máxima es: " + depth);
        
        System.out.println("Estructura del árbol:");
        printTree(root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        
        System.out.println("  ".repeat(level) + "└── " + node.getValue());
        printTree(node.getLeft(), level + 1);
        printTree(node.getRight(), level + 1);
    }

    
}
