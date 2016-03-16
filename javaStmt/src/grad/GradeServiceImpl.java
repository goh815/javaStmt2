package grad;

import java.util.ArrayList;
import java.util.ArrayList;

public class GradeServiceImpl implements GradeService{
	//멤버 필드
	private ArrayList<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		// 성적표 등록
		gradeList = new ArrayList<GradeBean>();
	}
	
	//맴버 메소드 에어리어
	@Override
	public void input(GradeBean grade) {
		// TODO Auto-generated method stub
		//int a = 0 // 지역변수 초기화
		gradeList.add(new GradeBean(1, "일등", 90, 87, 56, 76));
		gradeList.add(new GradeBean(2, "이등", 50, 67, 96, 79));
		gradeList.add(new GradeBean(3, "삼등", 60, 34, 30, 49));
		gradeList.add(new GradeBean(4, "사등", 30, 67, 70, 96));
		gradeList.add(new GradeBean(5, "오등", 60, 80, 51, 88));
		gradeList.add(grade);
	}

	@Override
	public ArrayList<GradeBean> getList() {
		// 성적표 리스트 출력		
		return gradeList;
	}

	@Override
	public GradeBean getGradeByHak(int hak) {
		// R 성적표 조회(이름)
		
		GradeBean tempGrade = new GradeBean();
		for (int i = 0; i < gradeList.size(); i++) {
			
			int searchHak = gradeList.get(i).getHak();
			if (hak != searchHak){
				tempGrade = gradeList.get(i);	
				break;
			}
		}
		return tempGrade;
	}

	@Override
	public ArrayList<GradeBean> getGradeByName(String name) {
		// R 성적표 조회(이름)
		ArrayList<GradeBean> tempList = new ArrayList<GradeBean>();
		
		for (int i = 0; i < gradeList.size(); i++) {
			if (name.equals(gradeList.get(i).getName())) {
				tempList.add(gradeList.get(i));
			} 
		}
		return tempList;
	}

	@Override
	public String update(GradeBean grade) {
		// U 성적표 수정
		String result ="수정한 학번이 존재하지 않음";
		if (gradeList.contains(getGradeByHak(grade.getHak()))) {
		GradeBean searchGrade = getGradeByHak(grade.getHak());
		searchGrade.setJava(grade.getJava());
		searchGrade.setSql(grade.getSql());
		searchGrade.setJsp(grade.getJsp());
		searchGrade.setSpring(grade.getSpring());
		result = "수정성공";
		}
		return result;
	}
		
	@Override
	public String delete(int hak) {
		// D 성적표 삭제
		return (gradeList.remove(this.getGradeByHak(hak))) ? "삭제성공" : "삭제 실패";
		
	}
	
	@Override
	public int getCount() {
		// 회원수
		return gradeList.size();
	}

	@Override
	public void getCountByName() {
		// 
		
	}

}