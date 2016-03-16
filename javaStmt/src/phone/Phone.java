package phone;

/**
 * @file Phone.java
 * @author USER
 * @date 2016. 3. 16.
 * @story
 */
public class Phone {
	private String company, call;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 걸었습니다.";
	}
}
