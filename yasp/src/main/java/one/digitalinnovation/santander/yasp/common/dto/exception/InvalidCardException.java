package one.digitalinnovation.santander.yasp.common.dto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Invalid Card")
public class InvalidCardException extends RuntimeException {

}
