package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fz41 {

    /* JADX INFO: renamed from: a */
    public final boolean f74907a;

    /* JADX INFO: renamed from: b */
    public final int f74908b;

    public fz41(boolean z, int i) {
        this.f74907a = z;
        this.f74908b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz41)) {
            return false;
        }
        fz41 fz41Var = (fz41) obj;
        return this.f74907a == fz41Var.f74907a && this.f74908b == fz41Var.f74908b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74908b) + (Boolean.hashCode(this.f74907a) * 31);
    }
}
