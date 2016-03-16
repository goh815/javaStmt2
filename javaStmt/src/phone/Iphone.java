package phone;

public class Iphone extends Celphon{
	private String data;
	public static String BRAND = "아이폰";
	public static boolean TRUE = true;
	//아이폰은 집전화기는 생산하지 않는다.
	
	public String getDate() {
		return data;
	}
	public void setDate(String data) {
		this.data = data;
	}
	//오버로딩
	public void setDate(String name, String data) {
		this.data = data;
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" + 
				super.isPortable() + "\t" +
				super.getCall() + "\t" + 
				this.data + ": 메세지 전달";
	}
	
}
