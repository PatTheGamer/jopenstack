package com.greyrocksoft.jopenstack.models;

import java.io.Serializable;
import java.util.ArrayList;

import com.greyrocksoft.jopenstack.models.resources.ComputeResource;

/**
 * ComputeHost represents a Compute Base Node.  The Base node can contain multiple resources
 * which can be allocated during scheduling.
 * @author Ryan Moore
 *
 */
public class ComputeHost implements Serializable {
	private static final long serialVersionUID = 7751749832329425128L;
	
	private final ArrayList<ComputeResource> resources;
	private final String name;
	
	public ComputeHost(final String name, final ArrayList<ComputeResource> resources){
		this.name = name;
		this.resources = resources;
	}
	
	public String getName(){
		return this.name;
	}
}
