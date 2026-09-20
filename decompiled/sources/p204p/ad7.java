package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ad7 {

    /* JADX INFO: renamed from: a */
    public final String f14539a;

    /* JADX INFO: renamed from: b */
    public final String f14540b;

    /* JADX INFO: renamed from: c */
    public final String f14541c;

    /* JADX INFO: renamed from: d */
    public final String f14542d;

    /* JADX INFO: renamed from: e */
    public final String f14543e;

    /* JADX INFO: renamed from: f */
    public final String f14544f;

    /* JADX INFO: renamed from: g */
    public final boolean f14545g;

    /* JADX INFO: renamed from: h */
    public final qsj f14546h;

    /* JADX INFO: renamed from: i */
    public final pi1 f14547i;

    public ad7(String str, String str2, String str3, String str4, String str5, String str6, boolean z, qsj qsjVar, pi1 pi1Var) {
        this.f14539a = str;
        this.f14540b = str2;
        this.f14541c = str3;
        this.f14542d = str4;
        this.f14543e = str5;
        this.f14544f = str6;
        this.f14545g = z;
        this.f14546h = qsjVar;
        this.f14547i = pi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad7)) {
            return false;
        }
        ad7 ad7Var = (ad7) obj;
        return wj50.m88271j(this.f14539a, ad7Var.f14539a) && wj50.m88271j(this.f14540b, ad7Var.f14540b) && wj50.m88271j(this.f14541c, ad7Var.f14541c) && wj50.m88271j(this.f14542d, ad7Var.f14542d) && wj50.m88271j(this.f14543e, ad7Var.f14543e) && wj50.m88271j(this.f14544f, ad7Var.f14544f) && this.f14545g == ad7Var.f14545g && this.f14546h == ad7Var.f14546h && wj50.m88271j(this.f14547i, ad7Var.f14547i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f14539a.hashCode() * 31, 31, this.f14540b), 31, this.f14541c);
        String str = this.f14542d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14543e;
        return this.f14547i.hashCode() + xl81.m91401j(this.f14546h, s571.m77245d(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f14544f), 31, this.f14545g), 31);
    }
}
