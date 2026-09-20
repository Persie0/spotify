package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fxo0 implements oxo0 {

    /* JADX INFO: renamed from: a */
    public final gf41 f74406a;

    /* JADX INFO: renamed from: b */
    public final long f74407b;

    public fxo0(gf41 gf41Var, long j) {
        this.f74406a = gf41Var;
        this.f74407b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxo0)) {
            return false;
        }
        fxo0 fxo0Var = (fxo0) obj;
        return wj50.m88271j(this.f74406a, fxo0Var.f74406a) && this.f74407b == fxo0Var.f74407b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74407b) + (this.f74406a.hashCode() * 31);
    }
}
