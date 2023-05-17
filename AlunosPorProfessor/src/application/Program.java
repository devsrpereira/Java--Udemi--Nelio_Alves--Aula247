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

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        Set<Integer> curseB = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int bStudent = sc.nextInt();
            curseB.add(bStudent);
        }

        System.out.print("How many students for course C: ");
        n = sc.nextInt();
        Set<Integer> curseC = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int cStudent = sc.nextInt();
            curseC.add(cStudent);
        }

        Set<Integer> listIndividual = new HashSet<>(curseA);
        listIndividual.addAll(curseB);
        listIndividual.addAll(curseC);

        System.out.println("Total students: " + listIndividual.size());

    }
}
