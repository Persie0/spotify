package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class g6d1 {

    /* JADX INFO: renamed from: a */
    public final String f77020a;

    /* JADX INFO: renamed from: b */
    public final Map f77021b;

    /* JADX INFO: renamed from: c */
    public final String f77022c;

    public /* synthetic */ g6d1(String str, int i, Map map, String str2) {
        this((i & 1) != 0 ? null : str, str2, (i & 2) != 0 ? null : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6d1)) {
            return false;
        }
        g6d1 g6d1Var = (g6d1) obj;
        return wj50.m88271j(this.f77020a, g6d1Var.f77020a) && wj50.m88271j(this.f77021b, g6d1Var.f77021b) && wj50.m88271j(this.f77022c, g6d1Var.f77022c);
    }

    public final int hashCode() {
        String str = this.f77020a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f77021b;
        return this.f77022c.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public g6d1(String str, String str2, Map map) {
        this.f77020a = str;
        this.f77021b = map;
        this.f77022c = str2;
    }
}
