package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jg20 {

    /* JADX INFO: renamed from: a */
    public final String f112003a;

    /* JADX INFO: renamed from: b */
    public final String f112004b;

    /* JADX INFO: renamed from: c */
    public final String f112005c;

    /* JADX INFO: renamed from: d */
    public final String f112006d;

    /* JADX INFO: renamed from: e */
    public final String f112007e;

    /* JADX INFO: renamed from: f */
    public final String f112008f;

    /* JADX INFO: renamed from: g */
    public final l10 f112009g;

    /* JADX INFO: renamed from: h */
    public final String f112010h;

    /* JADX INFO: renamed from: i */
    public final String f112011i;

    public jg20(String str, String str2, String str3, String str4, String str5, String str6, l10 l10Var, String str7, String str8) {
        this.f112003a = str;
        this.f112004b = str2;
        this.f112005c = str3;
        this.f112006d = str4;
        this.f112007e = str5;
        this.f112008f = str6;
        this.f112009g = l10Var;
        this.f112010h = str7;
        this.f112011i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg20)) {
            return false;
        }
        jg20 jg20Var = (jg20) obj;
        return wj50.m88271j(this.f112003a, jg20Var.f112003a) && wj50.m88271j(this.f112004b, jg20Var.f112004b) && wj50.m88271j(this.f112005c, jg20Var.f112005c) && wj50.m88271j(this.f112006d, jg20Var.f112006d) && wj50.m88271j(this.f112007e, jg20Var.f112007e) && wj50.m88271j(this.f112008f, jg20Var.f112008f) && wj50.m88271j(this.f112009g, jg20Var.f112009g) && wj50.m88271j(this.f112010h, jg20Var.f112010h) && wj50.m88271j(this.f112011i, jg20Var.f112011i);
    }

    public final int hashCode() {
        return this.f112011i.hashCode() + s571.m77243b((this.f112009g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f112003a.hashCode() * 31, 31, this.f112004b), 31, this.f112005c), 31, this.f112006d), 31, this.f112007e), 31, this.f112008f)) * 31, 31, this.f112010h);
    }
}
