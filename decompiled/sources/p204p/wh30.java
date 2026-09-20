package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wh30 {

    /* JADX INFO: renamed from: a */
    public final String f251238a;

    /* JADX INFO: renamed from: b */
    public final String f251239b;

    /* JADX INFO: renamed from: c */
    public final String f251240c;

    /* JADX INFO: renamed from: d */
    public final String f251241d;

    /* JADX INFO: renamed from: e */
    public final String f251242e;

    /* JADX INFO: renamed from: f */
    public final String f251243f;

    /* JADX INFO: renamed from: g */
    public final String f251244g;

    /* JADX INFO: renamed from: h */
    public final boolean f251245h;

    /* JADX INFO: renamed from: i */
    public final tu20 f251246i;

    public wh30(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, tu20 tu20Var) {
        this.f251238a = str;
        this.f251239b = str2;
        this.f251240c = str3;
        this.f251241d = str4;
        this.f251242e = str5;
        this.f251243f = str6;
        this.f251244g = str7;
        this.f251245h = z;
        this.f251246i = tu20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh30)) {
            return false;
        }
        wh30 wh30Var = (wh30) obj;
        return wj50.m88271j(this.f251238a, wh30Var.f251238a) && wj50.m88271j(this.f251239b, wh30Var.f251239b) && wj50.m88271j(this.f251240c, wh30Var.f251240c) && wj50.m88271j(this.f251241d, wh30Var.f251241d) && wj50.m88271j(this.f251242e, wh30Var.f251242e) && wj50.m88271j(this.f251243f, wh30Var.f251243f) && wj50.m88271j(this.f251244g, wh30Var.f251244g) && this.f251245h == wh30Var.f251245h && wj50.m88271j(this.f251246i, wh30Var.f251246i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f251238a.hashCode() * 31, 31, this.f251239b), 31, this.f251240c), 31, this.f251241d), 31, this.f251242e), 31, this.f251243f), 31, this.f251244g), 31, this.f251245h);
        tu20 tu20Var = this.f251246i;
        return iM77245d + (tu20Var == null ? 0 : tu20Var.hashCode());
    }
}
