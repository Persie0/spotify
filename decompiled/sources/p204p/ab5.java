package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ab5 {

    /* JADX INFO: renamed from: a */
    public final List f14000a;

    /* JADX INFO: renamed from: b */
    public final za5 f14001b;

    public ab5(List list, za5 za5Var) {
        this.f14000a = list;
        this.f14001b = za5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab5)) {
            return false;
        }
        ab5 ab5Var = (ab5) obj;
        return wj50.m88271j(this.f14000a, ab5Var.f14000a) && wj50.m88271j(this.f14001b, ab5Var.f14001b);
    }

    public final int hashCode() {
        return this.f14001b.hashCode() + (this.f14000a.hashCode() * 31);
    }
}
