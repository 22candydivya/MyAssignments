package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation aut= new Automation();
		aut.python();
		aut.ruby();
		aut.java();
		aut.selenium();

	}

	public void selenium() {
		System.out.println("Selenium");
	}

	public void java() {
		System.out.println("Java");
		
	}

	

}
