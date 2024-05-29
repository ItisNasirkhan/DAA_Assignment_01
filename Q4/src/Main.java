import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Knapsack {
public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        // Inputing number of items and max weight ***
        System.out.println("please enter number of items: ");
        int n = scan1.nextInt();

        System.out.println("please enter the max weight : ");
        int W = scan1.nextInt();

        List<Integer> weight = new ArrayList<>();
        List<Integer> benefit = new ArrayList<>();

        // Inputing weight and benefit 
        System.out.println("Enter the weight and benefit of items (weight benefit): ");
        for (int i = 0; i < n; i++) {
        weight.add(scan1.nextInt());
        benefit.add(scan1.nextInt());
        }

        // Creating the dynamic table
        int[][] B = new int[n + 1][W + 1];

        // Filling the dynamic table
        for (int i = 1; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
        if (weight.get(i - 1) <= w) {
        B[i][w] = Math.max(B[i - 1][w], benefit.get(i - 1) + B[i - 1][w - weight.get(i - 1)]);
        } else {
        B[i][w] = B[i - 1][w];
        }
        }
        }

        // Displaying the dynamic table
        System.out.println("Dynamic Programming Table:");
        for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
        System.out.print(B[i][w] + " ");
        }
        System.out.println();
        }


        int w = W;
        System.out.println("Items selected for maximum value:");
        for (int i = n; i > 0; i--) {
        if (B[i][w] != B[i - 1][w]) {
        System.out.println("Item " + i + " (weight: " + weight.get(i - 1) + ", benefit: " + benefit.get(i - 1) + ")");
        w -= weight.get(i - 1);
        }
        }

        // Display the maximum value
        System.out.println("Maximum value: " + B[n][W]);
        }
        }
