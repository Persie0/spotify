package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v1n0 {

    /* JADX INFO: renamed from: a */
    public final String f236416a;

    /* JADX INFO: renamed from: b */
    public final String f236417b;

    /* JADX INFO: renamed from: c */
    public final String f236418c;

    /* JADX INFO: renamed from: d */
    public final String f236419d;

    /* JADX INFO: renamed from: e */
    public final boolean f236420e;

    /* JADX INFO: renamed from: f */
    public final boolean f236421f;

    /* JADX INFO: renamed from: g */
    public final boolean f236422g;

    /* JADX INFO: renamed from: h */
    public final boolean f236423h;

    /* JADX INFO: renamed from: i */
    public final boolean f236424i;

    /* JADX INFO: renamed from: j */
    public final boolean f236425j;

    public v1n0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f236416a = str;
        this.f236417b = str2;
        this.f236418c = str3;
        this.f236419d = str4;
        this.f236420e = z;
        this.f236421f = z2;
        this.f236422g = z3;
        this.f236423h = z4;
        this.f236424i = z5;
        this.f236425j = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1n0)) {
            return false;
        }
        v1n0 v1n0Var = (v1n0) obj;
        return wj50.m88271j(this.f236416a, v1n0Var.f236416a) && wj50.m88271j(this.f236417b, v1n0Var.f236417b) && wj50.m88271j(this.f236418c, v1n0Var.f236418c) && wj50.m88271j(this.f236419d, v1n0Var.f236419d) && this.f236420e == v1n0Var.f236420e && this.f236421f == v1n0Var.f236421f && this.f236422g == v1n0Var.f236422g && this.f236423h == v1n0Var.f236423h && this.f236424i == v1n0Var.f236424i && this.f236425j == v1n0Var.f236425j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f236416a.hashCode() * 31, 31, this.f236417b), 31, this.f236418c);
        String str = this.f236419d;
        return Boolean.hashCode(this.f236425j) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f236420e), 31, this.f236421f), 31, this.f236422g), 31, this.f236423h), 31, this.f236424i);
    }
}
