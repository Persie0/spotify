package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xgf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final int f261309a;

    /* JADX INFO: renamed from: b */
    public final int f261310b;

    public xgf0(int i, int i2) {
        this.f261309a = i;
        this.f261310b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf0)) {
            return false;
        }
        xgf0 xgf0Var = (xgf0) obj;
        return this.f261309a == xgf0Var.f261309a && this.f261310b == xgf0Var.f261310b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f261310b) + (Integer.hashCode(this.f261309a) * 31);
    }
}
