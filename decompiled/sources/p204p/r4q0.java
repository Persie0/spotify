package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class r4q0 {

    /* JADX INFO: renamed from: a */
    public final tl11 f195831a;

    /* JADX INFO: renamed from: b */
    public final q2q0 f195832b;

    /* JADX INFO: renamed from: c */
    public final boolean f195833c;

    /* JADX INFO: renamed from: d */
    public final d5x0 f195834d;

    /* JADX INFO: renamed from: e */
    public final Map f195835e;

    public r4q0(tl11 tl11Var, q2q0 q2q0Var, boolean z, d5x0 d5x0Var, Map map) {
        this.f195831a = tl11Var;
        this.f195832b = q2q0Var;
        this.f195833c = z;
        this.f195834d = d5x0Var;
        this.f195835e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4q0)) {
            return false;
        }
        r4q0 r4q0Var = (r4q0) obj;
        return wj50.m88271j(this.f195831a, r4q0Var.f195831a) && wj50.m88271j(this.f195832b, r4q0Var.f195832b) && this.f195833c == r4q0Var.f195833c && wj50.m88271j(this.f195834d, r4q0Var.f195834d) && wj50.m88271j(this.f195835e, r4q0Var.f195835e);
    }

    public final int hashCode() {
        int iHashCode = (this.f195834d.hashCode() + s571.m77245d((this.f195832b.hashCode() + (this.f195831a.hashCode() * 31)) * 31, 31, this.f195833c)) * 31;
        Map map = this.f195835e;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
