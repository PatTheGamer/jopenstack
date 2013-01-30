package com.greyrocksoft.jopenstack.models;

import java.io.Serializable;
import java.util.UUID;

/**
 * This represents a compute instance on a {@link ComputeHost}.
 * @author Ryan Moore
 *
 */
public class ComputeInstance implements Serializable {
	private static final long serialVersionUID = 5319666058367863976L;
	private final UUID id;
	
	public ComputeInstance(final UUID id){
		this.id = id;
	}
	
	public UUID getId(){
		return this.id;
	}

}
