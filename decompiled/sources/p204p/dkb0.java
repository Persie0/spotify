package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class dkb0 implements fkb0 {

    /* JADX INFO: renamed from: a */
    public final Set f49950a;

    /* JADX INFO: renamed from: b */
    public final boolean f49951b;

    public dkb0(Set set, boolean z) {
        this.f49950a = set;
        this.f49951b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb0)) {
            return false;
        }
        dkb0 dkb0Var = (dkb0) obj;
        return wj50.m88271j(this.f49950a, dkb0Var.f49950a) && this.f49951b == dkb0Var.f49951b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49951b) + (this.f49950a.hashCode() * 31);
    }
}
