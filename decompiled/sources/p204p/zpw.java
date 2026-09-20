package p204p;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zpw {

    /* JADX INFO: renamed from: a */
    public static final Pattern f285240a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b */
    public static final Pattern f285241b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f285242c;

    /* JADX INFO: renamed from: d */
    public static final bx3 f285243d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f285242c = Pattern.compile("[ \t\r\n]+");
        f285243d = new bx3(11);
    }

    /* JADX INFO: renamed from: a */
    public static String m96697a(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f285242c.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    /* JADX INFO: renamed from: b */
    public static String m96698b(String str) {
        if (!f285240a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f285241b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f285243d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(dd30.m35691a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
