package co.edu.uco.crosscutting.entity;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;

class DomainEntity {
	
	private UUID id;
	
	protected DomainEntity(final UUID id) {
		setId(id);
	}

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	
}
