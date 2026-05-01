package q02_advanced.question02;

import java.io.IOException;

public class SystemMain02 {

	public static void main(String[] args) {

		try {
			ConsoleReader reader = new ConsoleReader();

			Member m1 = Member.getInstance(1, "passw0rd", "Miura Manabu", 28, 2);
			Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

			MemberManager mm = new MemberManager();

			mm.showAllMembers(m1, m2);

			System.out.println("===パスワードを変更します===");

			System.out.print("input target id>>");
			int id = reader.inputNumber();

			System.out.print("input new password>>");
			String pass = reader.inputString();

			mm.updatePassword(new Member[] { m1, m2 }, id, pass);

			mm.showAllMembers(m1, m2);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}
	}
}
