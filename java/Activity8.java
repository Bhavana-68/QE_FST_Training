package activities;

public class Activity8 {
	public void exceptionTest(String str) throws StringisEmptyException {
		if (str.isEmpty()) {
			throw new StringisEmptyException("String cannot be empty");
		} else {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Activity8 obj = new Activity8();
		try {
			obj.exceptionTest("This will be peinted");
			obj.exceptionTest("");
		} catch (StringisEmptyException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End of Program");
	}

}
