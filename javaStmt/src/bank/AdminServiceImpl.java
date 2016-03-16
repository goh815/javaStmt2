package bank;

import java.util.Vector;

public class AdminServiceImpl implements AdminService {

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		return null;
	}

	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌 목록 조회
		return null;
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
