package org.shekhar.trainings.xebibookstore;

public class NotEnoughBooksInInventoryExceptiopn extends RuntimeException {

	private static final long serialVersionUID = 3756692560252766409L;

	public NotEnoughBooksInInventoryExceptiopn(String message) {
		super(message);
	}
}
