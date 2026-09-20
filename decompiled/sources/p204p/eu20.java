package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eu20 {

    /* JADX INFO: renamed from: a */
    public final int f62857a;

    /* JADX INFO: renamed from: b */
    public final int f62858b;

    public eu20(int i, int i2) {
        this.f62857a = i;
        this.f62858b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu20)) {
            return false;
        }
        eu20 eu20Var = (eu20) obj;
        return this.f62857a == eu20Var.f62857a && this.f62858b == eu20Var.f62858b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62858b) + (Integer.hashCode(this.f62857a) * 31);
    }
}
