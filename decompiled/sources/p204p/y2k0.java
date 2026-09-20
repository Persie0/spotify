package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y2k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f268633a;

    /* JADX INFO: renamed from: b */
    public final int f268634b;

    public y2k0(boolean z, int i) {
        this.f268633a = z;
        this.f268634b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2k0)) {
            return false;
        }
        y2k0 y2k0Var = (y2k0) obj;
        return this.f268633a == y2k0Var.f268633a && this.f268634b == y2k0Var.f268634b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f268634b) + (Boolean.hashCode(this.f268633a) * 31);
    }
}
