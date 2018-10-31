import java.util.Arrays;

class Ex3{

	public String ex3_0(int n){

		if (n > 0) {
			return "その値は正です";
		} else {
			return "その値は０か負です";
		}

	}

	public int ex3_1(int n){

		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
		String message;

		if (a % b == 0) {
			message = String.format("%dは%dの約数です", b, a);
		} else {
			message = String.format ("%dは%dの約数ではありません", b, a);
		}
		return message;

	}

	public String ex3_3(int a, int b){
		String main;
		if (a > b) {
			main = String.format("%dの方が大きいです", a);
		} else if (b > a) {
			main = String.format("%dの方が大きいです", b);
		} else {
			main = "同じ値です";
		}
		return main;
	}

	public String ex3_4(int a){
		String main;
		if (a < 0) {
			main = "正でない整数値です";
		} else if (a % 5 == 0) {
			main = "その値は５で割り切れます";
		} else {
			main = "その値は５で割り切れません";
		}
		return main;
	}
	
	public String ex3_5(int a){
		String main;
		if (a < 0) {
			main = "正でない整数値です";
		} else if (a % 10 == 0) {
			main = "その値は１０の倍数です";
		} else {
			main = "その値は１０の倍数ではありません";
		}
		return main;
	}
		
	public String ex3_6(int a){
		String main;
		if (a < 0) {
			main = "正でない整数値です";
		} else if (a % 3 == 0) {
			main = "その値は３で割り切れます";
		} else if (a % 3 == 1) {
			main = "その値を３で割った余りは１です";
		} else {
			main = "その値を３で割った余りは２です";
		}
		return main;
	}
	
	public String ex3_7(int a){
		String main;
		if (a < 0 || a > 100) {
			main = "範囲(0~100)外の値です";
		} else if (a <= 59) {
			main = "不可";
		} else if (a <= 69) {
			main = "可";
		} else if (a <= 79) {
			main = "良";
		} else {
			main = "優";
		}
		return main;
	}
	
	public double ex3_8(double a, double b){
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public int ex3_9(int a, int b){
		return a - b;
	}

	public String ex3_10(int a, int b){
		String main;
		if (Math.abs(a - b) <= 10) {
			main = "それらの差は１０以下です";
		} else {
			main = "それらの差は１１以上です";
		}
		return main;
	}
	
	public int ex3_11(int a, int b, int c){
		int values[] = {a, b, c};
		int min = a;
		for (int value : values) {
			min = Math.min(min, value);
		}
		return min;
	}
	
	public int ex3_12(int a, int b, int c){

		int values[] = {a , b , c};
		Arrays.sort(values);
		return values[1];
	}

	public String ex3_13(int a){
		String main;
		if (a < 1 || a > 12) {
			main = "範囲(1~12)外の値です";
		} else if (a >= 3 && a <= 5) {
			main = "春";
		} else if (a >= 6 && a <= 8) {
			main = "夏";
		} else if (a >= 9 && a <= 11) {
			main = "秋";
		} else {
			main = "冬";
		}
		return main;
	}
}

