package one.digitalinnovation.santander.yasp.common.dto.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(final String message) {
        super(message);
    }
}
