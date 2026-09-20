package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h6v {
    /* JADX INFO: renamed from: a */
    public static String m46749a(String str) {
        Object next;
        Iterator it = i6v.f99336a.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((Map.Entry) next).getValue(), str));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }
}
