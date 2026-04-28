package q01_basic.question05;

public class MemberManager {

	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}

	}
}
