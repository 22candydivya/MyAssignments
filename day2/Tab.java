package week1.day2;

public class Tab {
	
	public int tabPrice(int tabPrice) {
		return tabPrice;
		
	}
	
	public String tabBrand(String brandName) {
		return brandName;
	}
	
	public static void main(String[] args) {
		Tab tab= new Tab();
		String brand=tab.tabBrand("samsung tab");
		int price=tab.tabPrice(20000);
		 System.out.println("Tab brand is:" + brand);
		 System.out.println("Tab price is:" + price);
	}
	

}
