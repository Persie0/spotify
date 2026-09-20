package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class tub {

    /* JADX INFO: renamed from: a */
    public final Map f223810a;

    /* JADX INFO: renamed from: b */
    public final Set f223811b;

    public tub(Map map, Set set) {
        this.f223810a = map;
        this.f223811b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tub)) {
            return false;
        }
        tub tubVar = (tub) obj;
        return wj50.m88271j(this.f223810a, tubVar.f223810a) && wj50.m88271j(this.f223811b, tubVar.f223811b);
    }

    public final int hashCode() {
        return this.f223811b.hashCode() + (this.f223810a.hashCode() * 31);
    }
}
