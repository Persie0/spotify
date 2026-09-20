package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jb41 {

    /* JADX INFO: renamed from: a */
    public final ib41 f110647a;

    /* JADX INFO: renamed from: b */
    public final boolean f110648b;

    /* JADX INFO: renamed from: c */
    public final boolean f110649c;

    /* JADX INFO: renamed from: d */
    public final String f110650d;

    /* JADX INFO: renamed from: e */
    public final zc41 f110651e;

    /* JADX INFO: renamed from: f */
    public final boolean f110652f;

    /* JADX INFO: renamed from: g */
    public final boolean f110653g;

    public jb41(ib41 ib41Var, boolean z, boolean z2, String str, zc41 zc41Var, boolean z3, boolean z4) {
        this.f110647a = ib41Var;
        this.f110648b = z;
        this.f110649c = z2;
        this.f110650d = str;
        this.f110651e = zc41Var;
        this.f110652f = z3;
        this.f110653g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb41)) {
            return false;
        }
        jb41 jb41Var = (jb41) obj;
        return this.f110647a.equals(jb41Var.f110647a) && this.f110648b == jb41Var.f110648b && this.f110649c == jb41Var.f110649c && this.f110650d.equals(jb41Var.f110650d) && this.f110651e.equals(jb41Var.f110651e) && this.f110652f == jb41Var.f110652f && this.f110653g == jb41Var.f110653g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110653g) + s571.m77245d((this.f110651e.hashCode() + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(false) * 31, 31, this.f110648b), 31, this.f110649c), 31, false), 31, this.f110650d)) * 31, 31, this.f110652f);
    }
}
