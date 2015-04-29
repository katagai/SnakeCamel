package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseÇê≥ÇµÇ≠Ç∑ÇÈ(){
		SnakeCamelUtil acu = new SnakeCamelUtil();
		String s = "AbcDefGhi";
		String s2 = acu.snakeToCamelcase("abc_def_ghi");
		assertThat(s,is(s2));
	}
	@Test
	public void camelToSnakecaseÇê≥ÇµÇ≠Ç∑ÇÈ(){
		SnakeCamelUtil acu = new SnakeCamelUtil();
		String s = "abc_def_ghi";
		String s2 = acu.camelToSnakecase("AbcDefGhi");
		assertThat(s,is(s2));
	}
	@Test
	public void capitalize(){
		SnakeCamelUtil acu = new SnakeCamelUtil();
		String s = "Abc";
		String s2 = acu.capitalize("abc");
		assertThat(s,is(s2));
	}
	@Test
	public void uncapitalize(){
		SnakeCamelUtil acu = new SnakeCamelUtil();
		String s = "abc";
		String s2 = acu.uncapitalize("Abc");
		assertThat(s,is(s2));
	}

}
