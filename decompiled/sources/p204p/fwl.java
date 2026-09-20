package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fwl {

    /* JADX INFO: renamed from: a */
    public final String f74085a;

    /* JADX INFO: renamed from: b */
    public final String f74086b;

    /* JADX INFO: renamed from: c */
    public final String f74087c;

    /* JADX INFO: renamed from: d */
    public final String f74088d;

    /* JADX INFO: renamed from: e */
    public final int f74089e;

    /* JADX INFO: renamed from: f */
    public final String f74090f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f74091g;

    /* JADX INFO: renamed from: h */
    public final int f74092h;

    /* JADX INFO: renamed from: i */
    public final String f74093i;

    /* JADX INFO: renamed from: j */
    public final int f74094j;

    /* JADX INFO: renamed from: k */
    public final boolean f74095k;

    public fwl(String str, String str2, String str3, String str4, int i, String str5, rcm0 rcm0Var, int i2, String str6, int i3, boolean z) {
        this.f74085a = str;
        this.f74086b = str2;
        this.f74087c = str3;
        this.f74088d = str4;
        this.f74089e = i;
        this.f74090f = str5;
        this.f74091g = rcm0Var;
        this.f74092h = i2;
        this.f74093i = str6;
        this.f74094j = i3;
        this.f74095k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwl)) {
            return false;
        }
        fwl fwlVar = (fwl) obj;
        return wj50.m88271j(this.f74085a, fwlVar.f74085a) && wj50.m88271j(this.f74086b, fwlVar.f74086b) && wj50.m88271j(this.f74087c, fwlVar.f74087c) && wj50.m88271j(this.f74088d, fwlVar.f74088d) && this.f74089e == fwlVar.f74089e && wj50.m88271j(this.f74090f, fwlVar.f74090f) && this.f74091g.equals(fwlVar.f74091g) && this.f74092h == fwlVar.f74092h && wj50.m88271j(this.f74093i, fwlVar.f74093i) && this.f74094j == fwlVar.f74094j && this.f74095k == fwlVar.f74095k;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f74085a.hashCode() * 31, 31, this.f74086b), 31, this.f74087c), 31, this.f74088d);
        int i = this.f74089e;
        return Boolean.hashCode(this.f74095k) + mt60.m62800g(this.f74094j, s571.m77243b(mt60.m62800g(this.f74092h, yds.m93483m(this.f74091g, s571.m77243b((iM77243b + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f74090f), 31), 31), 31, this.f74093i), 31);
    }
}
