package Data;

import java.util.Random;

public class Challenge {

	/*
	 each element in the array includes a different task and specifies in what way the task should be completed if at all
	 1)type of club
	 2)to be determined
	 3)to be determined
	 4)to be determined
	 5)to be determined
	 6)to be determined
	 7)to be determined
	 8)to be determined
	 9)to be determined
	 */
	static int[] tasks = new int[9];
	//the number of tries the user took to complete the challenge
	int tries;
	//specifies whether the task was successfully completed or discarded
	boolean success = false;
	//specifies which tasks are randomized
	boolean[] randomTasks = new boolean[tasks.length];
	
	//creates a challenge with the given tasks
	public Challenge(boolean[] randomTasks) {
		Challenge.tasks = rollTasks(randomTasks);
	}
	
	//increases the number of tries taken for a challenge
	@SuppressWarnings("unused")
	private void increaseTries() {
		this.tries++;
	}
	
	//flags a challenge as 'completed'
	@SuppressWarnings("unused")
	private void complete() {
		this.success = true;
	}
	
	//changes whether a task should be randomized or not
	@SuppressWarnings("unused")
	private void changeRandomizedTasks(int index) {
		if(randomTasks[index]==true) {
			randomTasks[index]=false;
		}else {
			randomTasks[index]=true;
		}
	}
	
	//creates an array of the chose randomized tasks, sets -1 if the task isn't randomized
	@SuppressWarnings("unused")
	private int[] rollTasks(boolean[] choiceOfTasks) {
		int[] randomizedTasks = new int[9];
		Random rand = new Random();
		for(int i=0; i<randomizedTasks.length;i++) {
			if(choiceOfTasks[i]==true) {
				randomizedTasks[i] = rand.nextInt(9);
			}else {
				randomizedTasks[i] = -1;
			}
		}
		return randomizedTasks;
	}
	//to do: only a specific subset of a certain task can be rolled, allow some tasks to have a 'fixed' value

	public static int[] getTasks() {
		return tasks;
	}

	public void setTasks(int[] tasks) {
		Challenge.tasks = tasks;
	}

	public int getTries() {
		return tries;
	}

	public void setTries(int tries) {
		this.tries = tries;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean[] getRandomTasks() {
		return randomTasks;
	}

	public void setRandomTasks(boolean[] randomTasks) {
		this.randomTasks = randomTasks;
	}
	
	
	
	
	
}
