package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int firstMismatch = -1;
        int lastMismatch = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                firstMismatch = i;
                break;
            }
        }
        if (firstMismatch == -1) {
            System.out.println("NO");
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                lastMismatch = i;
                break;
            }
        }
        boolean possible = true;
        for (int i = firstMismatch + 1; i <= lastMismatch; i++) {
            if (a[i] < a[i - 1]) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "NO" : "YES");
    }
}
