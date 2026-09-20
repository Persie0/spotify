package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lp10 implements v1x {

    /* JADX INFO: renamed from: a */
    public final Map f135594a;

    /* JADX INFO: renamed from: b */
    public final Map f135595b;

    public lp10(Map map, Map map2) {
        this.f135594a = map;
        this.f135595b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp10)) {
            return false;
        }
        lp10 lp10Var = (lp10) obj;
        return wj50.m88271j(this.f135594a, lp10Var.f135594a) && wj50.m88271j(this.f135595b, lp10Var.f135595b);
    }

    public final int hashCode() {
        return this.f135595b.hashCode() + (this.f135594a.hashCode() * 31);
    }
}
