package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class i2d0 {
    public static final h2d0 Companion = new h2d0();

    /* JADX INFO: renamed from: a */
    public final boolean f97797a;

    /* JADX INFO: renamed from: b */
    public final boolean f97798b;

    /* JADX INFO: renamed from: c */
    public final String f97799c;

    /* JADX INFO: renamed from: d */
    public final double f97800d;

    /* JADX INFO: renamed from: e */
    public final String f97801e;

    /* JADX INFO: renamed from: f */
    public final long f97802f;

    /* JADX INFO: renamed from: g */
    public final String f97803g;

    /* JADX INFO: renamed from: h */
    public final boolean f97804h;

    /* JADX INFO: renamed from: i */
    public final String f97805i;

    /* JADX INFO: renamed from: j */
    public final String f97806j;

    public /* synthetic */ i2d0(int i, boolean z, boolean z2, String str, double d, String str2, long j, String str3, boolean z3, String str4, String str5) {
        if (170 != (i & 170)) {
            edo.m38617p(i, 170, g2d0.f75888a.getDescriptor());
            throw null;
        }
        this.f97797a = (i & 1) == 0 ? true : z;
        this.f97798b = z2;
        if ((i & 4) == 0) {
            this.f97799c = null;
        } else {
            this.f97799c = str;
        }
        this.f97800d = d;
        if ((i & 16) == 0) {
            this.f97801e = null;
        } else {
            this.f97801e = str2;
        }
        this.f97802f = j;
        if ((i & 64) == 0) {
            this.f97803g = "ANDROID";
        } else {
            this.f97803g = str3;
        }
        this.f97804h = z3;
        if ((i & 256) == 0) {
            this.f97805i = null;
        } else {
            this.f97805i = str4;
        }
        if ((i & 512) == 0) {
            this.f97806j = null;
        } else {
            this.f97806j = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2d0)) {
            return false;
        }
        i2d0 i2d0Var = (i2d0) obj;
        return this.f97797a == i2d0Var.f97797a && this.f97798b == i2d0Var.f97798b && wj50.m88271j(this.f97799c, i2d0Var.f97799c) && Double.compare(this.f97800d, i2d0Var.f97800d) == 0 && wj50.m88271j(this.f97801e, i2d0Var.f97801e) && this.f97802f == i2d0Var.f97802f && wj50.m88271j(this.f97803g, i2d0Var.f97803g) && this.f97804h == i2d0Var.f97804h && wj50.m88271j(this.f97805i, i2d0Var.f97805i) && wj50.m88271j(this.f97806j, i2d0Var.f97806j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f97797a) * 31, 31, this.f97798b);
        String str = this.f97799c;
        int iM91399h = xl81.m91399h(this.f97800d, (iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f97801e;
        int iM77245d2 = s571.m77245d(s571.m77243b(dq60.m36605e((iM91399h + (str2 == null ? 0 : str2.hashCode())) * 31, this.f97802f, 31), 31, this.f97803g), 31, this.f97804h);
        String str3 = this.f97805i;
        int iHashCode = (iM77245d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97806j;
        return iHashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public i2d0(boolean z, String str, double d, String str2, long j, boolean z2, String str3, String str4, int i) {
        boolean z3 = (i & 1) != 0;
        str3 = (i & 256) != 0 ? null : str3;
        str4 = (i & 512) != 0 ? null : str4;
        this.f97797a = z3;
        this.f97798b = z;
        this.f97799c = str;
        this.f97800d = d;
        this.f97801e = str2;
        this.f97802f = j;
        this.f97803g = "ANDROID";
        this.f97804h = z2;
        this.f97805i = str3;
        this.f97806j = str4;
    }
}
