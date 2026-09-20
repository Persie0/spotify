package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class gin0 {

    /* JADX INFO: renamed from: a */
    public final xre f80212a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f80213b = new ConcurrentHashMap();

    public gin0(xre xreVar) {
        this.f80212a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44841a(String str) {
        ConcurrentHashMap concurrentHashMap = this.f80213b;
        Long l = (Long) concurrentHashMap.get(str);
        if (l == null) {
            return false;
        }
        if (fr0.m42463g((wy3) this.f80212a, l.longValue()) <= 120000) {
            return true;
        }
        concurrentHashMap.remove(str);
        return false;
    }
}
