package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dvy0 implements lvy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f53564a;

    /* JADX INFO: renamed from: b */
    public final boolean f53565b;

    public dvy0(boolean z, boolean z2) {
        this.f53564a = z;
        this.f53565b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvy0)) {
            return false;
        }
        dvy0 dvy0Var = (dvy0) obj;
        return this.f53564a == dvy0Var.f53564a && this.f53565b == dvy0Var.f53565b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53565b) + (Boolean.hashCode(this.f53564a) * 31);
    }
}
