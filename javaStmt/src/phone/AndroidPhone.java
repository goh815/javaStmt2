package phone;

public class AndroidPhone extends Iphone {
	public static String BRAND = "안드로이드폰";
	private String size;
	private String data;//부모
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String data, String name,String size) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		this.setSize(size);
		this.data= 
				super.setCompany();
				super.isPortable();
				
	}

}
