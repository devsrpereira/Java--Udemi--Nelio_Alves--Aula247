package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("How many students for course A: ");
        int n = sc.nextInt();

        Set<Integer> curseA = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int aStudent = sc.nextInt();
            curseA.add(aStudent);
        }

        


    }
}
