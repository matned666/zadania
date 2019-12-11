public class MyVariousException extends Exception{

    public MyVariousException() {
    }

    public MyVariousException(String message) {
        super(message);
    }

    public MyVariousException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyVariousException(Throwable cause) {
        super(cause);
    }

    public MyVariousException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
