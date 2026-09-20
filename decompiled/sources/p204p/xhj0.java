package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xhj0 implements zhj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f261656a;

    /* JADX INFO: renamed from: b */
    public final boolean f261657b;

    /* JADX INFO: renamed from: c */
    public final boolean f261658c;

    /* JADX INFO: renamed from: d */
    public final boolean f261659d;

    /* JADX INFO: renamed from: e */
    public final int f261660e;

    /* JADX INFO: renamed from: f */
    public final int f261661f;

    public xhj0(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.f261656a = z;
        this.f261657b = z2;
        this.f261658c = z3;
        this.f261659d = z4;
        this.f261660e = i;
        this.f261661f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhj0)) {
            return false;
        }
        xhj0 xhj0Var = (xhj0) obj;
        return this.f261656a == xhj0Var.f261656a && this.f261657b == xhj0Var.f261657b && this.f261658c == xhj0Var.f261658c && this.f261659d == xhj0Var.f261659d && this.f261660e == xhj0Var.f261660e && this.f261661f == xhj0Var.f261661f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f261656a) * 31, 31, this.f261657b), 31, this.f261658c), 31, this.f261659d);
        int i = this.f261660e;
        return edb.m38547C(this.f261661f) + ((iM77245d + (i == 0 ? 0 : edb.m38547C(i))) * 31);
    }
}
