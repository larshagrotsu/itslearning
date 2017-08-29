package se.su.it.itslearning.integration.common.util;
/**
 * Created by lhagr on 2017-08-29.
 */
public class ItslearningRuntimeException extends RuntimeException{
    public ItslearningRuntimeException(Throwable t) {
        super(t);
    }

    public ItslearningRuntimeException(String message,Throwable t) {
        super(message,t);
    }


}
