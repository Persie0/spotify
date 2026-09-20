package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lj40 {

    /* JADX INFO: renamed from: a */
    public final int f133954a;

    /* JADX INFO: renamed from: b */
    public final int f133955b;

    public lj40(int i, int i2) {
        this.f133954a = i;
        this.f133955b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj40)) {
            return false;
        }
        lj40 lj40Var = (lj40) obj;
        return this.f133954a == lj40Var.f133954a && this.f133955b == lj40Var.f133955b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133955b) + (Integer.hashCode(this.f133954a) * 31);
    }
}
