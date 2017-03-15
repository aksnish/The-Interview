package Random;
import java.util.Arrays;

public class HasPerm {
	public static void main(String[] args) {
		System.out.println(hasPerm("abcdefg", "ba"));
//		System.out.println(hasPerm("abcdefg", "gf"));
//		System.out.println(hasPerm("abcdefg", "dc"));
	}

	public static boolean hasPerm(String source, String find) {
		String k = key(find);
		for (int i = 0; (i + find.length()) <= source.length(); ++i) {
			String sub = source.substring(i, i + find.length());
			if (key(sub).equals(k))

				return true;
		}

		return false;
	}

	private static String key(String s) {
		char[] ary = s.toCharArray();
		System.out.println(ary);
		Arrays.sort(ary);
		return new String(ary);
	}
}