package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sqx0 {

    /* JADX INFO: renamed from: a */
    public final int f213183a;

    /* JADX INFO: renamed from: b */
    public final int f213184b;

    public sqx0(int i, int i2) {
        this.f213183a = i;
        this.f213184b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqx0)) {
            return false;
        }
        sqx0 sqx0Var = (sqx0) obj;
        return this.f213183a == sqx0Var.f213183a && this.f213184b == sqx0Var.f213184b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213184b) + (Integer.hashCode(this.f213183a) * 31);
    }
}
