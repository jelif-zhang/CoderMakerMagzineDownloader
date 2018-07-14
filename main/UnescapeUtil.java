import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * An unescape utility class
 * @author Jelif
 * @date 2018-07-14
 */
public class UnescapeUtil {
    private static final Pattern ESCAPE_PATTERN = Pattern.compile("&#(.+?);");

    /**
     * Unescape string that has substring whose pattern like '&#(.+?);'
     */
    public static String unescape(String string){
        Matcher matcher = ESCAPE_PATTERN.matcher(string);
        Map<String,String> escapePairs = new HashMap<>();
        while (matcher.find()){
            escapePairs.put(matcher.group(),String.valueOf(Character.toChars(Integer.parseInt(matcher.group(1)))));
        }
        for(String key:escapePairs.keySet()){
            string = string.replaceAll(key, escapePairs.get(key));
        }
        return string;
    }
}
