package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bp81 {

    /* JADX INFO: renamed from: a */
    public final String f29352a;

    /* JADX INFO: renamed from: b */
    public final String f29353b;

    /* JADX INFO: renamed from: c */
    public final String f29354c;

    /* JADX INFO: renamed from: d */
    public final String f29355d;

    /* JADX INFO: renamed from: e */
    public final String f29356e;

    /* JADX INFO: renamed from: f */
    public final String f29357f;

    /* JADX INFO: renamed from: g */
    public final String f29358g;

    /* JADX INFO: renamed from: h */
    public final boolean f29359h;

    /* JADX INFO: renamed from: i */
    public final boolean f29360i;

    public bp81(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.f29352a = str;
        this.f29353b = str2;
        this.f29354c = str3;
        this.f29355d = str4;
        this.f29356e = str5;
        this.f29357f = str6;
        this.f29358g = str7;
        this.f29359h = z;
        this.f29360i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp81)) {
            return false;
        }
        bp81 bp81Var = (bp81) obj;
        return wj50.m88271j(this.f29352a, bp81Var.f29352a) && wj50.m88271j(this.f29353b, bp81Var.f29353b) && wj50.m88271j(this.f29354c, bp81Var.f29354c) && wj50.m88271j(this.f29355d, bp81Var.f29355d) && wj50.m88271j(this.f29356e, bp81Var.f29356e) && wj50.m88271j(this.f29357f, bp81Var.f29357f) && wj50.m88271j(this.f29358g, bp81Var.f29358g) && this.f29359h == bp81Var.f29359h && this.f29360i == bp81Var.f29360i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29360i) + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f29352a.hashCode() * 31, 31, this.f29353b), 31, this.f29354c), 31, this.f29355d), 31, this.f29356e), 31, this.f29357f), 31, this.f29358g), 31, this.f29359h);
    }
}
