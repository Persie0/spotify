package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final String f182272a;

    /* JADX INFO: renamed from: b */
    public final double f182273b;

    /* JADX INFO: renamed from: c */
    public final boolean f182274c;

    public pxc1(double d, String str, boolean z) {
        this.f182272a = str;
        this.f182273b = d;
        this.f182274c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxc1)) {
            return false;
        }
        pxc1 pxc1Var = (pxc1) obj;
        return wj50.m88271j(this.f182272a, pxc1Var.f182272a) && Double.compare(this.f182273b, pxc1Var.f182273b) == 0 && this.f182274c == pxc1Var.f182274c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182274c) + xl81.m91399h(this.f182273b, this.f182272a.hashCode() * 31, 31);
    }
}
