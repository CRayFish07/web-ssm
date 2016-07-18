package main.java.com.vstaryw.web.util.exception;


public class DaoException extends RuntimeException {
	private static final long serialVersionUID = 4425887624595498855L;
	private static final String ERROR_CODE = "-1";
	private String errorCode;
	
	public DaoException(String msg) {
		super(msg);
		this.errorCode = ERROR_CODE;
	}
	public DaoException(String msg, Throwable ex) {
		super(msg,ex);
		this.errorCode = ERROR_CODE;
	}
	public DaoException(String erCode, String msg) {
		super(msg);
		this.errorCode = erCode;
	}

	public DaoException(String erCode, String msg, Throwable ex) {
		super(msg,ex);
		this.errorCode = erCode;
	}

	public String getErrorCode(){
		return errorCode;
	}
}
