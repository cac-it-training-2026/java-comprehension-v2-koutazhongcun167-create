package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setName("Miura masaya");
		member1.setAge(24);
		member1.setRank(1);

		member1.showMember();
		member1.rankUp();
		System.out.println(">>>RANK UP>>>");
		System.out.println("---GET RANK---");
		System.out.println("newRank:" + member1.getRank());

	}
}
