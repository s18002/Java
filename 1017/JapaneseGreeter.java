public class JapaneseGreeter implements Greeter {
	@Override
	public void login(Account guest) {
		System.out.println(String.format(
					"konnnitiha, %s san. ", guest.getName()));
	}

	@Override
	public void logout(Account guest) {
		System.out.println("sayounara.");
	}

	@Override
	public void like(Account guest) {
		System.out.println("arigatougozaimasu.");
	}
}

