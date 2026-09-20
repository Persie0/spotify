package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class loy {

    /* JADX INFO: renamed from: a */
    public final koy f135563a;

    /* JADX INFO: renamed from: b */
    public final String f135564b;

    /* JADX INFO: renamed from: c */
    public final Long f135565c;

    /* JADX INFO: renamed from: d */
    public final boolean f135566d;

    /* JADX INFO: renamed from: e */
    public final int f135567e;

    /* JADX INFO: renamed from: f */
    public final int f135568f;

    /* JADX INFO: renamed from: g */
    public final String f135569g;

    /* JADX INFO: renamed from: h */
    public final String f135570h;

    /* JADX INFO: renamed from: i */
    public final boolean f135571i;

    /* JADX INFO: renamed from: j */
    public final boolean f135572j;

    public loy(koy koyVar, String str, Long l, boolean z, int i, int i2, String str2, String str3, boolean z2, int i3) {
        l = (i3 & 4) != 0 ? null : l;
        z = (i3 & 8) != 0 ? false : z;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        str3 = (i3 & 128) != 0 ? "" : str3;
        z2 = (i3 & 256) != 0 ? false : z2;
        boolean z3 = (i3 & 512) == 0;
        this.f135563a = koyVar;
        this.f135564b = str;
        this.f135565c = l;
        this.f135566d = z;
        this.f135567e = i;
        this.f135568f = i2;
        this.f135569g = str2;
        this.f135570h = str3;
        this.f135571i = z2;
        this.f135572j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loy)) {
            return false;
        }
        loy loyVar = (loy) obj;
        return wj50.m88271j(this.f135563a, loyVar.f135563a) && wj50.m88271j(this.f135564b, loyVar.f135564b) && wj50.m88271j(this.f135565c, loyVar.f135565c) && this.f135566d == loyVar.f135566d && this.f135567e == loyVar.f135567e && this.f135568f == loyVar.f135568f && wj50.m88271j(this.f135569g, loyVar.f135569g) && wj50.m88271j(this.f135570h, loyVar.f135570h) && this.f135571i == loyVar.f135571i && this.f135572j == loyVar.f135572j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f135563a.hashCode() * 31, 31, this.f135564b);
        Long l = this.f135565c;
        int iM62800g = mt60.m62800g(this.f135568f, mt60.m62800g(this.f135567e, s571.m77245d((iM77243b + (l == null ? 0 : l.hashCode())) * 31, 31, this.f135566d), 31), 31);
        String str = this.f135569g;
        return Boolean.hashCode(this.f135572j) + s571.m77245d(s571.m77243b((iM62800g + (str != null ? str.hashCode() : 0)) * 31, 31, this.f135570h), 31, this.f135571i);
    }
}
