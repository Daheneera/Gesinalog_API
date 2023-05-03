package es.mdef.gesinalog_sprint1.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RegisterNotFoundAdvice {

	
		@ResponseBody
		@ExceptionHandler(RegisterNotFoundException.class)
		@ResponseStatus(HttpStatus.NOT_FOUND)
		String incidenciaNotFoundHandler(RegisterNotFoundException ex) {
			return ex.getMessage();
		}
}
