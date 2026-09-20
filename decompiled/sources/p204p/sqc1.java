package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sqc1 {

    /* JADX INFO: renamed from: a */
    public final int f213064a;

    /* JADX INFO: renamed from: b */
    public final int f213065b;

    public sqc1(int i, int i2) {
        this.f213064a = i;
        this.f213065b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqc1)) {
            return false;
        }
        sqc1 sqc1Var = (sqc1) obj;
        return this.f213064a == sqc1Var.f213064a && this.f213065b == sqc1Var.f213065b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213065b) + (Integer.hashCode(this.f213064a) * 31);
    }
}
