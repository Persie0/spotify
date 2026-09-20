package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c40 {

    /* JADX INFO: renamed from: a */
    public final qe70 f33790a;

    /* JADX INFO: renamed from: b */
    public final Set f33791b;

    /* JADX WARN: Multi-variable type inference failed */
    public c40(Set set, th00 th00Var) {
        this.f33790a = (qe70) th00Var;
        this.f33791b = set;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.qe70, p.th00] */
    /* JADX INFO: renamed from: a */
    public final th00 m31415a() {
        return this.f33790a;
    }

    /* JADX INFO: renamed from: b */
    public final Set m31416b() {
        return this.f33791b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c40)) {
            return false;
        }
        c40 c40Var = (c40) obj;
        return wj50.m88271j(this.f33790a, c40Var.f33790a) && wj50.m88271j(this.f33791b, c40Var.f33791b);
    }

    public final int hashCode() {
        return this.f33791b.hashCode() + (this.f33790a.hashCode() * 31);
    }
}
