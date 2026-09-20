package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vp1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final Set f243564a;

    /* JADX INFO: renamed from: b */
    public final a8i0 f243565b;

    public vp1(Set set, a8i0 a8i0Var) {
        this.f243564a = set;
        this.f243565b = a8i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp1)) {
            return false;
        }
        vp1 vp1Var = (vp1) obj;
        return wj50.m88271j(this.f243564a, vp1Var.f243564a) && wj50.m88271j(this.f243565b, vp1Var.f243565b);
    }

    public final int hashCode() {
        return this.f243565b.hashCode() + (this.f243564a.hashCode() * 31);
    }
}
