package com.example.demo.error;

public class PrimaryKeyViolationException extends RuntimeException {
    private static final long serialVersionUID = 5194230440030638533L;

	public PrimaryKeyViolationException(String message) {
        super(message);
    }
}

