package org.isen.jee.spreadsheet;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SheetTest {



	@Test
	public void can_instanciate_a_spreadSheet() throws Exception {
		Sheet sheet = new SheetImpl();
		assertThat(sheet).isNotNull();
	}
}
