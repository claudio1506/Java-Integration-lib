package maxiPago.DataContract.Reports;

public class HeaderResponse {

    private String errorCode;

    private String errorMsg;

    private String command;

    private String time;
	
    public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getCommand() {
		return command;
	}

	public String getTime() {
		return time;
	}

	
}
