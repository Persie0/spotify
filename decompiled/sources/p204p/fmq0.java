package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fmq0 {

    /* JADX INFO: renamed from: a */
    public final hg20 f71112a;

    /* JADX INFO: renamed from: b */
    public final int f71113b;

    public fmq0(hg20 hg20Var, int i) {
        this.f71112a = hg20Var;
        this.f71113b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmq0)) {
            return false;
        }
        fmq0 fmq0Var = (fmq0) obj;
        return wj50.m88271j(this.f71112a, fmq0Var.f71112a) && this.f71113b == fmq0Var.f71113b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71113b) + (this.f71112a.hashCode() * 31);
    }
}
