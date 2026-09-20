package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hjc1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f92032a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m47681a() {
        LinkedHashMap linkedHashMap = this.f92032a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((mic1) it.next()).m61848b();
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: b */
    public final mic1 m47682b(String str) {
        return (mic1) this.f92032a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m47683c(String str, mic1 mic1Var) {
        mic1 mic1Var2 = (mic1) this.f92032a.put(str, mic1Var);
        if (mic1Var2 != null) {
            mic1Var2.m61848b();
        }
    }
}
