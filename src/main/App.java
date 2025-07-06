package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;

import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        System.out.println("EJERCICIO 01: INSERTAR EN ÁRBOL BINARIO DE BÚSQUEDA");
        InsertBSTTest bst = new InsertBSTTest();
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int value : values) {
            bst.insertar(value);
        }
        bst.printTree(bst.getRaiz(), 0);

        
        System.out.println("EJERCICIO 02: INVERTIR ÁRBOL");
        InvertBinaryTree inverter = new InvertBinaryTree();
        Node treeRoot = new Node(4);
        treeRoot.setLeft(new Node(2));
        treeRoot.setRight(new Node(7));
        treeRoot.getLeft().setLeft(new Node(1));
        treeRoot.getLeft().setRight(new Node(3));
        treeRoot.getRight().setLeft(new Node(6));
        treeRoot.getRight().setRight(new Node(9));

        System.out.println("Árbol original:");
        inverter.printTree(treeRoot, 0);

        Node invertedRoot = inverter.invertTree(treeRoot);
        System.out.println("Árbol invertido:");
        inverter.printTree(invertedRoot, 0);

        
        System.out.println("EJERCICIO 03: LISTAR NIVELES DEL ÁRBOL");
        ListLevels listLevels = new ListLevels();
        List<List<Node>> levels = listLevels.listLevels(treeRoot);
        
        
        for (int i = 0; i < levels.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for (Node node : levels.get(i)) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }

       
        System.out.println("\nEJERCICIO 04: PROFUNDIDAD DEL ÁRBOL");
        Depth depthCalculator = new Depth();
        int depth = depthCalculator.maxDepth(treeRoot);
        System.out.println("Profundidad máxima del árbol: " + depth);
    }
       
    

}
