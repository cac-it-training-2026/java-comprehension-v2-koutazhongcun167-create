package q02_advanced.question02;

public class MemberManager {

	public void showAllMembers(Member... members) {
		System.out.println("---SHOW DATA---");
		for (Member m : members) {
			m.showMember();
		}
	}

	public void updatePassword(Member[] members, int id, String password) {

		boolean found = false;

		for (Member m : members) {
			if (m.getId() == id) {
				m.setPassword(password);
				found = true;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
