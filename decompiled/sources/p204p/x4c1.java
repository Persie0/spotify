package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class x4c1 {

    /* JADX INFO: renamed from: a */
    public final List f258061a;

    /* JADX INFO: renamed from: b */
    public final w4c1 f258062b;

    public x4c1(List list, w4c1 w4c1Var) {
        this.f258061a = list;
        this.f258062b = w4c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4c1)) {
            return false;
        }
        x4c1 x4c1Var = (x4c1) obj;
        return wj50.m88271j(this.f258061a, x4c1Var.f258061a) && wj50.m88271j(this.f258062b, x4c1Var.f258062b);
    }

    public final int hashCode() {
        return this.f258062b.hashCode() + (this.f258061a.hashCode() * 31);
    }
}
