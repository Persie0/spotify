package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hx11 {

    /* JADX INFO: renamed from: a */
    public final List f96114a;

    /* JADX INFO: renamed from: b */
    public final xv41 f96115b;

    public hx11(List list, xv41 xv41Var) {
        this.f96114a = list;
        this.f96115b = xv41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx11)) {
            return false;
        }
        hx11 hx11Var = (hx11) obj;
        return wj50.m88271j(this.f96114a, hx11Var.f96114a) && wj50.m88271j(this.f96115b, hx11Var.f96115b);
    }

    public final int hashCode() {
        return this.f96115b.hashCode() + (this.f96114a.hashCode() * 31);
    }
}
