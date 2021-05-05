package homework3Week;

public class UserManager {

	public void add(User user) {

		user.add();
	}

	public void addMultiply(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

	public void delete(User user) {

		user.delete();
	}
}

