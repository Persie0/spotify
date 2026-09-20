package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f7k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final List f66730a;

    /* JADX INFO: renamed from: b */
    public final String f66731b;

    /* JADX INFO: renamed from: c */
    public final List f66732c;

    public f7k0(String str, List list, List list2) {
        this.f66730a = list;
        this.f66731b = str;
        this.f66732c = list2;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f66732c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7k0)) {
            return false;
        }
        f7k0 f7k0Var = (f7k0) obj;
        return wj50.m88271j(this.f66730a, f7k0Var.f66730a) && wj50.m88271j(this.f66731b, f7k0Var.f66731b) && wj50.m88271j(this.f66732c, f7k0Var.f66732c);
    }

    public final int hashCode() {
        return this.f66732c.hashCode() + s571.m77243b(this.f66730a.hashCode() * 31, 31, this.f66731b);
    }
}
