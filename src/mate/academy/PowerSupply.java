package mate.academy;

public class PowerSupply {

	int inputVAC;
	int outputVDC;

	boolean stateInput;
	boolean operationMode;
	boolean stateOutput;

	String inputInfo = "";

	public void statePS(int input, boolean stateIn, boolean mode, boolean stateOut) {

		inputVAC = input;
		stateInput = stateIn;
		operationMode = mode;
		stateOutput = stateOut;

		outputVDC = stateOut ? 0 : (mode ? 12 : 5);

		if (input > 0 && input < 200) {
			inputInfo = "Low voltage - Power Supply OFF!!!";
			stateIn = false;
		} else if (input >= 250) {
			inputInfo = "High voltage - Power Supply OFF!!!";
			stateIn = false;
		}

	}

	public void infoPS() {

		System.out.println(
				"Power Supply info: \n" + "Input state - " + (stateInput ? "ON" : "OFF") + "\n" + "Input power - "
						+ inputVAC + " VAC " + inputInfo + "\n" + "Output mode - " + (operationMode ? "12 VDC" : "5 VDC") + "\n"
						+ "Output state - " + (stateOutput ? "ON" : "OFF") + " " + outputVDC + " VDC");

	}

}
