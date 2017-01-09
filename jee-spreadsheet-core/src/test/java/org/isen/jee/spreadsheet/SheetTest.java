package org.isen.jee.spreadsheet;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SheetTest {

	private Sheet sheet;

	@Before
	public void doBefore() {
		sheet = new SheetImpl();
	}

	@Test
	public void can_instanciate_a_spreadSheet() throws Exception {
		assertThat(sheet).isNotNull();
	}

	@Test
	public void can_set_the_value_of_a_cell() throws Exception {
		sheet.setValue("A1", "une valeur");
		assertThat(sheet.getValue("A1")).isEqualTo("une valeur");
	}
}
