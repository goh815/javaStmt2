package forloop;

public class FacktorOf5 {
	int endNum=0, count=0, sum=0;

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
		
		for(int i =1; i <= endNum; i++ ){
			if(i % 5 == 0){
				count++; 
				sum += i;
			}
		}
	}

	public int getCount() {
		return count;
	}

	public int getSum() {
		return sum;
	}
}
