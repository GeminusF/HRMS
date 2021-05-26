package javacamp.hrms.core.utilities.result;

public class Result {

	String message;
	boolean success;

	public Result(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	
	public Result(String message) {
		super();
		this.message = message;
	}


	public Result(boolean success) {
		super();
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public boolean isSuccess() {
		return success;
	}

}
