package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class s4g0 {

    /* JADX INFO: renamed from: a */
    public final r4g0 f205582a;

    /* JADX INFO: renamed from: b */
    public final Map f205583b;

    /* JADX INFO: renamed from: c */
    public final yjj0 f205584c;

    public s4g0(r4g0 r4g0Var, Map map, yjj0 yjj0Var) {
        this.f205582a = r4g0Var;
        this.f205583b = map;
        this.f205584c = yjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4g0)) {
            return false;
        }
        s4g0 s4g0Var = (s4g0) obj;
        return wj50.m88271j(this.f205582a, s4g0Var.f205582a) && wj50.m88271j(this.f205583b, s4g0Var.f205583b) && this.f205584c == s4g0Var.f205584c;
    }

    public final int hashCode() {
        int iHashCode = this.f205582a.hashCode() * 31;
        Map map = this.f205583b;
        return this.f205584c.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }
}
