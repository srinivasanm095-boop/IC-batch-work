import java.util.Scanner;
class Hero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int min, max, sum = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        min = max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
            sum = sum + a[i];
        }
        double avg = (double) sum / n;
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + avg);
    }
}