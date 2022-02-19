package by.it_academy.popko.homework;

public class FirstHomework {

	public static void main(String[] args) {
		
		solveFirstTask(1223);
		
		solveSecondTask(1.0, 2.0, 3.0); 
		
		solveThirdTask(3.0, 4.0);
		
		solveFourthTask(4, 3);
		
		solveFifthTask();
		
		solveSixthTask(7, -12, 16);
		
		solveSeventhTask(1, 7, 1);
		
		solveEighthTask(4);
		
		solveNinthTask(5, 3, 2);
		
		solveTenthTask(6);
		
	}

	public static void solveFirstTask(int x) {

		int a = x % 10;
		int b = (x / 10) % 10;
		int c = (x / 100) % 10;
		int d = x / 1000;

		int y = a + b;

		int z = c + d;

		System.out.println("Task1: " + (y == z) + '\n');
	}

	public static void solveSecondTask(double a, double b, double c) {

		double z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - (Math.pow(a, 3)) * c + Math.pow(b, -2);

		System.out.println("Task2: " + z + '\n');
	}

	public static void solveThirdTask(double a, double b) {

		double c = Math.sqrt(a * a + b * b);

		double z = a + b + c;

		double y = (a * b) / 2;

		System.out.println("Task3: " + "perimeter = " + z + ", area = " + y + '\n');
	}

	public static void solveFourthTask(int ax, int ay) {

		int x1 = 4;
		int x2 = -4;
		int y1 = 3;
		int y2 = -3;
		int x3 = 5;
		int x4 = -5;

		boolean c = false;
		boolean d = false;

		System.out.print("Task4: ");

		if (ax >= x2 && ax <= x1 && ay >= 0 && ay <= y1) {

			c = true;
		}

		if (ax >= x4 && ax <= x3 && ay <= 0 && ay >= y2) {

			d = true;
		}

		if (c == true || d == true) {
			
			System.out.println("the point falls within the shaded area" + '\n');
			
		} else {
			
			System.out.println("the point is NOT in the shaded area" + '\n');
		}
	}

	public static void solveFifthTask() {

		int[] mas = { -3, 5, 4 };

		System.out.print("Task5: ");

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < 0) {

				int m = (int) Math.pow(mas[i], 4);
				
				System.out.print(m + ", ");

			} else {

				int n = mas[i] * mas[i];
				
				System.out.print(n + ", ");
			}
		}
		
		System.out.println('\n');
	}

	public static void solveSixthTask(int a, int b, int c) {

		int max;
		int min;

		if (a > b) {

			max = a;
			min = b;

		} else {

			max = b;
			min = a;

		}

		if (c > max) {

			max = c;

		} else if (c < min) {

			min = c;
		}

		int sum = max + min;

		System.out.println("Task6: " + sum + '\n');
	}

	public static void solveSeventhTask(int a, int b, int h) {

		System.out.println("Task7: " + '\n');
		System.out.println("+-----------------------+--------------------+");
		System.out.println("| Argument value [x] " + " 	| " + "Function value [F] |");
		System.out.println("+-----------------------+--------------------+");

		for (int i = a; i <= b; i = i + h) {

			double x = i;

			double F = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);

			System.out.printf("| \t[%4.2f]\t\t|\t[%4.2f]\t     |\n", x, F);
		}

		System.out.println("+-----------------------+--------------------+" + '\n');
	}

	public static void solveEighthTask(int k) {

		int[] arr = new int[10];

		int sum = 0;

		System.out.println("Task8:" + '\n');

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 101);
			
			System.out.printf("[%2d]", arr[i]);

			if (arr[i] % k == 0) {

				sum = sum + arr[i];
			}
		}
		
		System.out.println();		
		System.out.println("sum = " + sum + '\n');
	}

	public static void solveNinthTask(int n, int m, int k) {

		int[] arr = new int[n];
		int[] mas = new int[m];
		int[] newArray = new int[n + m];

		System.out.println("Task9:" + '\n');

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10);
			
			System.out.printf("[%2d]", arr[i]);
		}
		
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = (int) (Math.random() * 10);
			
			System.out.printf("[%2d]", mas[i]);
		}

		int t = 0;

		for (int i = 0; i < k; i++) {

			newArray[t] = arr[i];
			t++;
		}

		for (int i = 0; i < mas.length; i++) {

			newArray[t] = mas[i];
			t++;
		}

		for (int i = k; i < arr.length; i++) {

			newArray[t] = arr[i];
			t++;
		}

		System.out.println();

		for (int i = 0; i < newArray.length; i++) {

			System.out.printf("[%2d]", newArray[i]);
		}
		
		System.out.println('\n');
	}

	public static void solveTenthTask(int n) {

		int[][] mas = new int[n][n];
		
		System.out.println("Task10:" + '\n');

		for (int i = 0; i < mas.length; i = i + 2) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = j + 1;
				mas[i + 1][j] = mas[i].length - j;
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("%2d ", mas[i][j]);
			}

			System.out.println();
		}
	}
}
