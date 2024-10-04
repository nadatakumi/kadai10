package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import sub.ken;

public class moto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 数字をカンマ区切りで入力
            System.out.println("複数の数字をカンマ区切りで入力してください (例: 8,5,9):");
            String input = scanner.nextLine();
            List<String> selectedNumbers = Arrays.asList(input.split(","));

            // 昇順か降順かを選択
            System.out.println("昇順にソートする場合は 'asc'、降順にソートする場合は 'desc' を入力してください:");
            String sortOrder = scanner.nextLine();

            // kenクラスの処理を呼び出し
            ken kenLogic = new ken();
            kenLogic.processSelections(selectedNumbers, sortOrder);
        } finally {
            // Scannerを閉じる
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
