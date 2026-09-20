package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nhc0 {
    /* JADX INFO: renamed from: a */
    public static void m64468a(Object obj, Object obj2) {
        hhc0 hhc0Var = (hhc0) obj;
        ikc0.m50942n(obj2);
        if (hhc0Var.isEmpty()) {
            return;
        }
        Iterator it = hhc0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static hhc0 m64469b(Object obj, Object obj2) {
        hhc0 hhc0VarM47512i = (hhc0) obj;
        hhc0 hhc0Var = (hhc0) obj2;
        if (!hhc0Var.isEmpty()) {
            if (!hhc0VarM47512i.m47509e()) {
                hhc0VarM47512i = hhc0VarM47512i.m47512i();
            }
            hhc0VarM47512i.m47511h(hhc0Var);
        }
        return hhc0VarM47512i;
    }
}
