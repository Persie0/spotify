package p204p;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class z5h1 {

    /* JADX INFO: renamed from: b */
    public static final z5h1 f279569b = new z5h1();

    /* JADX INFO: renamed from: a */
    public final HashMap f279570a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m95462a(String str, l1h1 l1h1Var) {
        try {
            HashMap map = this.f279570a;
            if (!map.containsKey(str)) {
                map.put(str, l1h1Var);
                return;
            }
            if (((l1h1) map.get(str)).equals(l1h1Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(l1h1Var);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m95463b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m95462a((String) entry.getKey(), (l1h1) entry.getValue());
        }
    }
}
