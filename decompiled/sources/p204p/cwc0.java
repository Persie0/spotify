package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42694a;

    /* JADX INFO: renamed from: b */
    public final boolean f42695b;

    public cwc0(boolean z, boolean z2) {
        this.f42694a = z;
        this.f42695b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwc0)) {
            return false;
        }
        cwc0 cwc0Var = (cwc0) obj;
        return this.f42694a == cwc0Var.f42694a && this.f42695b == cwc0Var.f42695b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42695b) + (Boolean.hashCode(this.f42694a) * 31);
    }
}
