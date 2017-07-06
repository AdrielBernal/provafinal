package br.univel;

public class Ex01 {
	public static void execute(int num) {
		String str = String.valueOf(num);
		int parc = Integer.parseInt(str.substring(4, 6));
		Gen g = new Gen(parc, num) {
			public void imprime() {
				System.out.println((this.num % 2) + this.parc);
			}
		};
		parc=0;
		g.imprime();

	}

}
 class Gen {
	protected int num;
	protected int parc;

	public Gen(int parc, int num) {
		this.parc = parc;
		this.num = num;

	}

	public void imprime() {
		System.out.println((num % 2) - this.parc);
	}

}
