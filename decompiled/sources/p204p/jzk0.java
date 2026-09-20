package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jzk0 {

    /* JADX INFO: renamed from: a */
    public final long f117745a;

    /* JADX INFO: renamed from: b */
    public final boolean f117746b;

    /* JADX INFO: renamed from: c */
    public final gj80 f117747c;

    public jzk0(long j, boolean z, gj80 gj80Var) {
        this.f117745a = j;
        this.f117746b = z;
        this.f117747c = gj80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzk0)) {
            return false;
        }
        jzk0 jzk0Var = (jzk0) obj;
        return cks.m33185d(this.f117745a, jzk0Var.f117745a) && this.f117746b == jzk0Var.f117746b && wj50.m88271j(this.f117747c, jzk0Var.f117747c);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        int iM77245d = s571.m77245d(Long.hashCode(this.f117745a) * 31, 31, this.f117746b);
        gj80 gj80Var = this.f117747c;
        return iM77245d + (gj80Var == null ? 0 : gj80Var.hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzk0(gj80 gj80Var, int i) {
        this(jwg1.m54449D(0, ils.SECONDS), (i & 2) != 0, gj80Var);
        hvi0 hvi0Var = cks.f39079b;
    }
}
