public interface Greeter {
	void login(Account guest);
	void logout(Account guest);
	void like(Account guest);
}

	/*public void login(Account guest) {
		System.out.println(getLoginMessage(guest));
	}

	private String getLoginMessage(Account guest) {
		switch (guest.getCountry()) {
			case JAPAN:
				return String.format("konnnitiha, %s san.", guest.getName());
			case FRANCE:
				return String.format("Bonjour, %s.", guest.getName());
			case GERMANY:
				return String.format("Guten Tag,%s.", guest.getName());
			case USA:
			default:
				return String.format("Hello, %s.", guest.getName());
		}
	}
	public void logout(Account guest) {
		System.out.println(getLogoutMessage(guest));
	}

	private String getLogoutMessage(Account guest) {
		switch (guest.getCountry()) {
		case JAPAN:
			return "sayounara. ";
		case FRANCE:
			return "Au revoir.";
		case GERMANY:
			return "Aus Wiedersehen.";
		case USA:
		default:
			return "Goodbye.";
		}
	}
}*/

