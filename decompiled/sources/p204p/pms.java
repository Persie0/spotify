package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class pms {

    /* JADX INFO: renamed from: a */
    public final String f179229a;

    /* JADX INFO: renamed from: b */
    public final Map f179230b;

    /* JADX INFO: renamed from: c */
    public final boolean f179231c;

    public pms(String str, Map map, boolean z) {
        this.f179229a = str;
        this.f179230b = map;
        this.f179231c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pms)) {
            return false;
        }
        pms pmsVar = (pms) obj;
        return wj50.m88271j(this.f179229a, pmsVar.f179229a) && wj50.m88271j(this.f179230b, pmsVar.f179230b) && this.f179231c == pmsVar.f179231c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179231c) + edb.m38557f(this.f179229a.hashCode() * 31, 31, this.f179230b);
    }
}
