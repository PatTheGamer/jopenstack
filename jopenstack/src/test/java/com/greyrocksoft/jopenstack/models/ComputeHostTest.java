package com.greyrocksoft.jopenstack.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeHostTest {

	@Test
	public void getName() {
		final ComputeHost host = new ComputeHost("myName",null);
		assertEquals("myName", host.getName());
	}

}
