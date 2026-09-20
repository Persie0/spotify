package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xg91 implements zg91 {

    /* JADX INFO: renamed from: a */
    public final int f261248a;

    /* JADX INFO: renamed from: b */
    public final int f261249b;

    public xg91(int i, int i2) {
        this.f261248a = i;
        this.f261249b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg91)) {
            return false;
        }
        xg91 xg91Var = (xg91) obj;
        return this.f261248a == xg91Var.f261248a && this.f261249b == xg91Var.f261249b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f261249b) + (Integer.hashCode(this.f261248a) * 31);
    }
}
