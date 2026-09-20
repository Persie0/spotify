package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class oms {

    /* JADX INFO: renamed from: a */
    public final String f167083a;

    /* JADX INFO: renamed from: b */
    public final Map f167084b;

    /* JADX INFO: renamed from: c */
    public final boolean f167085c;

    public oms(String str, Map map, boolean z) {
        this.f167083a = str;
        this.f167084b = map;
        this.f167085c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oms)) {
            return false;
        }
        oms omsVar = (oms) obj;
        return wj50.m88271j(this.f167083a, omsVar.f167083a) && wj50.m88271j(this.f167084b, omsVar.f167084b) && this.f167085c == omsVar.f167085c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167085c) + edb.m38557f(this.f167083a.hashCode() * 31, 31, this.f167084b);
    }
}
