package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a5v0 {

    /* JADX INFO: renamed from: a */
    public final Map f12601a;

    /* JADX INFO: renamed from: b */
    public final Map f12602b;

    /* JADX INFO: renamed from: c */
    public final String f12603c;

    /* JADX INFO: renamed from: d */
    public final Set f12604d;

    /* JADX INFO: renamed from: e */
    public final Map f12605e;

    public a5v0(Map map, Map map2, String str, Set set, Map map3) {
        this.f12601a = map;
        this.f12602b = map2;
        this.f12603c = str;
        this.f12604d = set;
        this.f12605e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5v0)) {
            return false;
        }
        a5v0 a5v0Var = (a5v0) obj;
        return wj50.m88271j(this.f12601a, a5v0Var.f12601a) && wj50.m88271j(this.f12602b, a5v0Var.f12602b) && wj50.m88271j(this.f12603c, a5v0Var.f12603c) && wj50.m88271j(this.f12604d, a5v0Var.f12604d) && wj50.m88271j(this.f12605e, a5v0Var.f12605e);
    }

    public final int hashCode() {
        int iHashCode = this.f12601a.hashCode() * 31;
        Map map = this.f12602b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f12603c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set set = this.f12604d;
        return this.f12605e.hashCode() + ((iHashCode3 + (set != null ? set.hashCode() : 0)) * 31);
    }
}
