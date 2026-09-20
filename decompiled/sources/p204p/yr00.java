package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yr00 implements as00 {

    /* JADX INFO: renamed from: a */
    public final String f275345a;

    /* JADX INFO: renamed from: b */
    public final String f275346b;

    /* JADX INFO: renamed from: c */
    public final String f275347c;

    /* JADX INFO: renamed from: d */
    public final String f275348d;

    /* JADX INFO: renamed from: e */
    public final String f275349e;

    /* JADX INFO: renamed from: f */
    public final String f275350f;

    /* JADX INFO: renamed from: g */
    public final String f275351g;

    /* JADX INFO: renamed from: h */
    public final String f275352h;

    public yr00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f275345a = str;
        this.f275346b = str2;
        this.f275347c = str3;
        this.f275348d = str4;
        this.f275349e = str5;
        this.f275350f = str6;
        this.f275351g = str7;
        this.f275352h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr00)) {
            return false;
        }
        yr00 yr00Var = (yr00) obj;
        return wj50.m88271j(this.f275345a, yr00Var.f275345a) && wj50.m88271j(this.f275346b, yr00Var.f275346b) && wj50.m88271j(this.f275347c, yr00Var.f275347c) && wj50.m88271j(this.f275348d, yr00Var.f275348d) && wj50.m88271j(this.f275349e, yr00Var.f275349e) && wj50.m88271j(this.f275350f, yr00Var.f275350f) && wj50.m88271j(this.f275351g, yr00Var.f275351g) && wj50.m88271j(this.f275352h, yr00Var.f275352h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f275345a.hashCode() * 31, 31, this.f275346b), 31, this.f275347c);
        String str = this.f275348d;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f275349e), 31, this.f275350f);
        String str2 = this.f275351g;
        int iHashCode = (iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f275352h;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
