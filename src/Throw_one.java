
public class Throw_one {
	private void met1() {
		try {
			met2();
		}catch(Exception e) {
			
		}
	}
	private void met2() {
		try {
			met3();
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
	private void met3() throws Exception {
		try {
			int division=17/0;
		}catch(Exception e) {
			throw new Exception("Enviando exception");
		}
	}
	public static void main(String[] args) {
		Throw_one se = new Throw_one();
		se.met1();
	}
}
