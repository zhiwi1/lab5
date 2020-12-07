package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(21);
        binaryTree.add(12);
        binaryTree.add(10);
        binaryTree.add(42);
        binaryTree.add(25);
        binaryTree.add(14);
        binaryTree.add(19);
        menu(binaryTree);
    }

    private static void menu(BinaryTree binaryTree) {
        printItems();
        int item = inputItem();
        switch (item) {
            case 1:
                binaryTree.traverseInOrder();
                break;
            case 2:
                binaryTree.traversePostOrder();
                break;
            case 3:
                binaryTree.traversePreOrder();
                break;
            case 4:
                System.out.println("Введите элемент, который хотите добавить:");
                int num1 = in.nextInt();
                in.nextLine();
                binaryTree.add(num1);
                break;
            case 5:
                System.out.println("Введите элемент, который хотите удалить:");
                int num2 = in.nextInt();
                in.nextLine();
                binaryTree.delete(num2);
                break;
            case 6:
                System.out.println("Введите элемент, который хотите проверить на наличие:");
                int num3 = in.nextInt();
                in.nextLine();
                binaryTree.containsNode(num3);
                break;
            default:
                return;
        }
        menu(binaryTree);
    }

    private static int inputItem() {
        System.out.print("Выберете пункт: ");
        return Integer.parseInt(in.nextLine());
    }

    private static void printItems() {
        System.out.println("----------------------------------");
        System.out.println("Меню:");
        System.out.println("1) Симметричный обход дерева");
        System.out.println("2) Обратный обход дерева");
        System.out.println("3) Прямой обход дерева");
        System.out.println("4) Добавление элемента");
        System.out.println("5) Удаление элемента");
        System.out.println("6) Проверить элемент на его наличие");
        System.out.println("----------------------------------");
    }
//    public static void main(String[] args) {
//
//
//        binaryTree.traverseInOrder();
//        System.out.println();
//        binaryTree.traversePreOrder();
//        System.out.println();
//        binaryTree.traversePostOrder();
//        binaryTree.containsNode(4);
//        binaryTree.delete(4);
//        binaryTree.containsNode(4);
//        binaryTree.traverseInOrder();
//        System.out.println();
//        binaryTree.traversePreOrder();
//        System.out.println();
//        binaryTree.traversePostOrder();
//
//    }
}
