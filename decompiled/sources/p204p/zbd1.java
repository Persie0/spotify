package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zbd1 {

    /* JADX INFO: renamed from: a */
    public final String f281303a;

    /* JADX INFO: renamed from: b */
    public final String f281304b;

    /* JADX INFO: renamed from: c */
    public final String f281305c;

    /* JADX INFO: renamed from: d */
    public final String f281306d;

    /* JADX INFO: renamed from: e */
    public final String f281307e;

    /* JADX INFO: renamed from: f */
    public final qsj f281308f;

    /* JADX INFO: renamed from: g */
    public final q76 f281309g;

    /* JADX INFO: renamed from: h */
    public final boolean f281310h;

    /* JADX INFO: renamed from: i */
    public final Float f281311i;

    /* JADX INFO: renamed from: j */
    public final String f281312j;

    public zbd1(String str, String str2, String str3, String str4, String str5, qsj qsjVar, q76 q76Var, boolean z, Float f, String str6) {
        this.f281303a = str;
        this.f281304b = str2;
        this.f281305c = str3;
        this.f281306d = str4;
        this.f281307e = str5;
        this.f281308f = qsjVar;
        this.f281309g = q76Var;
        this.f281310h = z;
        this.f281311i = f;
        this.f281312j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbd1)) {
            return false;
        }
        zbd1 zbd1Var = (zbd1) obj;
        return wj50.m88271j(this.f281303a, zbd1Var.f281303a) && wj50.m88271j(this.f281304b, zbd1Var.f281304b) && wj50.m88271j(this.f281305c, zbd1Var.f281305c) && wj50.m88271j(this.f281306d, zbd1Var.f281306d) && wj50.m88271j(this.f281307e, zbd1Var.f281307e) && this.f281308f == zbd1Var.f281308f && wj50.m88271j(this.f281309g, zbd1Var.f281309g) && this.f281310h == zbd1Var.f281310h && wj50.m88271j(this.f281311i, zbd1Var.f281311i) && wj50.m88271j(this.f281312j, zbd1Var.f281312j);
    }

    public final int hashCode() {
        int iHashCode = this.f281303a.hashCode() * 31;
        String str = this.f281304b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f281305c;
        int iM91401j = xl81.m91401j(this.f281308f, s571.m77243b(s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f281306d), 31, this.f281307e), 31);
        q76 q76Var = this.f281309g;
        int iM77245d = s571.m77245d((iM91401j + (q76Var == null ? 0 : q76Var.hashCode())) * 31, 31, this.f281310h);
        Float f = this.f281311i;
        int iHashCode3 = (iM77245d + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.f281312j;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ zbd1(String str, String str2, String str3, String str4, String str5, qsj qsjVar, Float f, String str6, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? qsj.f192130d : qsjVar, null, false, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : str6);
    }
}
