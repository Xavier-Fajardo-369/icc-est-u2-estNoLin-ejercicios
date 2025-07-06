package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

     public List<List<Node>> listLevels(Node root) {
        List<List<Node>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode);

                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            levels.add(currentLevel);
        }
        return levels;
    }

    public void printLevels(List<List<Node>> levels) {
        System.out.println("EJERCICIO 03: LISTAR NIVELES DEL ÁRBOL");
        for (int i = 0; i < levels.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for (int j = 0; j < levels.get(i).size(); j++) {
                System.out.print(levels.get(i).get(j).getValue());
                if (j < levels.get(i).size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}
