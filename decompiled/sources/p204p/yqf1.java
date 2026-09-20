package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yqf1 {
    /* JADX INFO: renamed from: a */
    public static final void m94337a(Object obj, Object obj2) {
        vqf1 vqf1Var = (vqf1) obj;
        ikc0.m50942n(obj2);
        if (vqf1Var.isEmpty()) {
            return;
        }
        Iterator it = vqf1Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
