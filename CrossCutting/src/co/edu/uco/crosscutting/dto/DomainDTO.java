package co.edu.uco.crosscutting.dto;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;

class DomainDTO {
	
	private String id;
	
	protected DomainDTO(final String id) {
		setIdentifier(id);
	}

	public String getId() {
		return id;
	}

	public void setIdentifier(final String id) {
		this.id = TextHelper.getDefault(id, UUIDHelper.getDefaultAsString());
	}
	
}
