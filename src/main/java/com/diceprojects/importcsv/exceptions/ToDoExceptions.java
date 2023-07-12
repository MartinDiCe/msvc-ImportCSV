package com.diceprojects.importcsvmeli.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;


@Data
public class ToDoExceptions extends RuntimeException {

    private String message;

    private HttpStatus httpStatus;

    public ToDoExceptions(String message, HttpStatus httpStatus) {

        super(message);
        this.message = message;
        this.httpStatus = httpStatus;

    }
}