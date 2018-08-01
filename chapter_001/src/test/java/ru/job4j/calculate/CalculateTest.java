package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Pavel Vladi (mailto:w.h.81@mail.ru) 
* @version $id$
* @since 0.1
*/

public class CalculateTest{
	/**
	* Test echo
	*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName(){
		String input = "Pavel Vladi";
		String expect = "Echo, echo, echo : Pavel Vladi";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}