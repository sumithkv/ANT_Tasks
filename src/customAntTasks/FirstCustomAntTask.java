package customAntTasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class FirstCustomAntTask extends Task {
	private int op1;
	private int op2;
	private int sum;

	// The setter for the "op1" attribute
	public void setOp1(int op1) {
		this.op1 = op1;
	}

	// The setter for the "op2" attribute
	public void setOp2(int op2) {
		this.op2 = op2;
	}

	// The method executing the task
	public void execute() throws BuildException {
		sum = op1 + op2;
		System.out.println("The sum of the " + op1 + " & " + op2 + " is " + sum + "...");
	}

}
