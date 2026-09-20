package p204p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ipd1 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f104475c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f104476d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final l2n0 f104477a = new l2n0();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f104478b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m51254a(l2n0 l2n0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = l2n0Var.f129055b;
        int i2 = l2n0Var.f129056c;
        while (i < i2 && !z) {
            char c = (char) l2n0Var.f129054a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        l2n0Var.m57931S(i - l2n0Var.f129055b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m51255b(l2n0 l2n0Var, StringBuilder sb) {
        m51256c(l2n0Var);
        if (l2n0Var.m57932a() == 0) {
            return null;
        }
        String strM51254a = m51254a(l2n0Var, sb);
        if (!strM51254a.isEmpty()) {
            return strM51254a;
        }
        return "" + ((char) l2n0Var.m57917E());
    }

    /* JADX INFO: renamed from: c */
    public static void m51256c(l2n0 l2n0Var) {
        while (true) {
            for (boolean z = true; l2n0Var.m57932a() > 0 && z; z = false) {
                int i = l2n0Var.f129055b;
                byte[] bArr = l2n0Var.f129054a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    l2n0Var.m57931S(1);
                } else {
                    int i2 = l2n0Var.f129056c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            l2n0Var.m57931S(i2 - l2n0Var.f129055b);
                        }
                    }
                }
            }
            return;
        }
    }
}
