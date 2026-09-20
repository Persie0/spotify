package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fxj0 {

    /* JADX INFO: renamed from: a */
    public final int f74384a;

    /* JADX INFO: renamed from: b */
    public final boolean f74385b;

    public fxj0(int i, boolean z) {
        this.f74384a = i;
        this.f74385b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxj0)) {
            return false;
        }
        fxj0 fxj0Var = (fxj0) obj;
        return this.f74384a == fxj0Var.f74384a && this.f74385b == fxj0Var.f74385b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74385b) + (edb.m38547C(this.f74384a) * 31);
    }
}
