package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dj50 {

    /* JADX INFO: renamed from: a */
    public final ej50 f49563a;

    /* JADX INFO: renamed from: b */
    public final Set f49564b;

    public dj50(ej50 ej50Var, Set set) {
        this.f49563a = ej50Var;
        this.f49564b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj50)) {
            return false;
        }
        dj50 dj50Var = (dj50) obj;
        return wj50.m88271j(this.f49563a, dj50Var.f49563a) && wj50.m88271j(this.f49564b, dj50Var.f49564b);
    }

    public final int hashCode() {
        return this.f49564b.hashCode() + (this.f49563a.hashCode() * 31);
    }
}
