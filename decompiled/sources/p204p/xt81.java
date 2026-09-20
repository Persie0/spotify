package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xt81 {

    /* JADX INFO: renamed from: a */
    public final List f265799a;

    /* JADX INFO: renamed from: b */
    public final int f265800b;

    /* JADX INFO: renamed from: c */
    public final e5x0 f265801c;

    public xt81(List list, int i, e5x0 e5x0Var) {
        this.f265799a = list;
        this.f265800b = i;
        this.f265801c = e5x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt81)) {
            return false;
        }
        xt81 xt81Var = (xt81) obj;
        return wj50.m88271j(this.f265799a, xt81Var.f265799a) && this.f265800b == xt81Var.f265800b && wj50.m88271j(this.f265801c, xt81Var.f265801c);
    }

    public final int hashCode() {
        return this.f265801c.hashCode() + mt60.m62800g(this.f265800b, this.f265799a.hashCode() * 31, 31);
    }
}
