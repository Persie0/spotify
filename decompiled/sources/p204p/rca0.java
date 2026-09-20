package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rca0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197831a;

    /* JADX INFO: renamed from: b */
    public final int f197832b;

    public rca0(boolean z, int i) {
        this.f197831a = z;
        this.f197832b = i;
    }

    /* JADX INFO: renamed from: a */
    public static rca0 m75294a(rca0 rca0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = rca0Var.f197831a;
        }
        int i2 = (i & 2) != 0 ? rca0Var.f197832b : 2;
        rca0Var.getClass();
        return new rca0(z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rca0)) {
            return false;
        }
        rca0 rca0Var = (rca0) obj;
        return this.f197831a == rca0Var.f197831a && this.f197832b == rca0Var.f197832b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f197832b) + (Boolean.hashCode(this.f197831a) * 31);
    }
}
