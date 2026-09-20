package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xq20 {

    /* JADX INFO: renamed from: a */
    public final int f264852a;

    /* JADX INFO: renamed from: b */
    public final int f264853b;

    public xq20(int i, int i2) {
        this.f264852a = i;
        this.f264853b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq20)) {
            return false;
        }
        xq20 xq20Var = (xq20) obj;
        return this.f264852a == xq20Var.f264852a && this.f264853b == xq20Var.f264853b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264853b) + (Integer.hashCode(this.f264852a) * 31);
    }
}
