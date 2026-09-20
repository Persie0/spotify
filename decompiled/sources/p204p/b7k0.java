package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b7k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f24305a;

    /* JADX INFO: renamed from: b */
    public final String f24306b;

    /* JADX INFO: renamed from: c */
    public final List f24307c;

    public b7k0(String str, List list, String str2) {
        this.f24305a = str;
        this.f24306b = str2;
        this.f24307c = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f24307c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7k0)) {
            return false;
        }
        b7k0 b7k0Var = (b7k0) obj;
        return wj50.m88271j(this.f24305a, b7k0Var.f24305a) && wj50.m88271j(this.f24306b, b7k0Var.f24306b) && wj50.m88271j(this.f24307c, b7k0Var.f24307c);
    }

    public final int hashCode() {
        return this.f24307c.hashCode() + s571.m77243b(this.f24305a.hashCode() * 31, 31, this.f24306b);
    }
}
