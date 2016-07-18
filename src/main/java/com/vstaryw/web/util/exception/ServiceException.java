package main.java.com.vstaryw.web.util.exception;


public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5152569674152711883L;
	private String errorCode;
	
	public ServiceException(String errMsg, Throwable cause) {
		super(errMsg,cause);
	}
	public ServiceException(String erCode, String errMsg) {
		super(errMsg);
		this.errorCode = erCode;
	}

	public ServiceException(String erCode, String errMsg, Throwable ex) {
		super(errMsg,ex);
		this.errorCode = erCode;
	}
	
	public String getErrorCode(){
		return errorCode;
	}

}
