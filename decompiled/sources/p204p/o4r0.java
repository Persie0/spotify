package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o4r0 {

    /* JADX INFO: renamed from: a */
    public final String f161736a;

    /* JADX INFO: renamed from: b */
    public final String f161737b;

    /* JADX INFO: renamed from: c */
    public final String f161738c;

    /* JADX INFO: renamed from: d */
    public final String f161739d;

    /* JADX INFO: renamed from: e */
    public final String f161740e;

    /* JADX INFO: renamed from: f */
    public final boolean f161741f;

    /* JADX INFO: renamed from: g */
    public final boolean f161742g;

    /* JADX INFO: renamed from: h */
    public final boolean f161743h;

    /* JADX INFO: renamed from: i */
    public final qsj f161744i;

    /* JADX INFO: renamed from: j */
    public final eh00 f161745j;

    /* JADX INFO: renamed from: k */
    public final boolean f161746k;

    public o4r0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, qsj qsjVar, eh00 eh00Var, boolean z4) {
        this.f161736a = str;
        this.f161737b = str2;
        this.f161738c = str3;
        this.f161739d = str4;
        this.f161740e = str5;
        this.f161741f = z;
        this.f161742g = z2;
        this.f161743h = z3;
        this.f161744i = qsjVar;
        this.f161745j = eh00Var;
        this.f161746k = z4;
    }

    /* JADX INFO: renamed from: a */
    public static o4r0 m66258a(o4r0 o4r0Var, eh00 eh00Var, int i) {
        String str = o4r0Var.f161736a;
        String str2 = o4r0Var.f161737b;
        String str3 = o4r0Var.f161738c;
        String str4 = o4r0Var.f161739d;
        String str5 = o4r0Var.f161740e;
        boolean z = o4r0Var.f161741f;
        boolean z2 = o4r0Var.f161742g;
        boolean z3 = o4r0Var.f161743h;
        qsj qsjVar = o4r0Var.f161744i;
        o4r0Var.getClass();
        boolean z4 = (i & 2048) != 0 ? o4r0Var.f161746k : true;
        o4r0Var.getClass();
        return new o4r0(str, str2, str3, str4, str5, z, z2, z3, qsjVar, eh00Var, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o4r0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        o4r0 o4r0Var = (o4r0) obj;
        return wj50.m88271j(this.f161736a, o4r0Var.f161736a) && wj50.m88271j(this.f161737b, o4r0Var.f161737b) && wj50.m88271j(this.f161738c, o4r0Var.f161738c) && wj50.m88271j(this.f161739d, o4r0Var.f161739d) && wj50.m88271j(this.f161740e, o4r0Var.f161740e) && this.f161741f == o4r0Var.f161741f && this.f161742g == o4r0Var.f161742g && this.f161744i == o4r0Var.f161744i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f161736a.hashCode() * 31, 31, this.f161737b), 31, this.f161738c), 31, this.f161739d);
        String str = this.f161740e;
        return this.f161744i.hashCode() + s571.m77245d(s571.m77245d((iM77243b + (str != null ? str.hashCode() : 0)) * 31, 31, this.f161741f), 31, this.f161742g);
    }

    public /* synthetic */ o4r0(int i, String str, String str2, String str3, String str4, String str5, qsj qsjVar, boolean z, boolean z2, boolean z3) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? qsj.f192130d : qsjVar, null, false);
    }
}
