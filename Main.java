import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence");
        String input = scanner.next();
        StringTokenizer stringTokenizer = new StringTokenizer(input,"-");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        Vector<Integer> even = new Vector<>();
        Vector<Integer> odd = new Vector<>();
        for (int i = a; i <= n; i++) {
            if (i%2 == 0)even.add(i);
            else odd.add(i);
        }
        for (int y: odd
        ) {
            if (y == n || y == n-1){
                System.out.println(y);
                break;
            }
            System.out.print(y+",");
        }
        System.out.println();
        if (n%2 != 0) System.out.println("Remove the last page after printing all the odd numbers");
        for (int x: even
        ) {
            if (x == n || x == n-1){
                System.out.println(x);
                break;
            }
            System.out.print(x+",");
        }
    }
}
