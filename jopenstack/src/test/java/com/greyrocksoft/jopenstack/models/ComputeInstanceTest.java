package com.greyrocksoft.jopenstack.models;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class ComputeInstanceTest {

	@Test
	public void getIdTest() {
		final UUID uuid = UUID.randomUUID();
		final ComputeInstance instance = new ComputeInstance(uuid);
		assertNotNull(instance.getId());
		assertSame(uuid, instance.getId());
	}

}
