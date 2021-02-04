import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
	public static void main(String[] args) {
		// The model is passed!
		Pattern pattern = Pattern.compile("(?:\\+|-)?(?:\\d*(?:\\.\\d*)?)\\(x(?:\\+|-)\\d+(?:\\.\\d*)?\\)\\^2(?:(?:\\+|-)\\d+(?:\\.\\d*)?)?");
		System.out.println(pattern.matcher("(x+1)^2").find());
		System.out.println(pattern.matcher("(x-1)^2").find());
		System.out.println(pattern.matcher("+(x+1)^2").find());
		System.out.println(pattern.matcher("-(x+1)^2").find());
		System.out.println(pattern.matcher("3(x+1.5)^2").find());
		System.out.println(pattern.matcher("3(x+1.5)^2").find());
		System.out.println(pattern.matcher("3(x+1)^2").find());
		System.out.println(pattern.matcher("3.5(x+1)^2").find());
		System.out.println(pattern.matcher("-3(x+1)^2").find());
		System.out.println(pattern.matcher("-3.5(x+1)^2").find());
		System.out.println(pattern.matcher("(x+1)^2+3").find());
		System.out.println(pattern.matcher("(x+1)^2+3.5").find());
		System.out.println(pattern.matcher("(x+1)^2-3").find());
		System.out.println(pattern.matcher("(x+1)^2-3.5").find());
		System.out.println(pattern.matcher("3(x+1)^2+3").find());
		System.out.println(pattern.matcher("3(x+1)^2+3.5").find());
		System.out.println(pattern.matcher("3(x+1)^2-3").find());
		System.out.println(pattern.matcher("3(x+1)^2-3.5").find());
		System.out.println(pattern.matcher("3.5(x+1)^2+3").find());
		System.out.println(pattern.matcher("3.5(x+1)^2+3.5").find());
		System.out.println(pattern.matcher("3.5(x+1)^2-3").find());
		System.out.println(pattern.matcher("3.5(x+1)^2-3.5").find());
		System.out.println(pattern.matcher("-3(x+1)^2+3").find());
		System.out.println(pattern.matcher("-3(x+1)^2+3.5").find());
		System.out.println(pattern.matcher("-3(x+1)^2-3").find());
		System.out.println(pattern.matcher("-3(x+1)^2-3.5").find());
		System.out.println(pattern.matcher("-3.5(x+1)^2+3").find());
		System.out.println(pattern.matcher("-3.5(x+1)^2+3.5").find());
		System.out.println(pattern.matcher("-3.5(x+1)^2-3").find());
		System.out.println(pattern.matcher("-3.5(x+1)^2-3.5").find());
	}
}
