package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class z6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f279943a;

    /* JADX INFO: renamed from: b */
    public final List f279944b;

    /* JADX INFO: renamed from: c */
    public final uxv0 f279945c;

    /* JADX INFO: renamed from: d */
    public final List f279946d;

    public z6k0(String str, ae50 ae50Var, uxv0 uxv0Var, ae50 ae50Var2) {
        this.f279943a = str;
        this.f279944b = ae50Var;
        this.f279945c = uxv0Var;
        this.f279946d = ae50Var2;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f279946d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6k0)) {
            return false;
        }
        z6k0 z6k0Var = (z6k0) obj;
        return wj50.m88271j(this.f279943a, z6k0Var.f279943a) && wj50.m88271j(this.f279944b, z6k0Var.f279944b) && wj50.m88271j(this.f279945c, z6k0Var.f279945c) && wj50.m88271j(this.f279946d, z6k0Var.f279946d);
    }

    public final int hashCode() {
        return this.f279946d.hashCode() + ((this.f279945c.hashCode() + s571.m77244c(this.f279943a.hashCode() * 31, 31, this.f279944b)) * 31);
    }
}
