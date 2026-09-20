package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lgl0 {

    /* JADX INFO: renamed from: a */
    public final int f133241a;

    /* JADX INFO: renamed from: b */
    public final boolean f133242b;

    public lgl0(int i, boolean z) {
        this.f133241a = i;
        this.f133242b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgl0)) {
            return false;
        }
        lgl0 lgl0Var = (lgl0) obj;
        return this.f133241a == lgl0Var.f133241a && this.f133242b == lgl0Var.f133242b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133242b) + (Integer.hashCode(this.f133241a) * 31);
    }
}
