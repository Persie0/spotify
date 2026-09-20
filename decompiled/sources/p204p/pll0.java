package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pll0 {

    /* JADX INFO: renamed from: a */
    public final int f178757a;

    /* JADX INFO: renamed from: b */
    public final boolean f178758b;

    public pll0(int i, boolean z) {
        this.f178757a = i;
        this.f178758b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pll0)) {
            return false;
        }
        pll0 pll0Var = (pll0) obj;
        return this.f178757a == pll0Var.f178757a && this.f178758b == pll0Var.f178758b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178758b) + (Integer.hashCode(this.f178757a) * 31);
    }
}
