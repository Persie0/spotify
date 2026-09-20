package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dpn0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap f51373a;

    public dpn0() {
        this.f51373a = new HashMap();
    }

    private final Object writeReplace() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            return new cpn0(this.f51373a);
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36580a(C1975id c1975id, List list) {
        HashMap map = this.f51373a;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (!map.containsKey(c1975id)) {
                map.put(c1975id, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(c1975id);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    public dpn0(HashMap map) {
        HashMap map2 = new HashMap();
        this.f51373a = map2;
        map2.putAll(map);
    }
}
