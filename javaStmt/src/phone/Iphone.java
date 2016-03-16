package phone;

public class Iphone extends Celphon{
	private String date;
	public static String BRAND = "아이폰";
	public static boolean TRUE = true;
	//아이폰은 집전화기는 생산하지 않는다.
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	//오버로딩
	public void setDate(String date, String name) {
		this.date = date;
		super.setPortable(true);
	
	}
	
}
