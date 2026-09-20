package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final n601 f266634a;

    /* JADX INFO: renamed from: b */
    public final boolean f266635b;

    public xwc1(n601 n601Var, boolean z) {
        this.f266634a = n601Var;
        this.f266635b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwc1)) {
            return false;
        }
        xwc1 xwc1Var = (xwc1) obj;
        return wj50.m88271j(this.f266634a, xwc1Var.f266634a) && this.f266635b == xwc1Var.f266635b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266635b) + (this.f266634a.hashCode() * 31);
    }
}
