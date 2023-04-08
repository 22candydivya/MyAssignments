package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		
		System.out.println("Desktop size is 10'");
	}

	public static void main(String[] args) {
		
		Desktop Des=new Desktop();
	    Des.computerModel();
	    Des.desktopSize();
	}
}
