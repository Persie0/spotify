package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xq81 {

    /* JADX INFO: renamed from: a */
    public final String f264917a;

    /* JADX INFO: renamed from: b */
    public final long f264918b;

    /* JADX INFO: renamed from: c */
    public final long f264919c;

    /* JADX INFO: renamed from: d */
    public final boolean f264920d;

    /* JADX INFO: renamed from: e */
    public final boolean f264921e;

    /* JADX INFO: renamed from: f */
    public final boolean f264922f;

    /* JADX INFO: renamed from: g */
    public final qq81 f264923g;

    /* JADX INFO: renamed from: h */
    public final uks f264924h;

    public xq81(String str, long j, long j2, boolean z, boolean z2, boolean z3, qq81 qq81Var, uks uksVar) {
        this.f264917a = str;
        this.f264918b = j;
        this.f264919c = j2;
        this.f264920d = z;
        this.f264921e = z2;
        this.f264922f = z3;
        this.f264923g = qq81Var;
        this.f264924h = uksVar;
    }

    /* JADX INFO: renamed from: a */
    public static xq81 m91820a(xq81 xq81Var, boolean z) {
        String str = xq81Var.f264917a;
        long j = xq81Var.f264918b;
        long j2 = xq81Var.f264919c;
        boolean z2 = xq81Var.f264920d;
        boolean z3 = xq81Var.f264922f;
        qq81 qq81Var = xq81Var.f264923g;
        uks uksVar = xq81Var.f264924h;
        xq81Var.getClass();
        return new xq81(str, j, j2, z2, z, z3, qq81Var, uksVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq81)) {
            return false;
        }
        xq81 xq81Var = (xq81) obj;
        return wj50.m88271j(this.f264917a, xq81Var.f264917a) && this.f264918b == xq81Var.f264918b && this.f264919c == xq81Var.f264919c && this.f264920d == xq81Var.f264920d && this.f264921e == xq81Var.f264921e && this.f264922f == xq81Var.f264922f && wj50.m88271j(this.f264923g, xq81Var.f264923g) && this.f264924h == xq81Var.f264924h;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(dq60.m36605e(dq60.m36605e(this.f264917a.hashCode() * 31, this.f264918b, 31), this.f264919c, 31), 31, this.f264920d), 31, this.f264921e), 31, this.f264922f);
        qq81 qq81Var = this.f264923g;
        return this.f264924h.hashCode() + ((iM77245d + (qq81Var == null ? 0 : qq81Var.hashCode())) * 31);
    }

    public /* synthetic */ xq81(String str, long j, long j2, boolean z, boolean z2, boolean z3, qq81 qq81Var, uks uksVar, int i) {
        this(str, j, j2, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : qq81Var, (i & 128) != 0 ? uks.f231357a : uksVar);
    }
}
