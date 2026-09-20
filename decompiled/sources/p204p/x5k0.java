package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class x5k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f258468a;

    /* JADX INFO: renamed from: b */
    public final List f258469b;

    public x5k0(String str, ae50 ae50Var) {
        this.f258468a = str;
        this.f258469b = ae50Var;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f258469b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5k0)) {
            return false;
        }
        x5k0 x5k0Var = (x5k0) obj;
        return wj50.m88271j(this.f258468a, x5k0Var.f258468a) && wj50.m88271j(this.f258469b, x5k0Var.f258469b);
    }

    public final int hashCode() {
        return this.f258469b.hashCode() + (this.f258468a.hashCode() * 31);
    }
}
