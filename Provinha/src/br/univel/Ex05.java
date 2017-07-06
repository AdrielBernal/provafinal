package br.univel;

interface Show {
	void Show(Integer num);
}

class A implements Show {

	@Override
	public void Show(Integer num) {
		String str = String.valueOf(num);
		int result = Integer.parseInt(str.substring(5, 6));
		if (result > 10) {
			result = result % 10;
		}
		System.out.println(result);
	}

}

class B extends A {
	@Override
	public void Show(Integer num) {
		super.Show(num + 1000);
	}
}

public class Ex05 {
	public static void execute(Integer num) {
		Show s = new B();
		s.Show(num);
	}

}
