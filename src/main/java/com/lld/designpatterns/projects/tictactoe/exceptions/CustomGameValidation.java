package com.lld.designpatterns.projects.tictactoe.exceptions;

public class CustomGameValidation extends RuntimeException {
	public CustomGameValidation() {
	}

	public CustomGameValidation(String message) {
		super(message);
	}

	public CustomGameValidation(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomGameValidation(Throwable cause) {
		super(cause);
	}

	public CustomGameValidation(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
