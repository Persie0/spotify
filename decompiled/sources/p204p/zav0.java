package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zav0 {

    /* JADX INFO: renamed from: a */
    public final String f281160a;

    /* JADX INFO: renamed from: b */
    public final String f281161b;

    /* JADX INFO: renamed from: c */
    public final String f281162c;

    /* JADX INFO: renamed from: d */
    public final String f281163d;

    /* JADX INFO: renamed from: e */
    public final Long f281164e;

    /* JADX INFO: renamed from: f */
    public final boolean f281165f;

    /* JADX INFO: renamed from: g */
    public final boolean f281166g;

    /* JADX INFO: renamed from: h */
    public final boolean f281167h;

    /* JADX INFO: renamed from: i */
    public final String f281168i;

    public zav0(String str, String str2, String str3, String str4, Long l, boolean z, boolean z2, boolean z3, String str5) {
        this.f281160a = str;
        this.f281161b = str2;
        this.f281162c = str3;
        this.f281163d = str4;
        this.f281164e = l;
        this.f281165f = z;
        this.f281166g = z2;
        this.f281167h = z3;
        this.f281168i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav0)) {
            return false;
        }
        zav0 zav0Var = (zav0) obj;
        return wj50.m88271j(this.f281160a, zav0Var.f281160a) && wj50.m88271j(this.f281161b, zav0Var.f281161b) && wj50.m88271j(this.f281162c, zav0Var.f281162c) && wj50.m88271j(this.f281163d, zav0Var.f281163d) && wj50.m88271j(this.f281164e, zav0Var.f281164e) && this.f281165f == zav0Var.f281165f && this.f281166g == zav0Var.f281166g && this.f281167h == zav0Var.f281167h && wj50.m88271j(this.f281168i, zav0Var.f281168i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f281160a.hashCode() * 31, 31, this.f281161b);
        String str = this.f281162c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f281163d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f281164e;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f281165f), 31, this.f281166g), 31, this.f281167h);
        String str3 = this.f281168i;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
