package p204p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v8t {
    /* JADX INFO: renamed from: a */
    public static String m84927a(v8t v8tVar) {
        List listM46715L;
        v8tVar.getClass();
        a340 a340Var = a340.f11861b;
        int iOrdinal = a340Var.ordinal();
        if (iOrdinal != 1) {
            a340 a340Var2 = a340.f11862c;
            if (iOrdinal != 3) {
                listM46715L = iOrdinal != 4 ? Collections.singletonList(a340Var) : h6f.m46715L(a340.f11863d, a340Var2, a340Var);
            } else {
                listM46715L = h6f.m46715L(a340Var2, a340Var);
            }
        } else {
            listM46715L = h6f.m46715L(a340.f11860a, a340Var);
        }
        Iterator it = listM46715L.iterator();
        if (it.hasNext()) {
            throw null;
        }
        z240 z240Var = (z240) g6f.m43745s0(null);
        if (z240Var != null) {
            return z240Var.f278475a.f198763a;
        }
        return null;
    }
}
