package com.teste;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
//		List<String> lista = new ArrayList<String>();
//		lista.add("Teste1");
//		lista.get(0);
		new ArrayList<Object>().get(0);
	}
	
	@Rule
	public ExpectedException thrown  = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index 0 out of bounds for length 0");
		list.get(0);
		
	}
	
	@Test
	public void testExpectionMessage() {
		try {
			new ArrayList<Object>().get(0);
			
			fail("Esperado que IndexOutOfBoundsException seja lan�ada");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), Is.is("Index 0 out of bounds for length 0"));
		}
	}
}
