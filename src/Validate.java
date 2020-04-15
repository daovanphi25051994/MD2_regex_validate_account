import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_ACCOUNT = "^[a-z0-9_]{6,}$";
    public boolean validateAccount(String string){
        pattern = Pattern.compile(REGEX_ACCOUNT);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
