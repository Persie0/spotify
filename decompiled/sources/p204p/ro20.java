package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ro20 {

    /* JADX INFO: renamed from: a */
    public final String f201049a;

    /* JADX INFO: renamed from: b */
    public final String f201050b;

    /* JADX INFO: renamed from: c */
    public final String f201051c;

    /* JADX INFO: renamed from: d */
    public final String f201052d;

    /* JADX INFO: renamed from: e */
    public final int f201053e;

    /* JADX INFO: renamed from: f */
    public final boolean f201054f;

    /* JADX INFO: renamed from: g */
    public final boolean f201055g;

    /* JADX INFO: renamed from: h */
    public final boolean f201056h;

    /* JADX INFO: renamed from: i */
    public final int f201057i;

    /* JADX INFO: renamed from: j */
    public final boolean f201058j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ro20(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        String str5 = (i2 & 2) != 0 ? null : str2;
        String str6 = (i2 & 4) != 0 ? null : str3;
        String str7 = (i2 & 8) != 0 ? null : str4;
        this((i2 & 16) != 0 ? 1 : i, (i2 & 256) == 0 ? 2 : 1, str, str5, str6, str7, (i2 & 32) == 0, (i2 & 64) == 0, (i2 & 128) == 0, (i2 & 512) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro20)) {
            return false;
        }
        ro20 ro20Var = (ro20) obj;
        return wj50.m88271j(this.f201049a, ro20Var.f201049a) && wj50.m88271j(this.f201050b, ro20Var.f201050b) && wj50.m88271j(this.f201051c, ro20Var.f201051c) && wj50.m88271j(this.f201052d, ro20Var.f201052d) && this.f201053e == ro20Var.f201053e && this.f201054f == ro20Var.f201054f && this.f201055g == ro20Var.f201055g && this.f201056h == ro20Var.f201056h && this.f201057i == ro20Var.f201057i && this.f201058j == ro20Var.f201058j;
    }

    public final int hashCode() {
        int iHashCode = this.f201049a.hashCode() * 31;
        String str = this.f201050b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f201051c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f201052d;
        return Boolean.hashCode(this.f201058j) + mt60.m62800g(this.f201057i, s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f201053e, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.f201054f), 31, this.f201055g), 31, this.f201056h), 31);
    }

    public ro20(int i, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f201049a = str;
        this.f201050b = str2;
        this.f201051c = str3;
        this.f201052d = str4;
        this.f201053e = i;
        this.f201054f = z;
        this.f201055g = z2;
        this.f201056h = z3;
        this.f201057i = i2;
        this.f201058j = z4;
    }
}
