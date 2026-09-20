package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g3v0 {

    /* JADX INFO: renamed from: a */
    public final Set f76288a;

    /* JADX INFO: renamed from: b */
    public final Set f76289b;

    public g3v0(Set set, Set set2) {
        this.f76288a = set;
        this.f76289b = set2;
    }

    /* JADX INFO: renamed from: a */
    public final h3v0 m43515a() {
        return new h3v0(this.f76288a, this.f76289b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3v0)) {
            return false;
        }
        g3v0 g3v0Var = (g3v0) obj;
        return wj50.m88271j(this.f76288a, g3v0Var.f76288a) && wj50.m88271j(this.f76289b, g3v0Var.f76289b);
    }

    public final int hashCode() {
        return this.f76289b.hashCode() + (this.f76288a.hashCode() * 31);
    }
}
