import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static String[] className = {"C1221H","A1221M","C1221h","B4212M"};
    public static void main(String[] args) {
        String regex ="^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
        Pattern p = Pattern.compile(regex);
        for (String name:className
             ) {
            Matcher m = p.matcher(name);
            System.out.println("Class name "+name+" is valid? "+ (m.matches()));
        }

    }
}
