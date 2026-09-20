package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zeo0 {

    /* JADX INFO: renamed from: a */
    public final String f282063a;

    /* JADX INFO: renamed from: b */
    public final boolean f282064b;

    /* JADX INFO: renamed from: c */
    public final String f282065c;

    /* JADX INFO: renamed from: d */
    public final String f282066d;

    /* JADX INFO: renamed from: e */
    public final eh00 f282067e;

    /* JADX INFO: renamed from: f */
    public final boolean f282068f;

    /* JADX INFO: renamed from: g */
    public final boolean f282069g;

    /* JADX INFO: renamed from: h */
    public final eh00 f282070h;

    /* JADX INFO: renamed from: i */
    public final String f282071i;

    /* JADX INFO: renamed from: j */
    public final String f282072j;

    /* JADX INFO: renamed from: k */
    public final boolean f282073k;

    public zeo0(String str, boolean z, String str2, String str3, eh00 eh00Var, boolean z2, boolean z3, eh00 eh00Var2, String str4, String str5, boolean z4) {
        this.f282063a = str;
        this.f282064b = z;
        this.f282065c = str2;
        this.f282066d = str3;
        this.f282067e = eh00Var;
        this.f282068f = z2;
        this.f282069g = z3;
        this.f282070h = eh00Var2;
        this.f282071i = str4;
        this.f282072j = str5;
        this.f282073k = z4;
    }

    /* JADX INFO: renamed from: a */
    public static zeo0 m95989a(zeo0 zeo0Var, eh00 eh00Var, eh00 eh00Var2, int i) {
        String str = zeo0Var.f282063a;
        boolean z = zeo0Var.f282064b;
        String str2 = zeo0Var.f282065c;
        String str3 = zeo0Var.f282066d;
        boolean z2 = zeo0Var.f282068f;
        boolean z3 = zeo0Var.f282069g;
        if ((i & 128) != 0) {
            eh00Var2 = zeo0Var.f282070h;
        }
        return new zeo0(str, z, str2, str3, eh00Var, z2, z3, eh00Var2, zeo0Var.f282071i, zeo0Var.f282072j, zeo0Var.f282073k);
    }

    /* JADX INFO: renamed from: b */
    public final String m95990b() {
        return this.f282063a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95991c() {
        return this.f282064b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeo0)) {
            return false;
        }
        zeo0 zeo0Var = (zeo0) obj;
        return wj50.m88271j(this.f282063a, zeo0Var.f282063a) && this.f282064b == zeo0Var.f282064b && wj50.m88271j(this.f282065c, zeo0Var.f282065c) && wj50.m88271j(this.f282066d, zeo0Var.f282066d) && wj50.m88271j(this.f282067e, zeo0Var.f282067e) && this.f282068f == zeo0Var.f282068f && this.f282069g == zeo0Var.f282069g && wj50.m88271j(this.f282070h, zeo0Var.f282070h) && wj50.m88271j(this.f282071i, zeo0Var.f282071i) && wj50.m88271j(this.f282072j, zeo0Var.f282072j) && this.f282073k == zeo0Var.f282073k;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77245d(this.f282063a.hashCode() * 31, 31, this.f282064b), 31, this.f282065c), 31, this.f282066d);
        eh00 eh00Var = this.f282067e;
        int iM77245d = s571.m77245d(s571.m77245d((iM77243b + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31, 31, this.f282068f), 31, this.f282069g);
        eh00 eh00Var2 = this.f282070h;
        int iHashCode = (iM77245d + (eh00Var2 == null ? 0 : eh00Var2.hashCode())) * 31;
        String str = this.f282071i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f282072j;
        return Boolean.hashCode(this.f282073k) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ zeo0(String str, boolean z, String str2, String str3, eh00 eh00Var, boolean z2, boolean z3, eh00 eh00Var2, String str4, String str5, boolean z4, int i) {
        this(str, z, str2, str3, (i & 16) != 0 ? null : eh00Var, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : eh00Var2, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? false : z4);
    }
}
