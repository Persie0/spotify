package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g5y {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f76784a;

    public g5y() {
        this.f76784a = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m43631a(skp skpVar, Object obj) {
        LinkedHashMap linkedHashMap = this.f76784a;
        if (obj != null) {
            linkedHashMap.put(skpVar, obj);
        } else {
            linkedHashMap.remove(skpVar);
        }
    }

    public g5y(h5y h5yVar) {
        this.f76784a = kkc0.m56709v0(h5yVar.f87925a);
    }
}
