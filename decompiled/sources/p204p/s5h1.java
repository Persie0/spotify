package p204p;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class s5h1 {

    /* JADX INFO: renamed from: b */
    public static final s5h1 f205833b;

    /* JADX INFO: renamed from: a */
    public final HashMap f205834a = new HashMap();

    static {
        y6f1 y6f1Var = y6f1.f269776c;
        s5h1 s5h1Var = new s5h1();
        try {
            s5h1Var.m77274a(y6f1Var, i5h1.class);
            f205833b = s5h1Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m77274a(h4h1 h4h1Var, Class cls) {
        try {
            HashMap map = this.f205834a;
            h4h1 h4h1Var2 = (h4h1) map.get(cls);
            if (h4h1Var2 != null && !h4h1Var2.equals(h4h1Var)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, h4h1Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
