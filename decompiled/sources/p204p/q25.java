package p204p;

import java.net.URI;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q25 implements xpa0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern[] f184481a = {Pattern.compile("spotify:user:([a-zA-Z0-9%_~+.\\-]+)"), Pattern.compile("spotify%3Auser%3A([^%\\s]+)"), Pattern.compile("spotify(?::user:([a-zA-Z0-9%_~+.\\-]+))?:playlist:([a-zA-Z0-9]+)"), Pattern.compile("spotify(?:%3Auser%3A([^%]+))?%3Aplaylist%3A([a-zA-Z0-9]+)"), Pattern.compile("spotify:user:([a-zA-Z0-9%_~+.\\-]+):cluster:([a-zA-Z0-9]+)"), Pattern.compile("spotify%3Auser%3A([a-zA-Z0-9%_~+.\\-]+)%3Acluster%3A([a-zA-Z0-9]+)"), Pattern.compile("searchview/.*username=([^&]+)")};

    @Override // p204p.xpa0
    /* JADX INFO: renamed from: b */
    public final String mo46406b(String str) {
        if (str != null) {
            if (str.indexOf("spotify:user:") < 0 && str.indexOf("spotify%3Auser%3A") < 0 && str.indexOf("spotify:playlist:") < 0 && str.indexOf("spotify%3Aplaylist%3A") < 0 && str.indexOf("searchview/") < 0) {
                return str;
            }
            StringBuilder sb = null;
            for (Pattern pattern : f184481a) {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    if (sb == null) {
                        sb = new StringBuilder(str.length());
                    } else {
                        sb.setLength(0);
                    }
                    int iEnd = 0;
                    do {
                        for (int i = 1; i <= matcher.groupCount(); i++) {
                            int iStart = matcher.start(i);
                            if (iStart != -1) {
                                sb.append((CharSequence) str, iEnd, iStart);
                                sb.append("AnonymizedMarvin");
                                iEnd = matcher.end(i);
                            }
                        }
                    } while (matcher.find());
                    sb.append((CharSequence) str, iEnd, str.length());
                    str = sb.toString();
                }
            }
        }
        return str;
    }

    @Override // p204p.xpa0
    /* JADX INFO: renamed from: e */
    public final String mo46407e(String str, Object... objArr) {
        String strMo46406b;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            String strValueOf = String.valueOf(obj);
            if (obj instanceof URI) {
                URI uri = (URI) obj;
                String scheme = uri.getScheme();
                strMo46406b = ("http".equals(scheme) || pka1.f178421b.equals(scheme)) ? s571.m77252k(scheme, "://", uri.getHost(), "/AnonymizedMarvin") : scheme != null ? scheme.concat(":AnonymizedMarvin") : edb.m38563l("<no colon, ", uri.toString().length(), " characters>");
            } else {
                strMo46406b = mo46406b(strValueOf);
            }
            if (strMo46406b != strValueOf && !strMo46406b.equals(strValueOf)) {
                objArr[i] = strMo46406b;
            }
        }
        return String.format(Locale.US, mo46406b(str), objArr);
    }
}
