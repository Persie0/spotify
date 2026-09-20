package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ul31 {

    /* JADX INFO: renamed from: a */
    public final vl31 f231422a;

    /* JADX INFO: renamed from: b */
    public final int f231423b;

    /* JADX INFO: renamed from: c */
    public final List f231424c;

    public ul31(vl31 vl31Var, int i, List list) {
        this.f231422a = vl31Var;
        this.f231423b = i;
        this.f231424c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul31)) {
            return false;
        }
        ul31 ul31Var = (ul31) obj;
        return wj50.m88271j(this.f231422a, ul31Var.f231422a) && this.f231423b == ul31Var.f231423b && wj50.m88271j(this.f231424c, ul31Var.f231424c);
    }

    public final int hashCode() {
        return this.f231424c.hashCode() + mt60.m62800g(this.f231423b, this.f231422a.hashCode() * 31, 31);
    }
}
