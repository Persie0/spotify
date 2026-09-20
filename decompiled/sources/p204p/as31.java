package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class as31 {

    /* JADX INFO: renamed from: a */
    public final xi3 f19288a;

    /* JADX INFO: renamed from: b */
    public final wr31 f19289b;

    /* JADX INFO: renamed from: c */
    public final List f19290c;

    public as31(xi3 xi3Var, wr31 wr31Var, List list) {
        this.f19288a = xi3Var;
        this.f19289b = wr31Var;
        this.f19290c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as31)) {
            return false;
        }
        as31 as31Var = (as31) obj;
        return this.f19288a == as31Var.f19288a && this.f19289b == as31Var.f19289b && wj50.m88271j(this.f19290c, as31Var.f19290c);
    }

    public final int hashCode() {
        return this.f19290c.hashCode() + ((this.f19289b.hashCode() + (this.f19288a.hashCode() * 31)) * 31);
    }
}
