package br.com.roberto2aj;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8913873879409593822L;

	public EntityNotFoundException(String message) {
		super(message);
	}
}
