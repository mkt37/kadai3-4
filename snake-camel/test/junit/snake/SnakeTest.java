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
		System.out.println(snake);
	}
	
	@Test
	public void キャメルケースをスネークケースに変換() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		String camel = src.camelToSnakecase("CamelCase");
		System.out.println(camel);
	}

}
