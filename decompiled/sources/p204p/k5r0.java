package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k5r0 {

    /* JADX INFO: renamed from: a */
    public final String f119564a;

    /* JADX INFO: renamed from: b */
    public final String f119565b;

    /* JADX INFO: renamed from: c */
    public final String f119566c;

    /* JADX INFO: renamed from: d */
    public final k7i0 f119567d;

    /* JADX INFO: renamed from: e */
    public final long f119568e;

    /* JADX INFO: renamed from: f */
    public final boolean f119569f;

    /* JADX INFO: renamed from: g */
    public final boolean f119570g;

    /* JADX INFO: renamed from: h */
    public final boolean f119571h;

    public k5r0(String str, String str2, String str3, k7i0 k7i0Var, long j, boolean z, boolean z2, boolean z3) {
        this.f119564a = str;
        this.f119565b = str2;
        this.f119566c = str3;
        this.f119567d = k7i0Var;
        this.f119568e = j;
        this.f119569f = z;
        this.f119570g = z2;
        this.f119571h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5r0)) {
            return false;
        }
        k5r0 k5r0Var = (k5r0) obj;
        return wj50.m88271j(this.f119564a, k5r0Var.f119564a) && wj50.m88271j(this.f119565b, k5r0Var.f119565b) && wj50.m88271j(this.f119566c, k5r0Var.f119566c) && wj50.m88271j(this.f119567d, k5r0Var.f119567d) && this.f119568e == k5r0Var.f119568e && this.f119569f == k5r0Var.f119569f && this.f119570g == k5r0Var.f119570g && this.f119571h == k5r0Var.f119571h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119571h) + s571.m77245d(s571.m77245d(dq60.m36605e((this.f119567d.hashCode() + s571.m77243b(s571.m77243b(this.f119564a.hashCode() * 31, 31, this.f119565b), 31, this.f119566c)) * 31, this.f119568e, 31), 31, this.f119569f), 31, this.f119570g);
    }

    public /* synthetic */ k5r0(String str, String str2, k7i0 k7i0Var, long j, boolean z, boolean z2, boolean z3, int i) {
        this(str, str2, "", k7i0Var, j, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? true : z3);
    }
}
