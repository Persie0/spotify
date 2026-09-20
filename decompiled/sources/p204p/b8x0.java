package p204p;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b8x0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f24690a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashSet f24691b = new HashSet();

    /* JADX INFO: renamed from: a */
    public static String m28438a(String str, Type type) {
        return str + type;
    }

    /* JADX INFO: renamed from: b */
    public final void m28439b(String str, c7x0 c7x0Var, Type type) {
        Object next;
        String strM28438a;
        boolean z = c7x0Var instanceof n6x0;
        HashSet hashSet = this.f24691b;
        if (z) {
            strM28438a = m28438a(str, ((n6x0) c7x0Var).f150980a.getClass());
        } else if (type instanceof e3a1) {
            Iterator it = hashSet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!bm51.m29803n0((String) next, str, false));
            strM28438a = (String) next;
        } else {
            strM28438a = m28438a(str, type);
        }
        if (strM28438a == null || !hashSet.contains(strM28438a)) {
            return;
        }
        this.f24690a.put(strM28438a, c7x0Var);
        hashSet.remove(strM28438a);
    }
}
