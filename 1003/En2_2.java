public class En2_2 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println("THREE");
			} else if (i / 10 == 3) {
				System.out.println("THREE");
	   	} else if (i % 10 == 3) {
				System.out.println("THREE");
			}	else {
				System.out.println(i);
			}

			i++;
		}
	}
}

