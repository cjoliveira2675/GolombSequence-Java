import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = ent.nextInt();
		ent.close();

		int[] a = new int[n+1];

		for (int i = 1; i <= n; i++) {
			a[i] = 1 + a[i-a[a[i-1]]];
			System.out.print(a[i]+" ");
		}
	}
}
//a(n+1) = 1+a(n+1-a(a(n)))