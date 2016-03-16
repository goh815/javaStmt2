package member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService{

	HashMap<String, MemberBean> map;
	public MemberServiceImpl() {
		// 생성자도 메소드이다.
		
		map = new HashMap<String, MemberBean>();
	}
	@Override
	public void join(MemberBean member) {
		// 회원가입
		map.put(member.getId(), member);		
	}

	@Override
	public void login(String id, String password) {
		// 로그인
		//아이디가 존재하지 않아서 실패한 경우와 비번이 들려서 실패한 경우
		//메시지를 전달해줘야 함.
		
	}

	@Override
	public void update(MemberBean member) {
		// 수정
		
	}

	@Override
	public void remove(String id) {
		// 삭제
		
	}

	@Override
	public void detail(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
