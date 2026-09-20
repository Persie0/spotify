package p204p;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class w9c1 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f249156a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public ArrayList f249157b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9c1)) {
            return false;
        }
        w9c1 w9c1Var = (w9c1) obj;
        return wj50.m88271j(this.f249156a, w9c1Var.f249156a) && wj50.m88271j(this.f249157b, w9c1Var.f249157b);
    }

    public final int hashCode() {
        int iHashCode = this.f249156a.hashCode() * 31;
        ArrayList arrayList = this.f249157b;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }
}
