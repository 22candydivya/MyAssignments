package week1.day1;

public class Mobile {
	
	private void makecall(){
		
		String mobilemodel= "Samsung";
		float mobileweight = 0.5f;
		System.out.println("makecall");
		System.out.println(mobilemodel);
		System.out.println(mobileweight);
	}
	
	protected void sendsms() {
		
		boolean fullcharged = true;
		int mobilecost = 10000;
		System.out.println("sendsms");
		System.out.println(fullcharged);
		System.out.println(mobilecost);
	}
	
	public static void main(String[] args) {
		
		Mobile obj= new Mobile();
		obj.makecall();
		obj.sendsms();		
		System.out.println("This is my mobile");
	
	}
	
	

}
