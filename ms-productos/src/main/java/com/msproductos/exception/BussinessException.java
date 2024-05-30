package com.msproductos.exception;

public class BussinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String mensaje;

	public BussinessException() {
		super();
	}

	public BussinessException(String message) {
		this.mensaje = message;
	}

	@Override
	public String getMessage() {
		return this.mensaje;
	}

}
