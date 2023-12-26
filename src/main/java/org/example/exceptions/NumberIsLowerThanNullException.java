package org.example.exceptions;

public class NumberIsLowerThanNullException extends RuntimeException {
    public NumberIsLowerThanNullException(String message) {
        super(message);
    }
}
