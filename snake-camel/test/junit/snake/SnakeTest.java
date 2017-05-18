package junit.snake;

import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeTest {

	/*@Test
	public void test() {
		System.out.println("Not yet implemented");
	}*/
	
	@Test
	public void スネークケースをキャメルケースに変換() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		String snake = src.snakeToCamelcase("snake_case");
		String snake2 = src.snakeToCamelcase("abc");
		String snake3 = src.snakeToCamelcase("abc_def");
		String snake4 = src.snakeToCamelcase("abc_def_gh");
		String snake5 = src.snakeToCamelcase("abc__def___gh");
		String snake6 = src.snakeToCamelcase("_abc_def__");
		System.out.println(snake);
		System.out.println(snake2);
		System.out.println(snake3);
		System.out.println(snake4);
		System.out.println(snake5);
		System.out.println(snake6);
		
	}
	
	@Test
	public void キャメルケースをスネークケースに変換() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		String camel = src.camelToSnakecase("CamelCase");
		String camel2 = src.camelToSnakecase("Abc");
		String camel3 = src.camelToSnakecase("AbcDef");
		String camel4 = src.camelToSnakecase("AbcDefGh");
		System.out.println(camel);
		System.out.println(camel2);
		System.out.println(camel3);
		System.out.println(camel4);
	}
	
	@Test
	public void キャピタライズ() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		//String cap1 = src.capitalize("");
		String cap2 = src.capitalize("a");
		String cap3 = src.capitalize("xyz");
		//System.out.println(cap1);
		System.out.println(cap2);
		System.out.println(cap3);
	}
	
	@Test
	public void アンキャピタライズ() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		//String uncap1 = src.uncapitalize("");
		String uncap2 = src.uncapitalize("A");
		String uncap3 = src.uncapitalize("Xyz");
		//System.out.println(uncap1);
		System.out.println(uncap2);
		System.out.println(uncap3);
	}

}
