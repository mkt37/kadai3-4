package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i < words.length) {
			if(words[i].length() == 0) {
				i++;
			}else{
			sb.append(capitalize(words[i]));
			i++;
			}
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String CamelCase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < CamelCase.length(); i++) {
			char c = CamelCase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(CamelCase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(CamelCase.substring(j));
		return new String(sb);
	}
	
	public static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
