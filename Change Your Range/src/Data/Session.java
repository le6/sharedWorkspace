package Data;

import java.util.ArrayList;

public class Session {

	ArrayList<Challenge> challenges;
	
	public Session(Challenge init) {
		challenges.add(init);
	}
	
	@SuppressWarnings("unused")
	private void addChallenge(Challenge challenge) {
		challenges.add(challenge);
	}
	
}
