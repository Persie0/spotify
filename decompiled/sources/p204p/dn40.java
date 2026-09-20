package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dn40 extends mvf1 {

    /* JADX INFO: renamed from: f */
    public final int f50689f;

    /* JADX INFO: renamed from: g */
    public final int f50690g;

    public dn40(int i, int i2) {
        this.f50689f = i;
        this.f50690g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn40)) {
            return false;
        }
        dn40 dn40Var = (dn40) obj;
        return this.f50689f == dn40Var.f50689f && this.f50690g == dn40Var.f50690g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50690g) + (Integer.hashCode(this.f50689f) * 31);
    }
}
