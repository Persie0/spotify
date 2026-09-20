package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a7k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f13087a;

    /* JADX INFO: renamed from: b */
    public final List f13088b;

    public a7k0(String str, List list) {
        this.f13087a = str;
        this.f13088b = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f13088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k0)) {
            return false;
        }
        a7k0 a7k0Var = (a7k0) obj;
        return wj50.m88271j(this.f13087a, a7k0Var.f13087a) && wj50.m88271j(this.f13088b, a7k0Var.f13088b);
    }

    public final int hashCode() {
        return this.f13088b.hashCode() + (this.f13087a.hashCode() * 31);
    }
}
