package p204p;

import java.net.URI;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dix0 {

    /* JADX INFO: renamed from: a */
    public static final urv0 f49505a = new urv0("[^A-Za-z0-9/_.-]");

    /* JADX INFO: renamed from: b */
    public static final urv0 f49506b = new urv0("^[A-Za-z0-9_.-]+$");

    /* JADX INFO: renamed from: c */
    public static final urv0 f49507c = new urv0("[^A-Za-z0-9_.-]");

    /* JADX INFO: renamed from: a */
    public static final String m36137a(String str) {
        boolean zM83873e = f49506b.m83873e(str);
        String strM83875g = f49507c.m83875g(str.replace('/', '.'), "_");
        int length = strM83875g.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = strM83875g.charAt(!z ? i : length);
            boolean z2 = cCharAt == '.' || cCharAt == '_' || cCharAt == '-';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = strM83875g.subSequence(i, length + 1).toString();
        if (wl51.m88460J0(string)) {
            string = "resource";
        }
        return zM83873e ? string : klh.m56834f(string, "-", g6f.m43753y0(bk5.m29606c1(MessageDigest.getInstance("SHA-256").digest(str.getBytes(vuc.f244913a)), 4), "", null, null, n7x0.f151255Z0, 30));
    }

    /* JADX INFO: renamed from: b */
    public static final String m36138b(String str) {
        Object c6x0Var;
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                if (wl51.m88460J0(lowerCase)) {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    c6x0Var = null;
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "/";
                    } else {
                        if (wl51.m88460J0(path)) {
                            path = null;
                        }
                        if (path == null) {
                            path = "/";
                        }
                    }
                    c6x0Var = f49505a.m83875g(lowerCase.concat(path), "_");
                }
            } else {
                c6x0Var = null;
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        String str2 = (String) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        return str2 == null ? "unresolved" : str2;
    }
}
