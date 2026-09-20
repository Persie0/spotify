package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class h3v0 {

    /* JADX INFO: renamed from: a */
    public final Set f87349a;

    /* JADX INFO: renamed from: b */
    public final Set f87350b;

    static {
        bk5.m29624m1(e3v0.values());
    }

    public h3v0(Set set, Set set2) {
        this.f87349a = set;
        this.f87350b = set2;
    }

    /* JADX INFO: renamed from: a */
    public static final g3v0 m46606a(e3v0... e3v0VarArr) {
        return new g3v0(f3v0.f65599a, bk5.m29624m1(e3v0VarArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3v0)) {
            return false;
        }
        h3v0 h3v0Var = (h3v0) obj;
        return wj50.m88271j(this.f87349a, h3v0Var.f87349a) && this.f87350b.equals(h3v0Var.f87350b);
    }

    public final int hashCode() {
        return this.f87350b.hashCode() + klh.m56830b(Integer.hashCode(15) * 31, 31, this.f87349a);
    }
}
