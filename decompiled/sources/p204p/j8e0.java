package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j8e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109915a;

    /* JADX INFO: renamed from: b */
    public final String f109916b;

    /* JADX INFO: renamed from: c */
    public final String f109917c;

    /* JADX INFO: renamed from: d */
    public final String f109918d;

    /* JADX INFO: renamed from: e */
    public final int f109919e;

    /* JADX INFO: renamed from: f */
    public final String f109920f;

    /* JADX INFO: renamed from: g */
    public final String f109921g;

    /* JADX INFO: renamed from: h */
    public final String f109922h;

    /* JADX INFO: renamed from: i */
    public final String f109923i;

    /* JADX INFO: renamed from: j */
    public final String f109924j;

    /* JADX INFO: renamed from: k */
    public final String f109925k;

    public j8e0(boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f109915a = z;
        this.f109916b = str;
        this.f109917c = str2;
        this.f109918d = str3;
        this.f109919e = i;
        this.f109920f = str4;
        this.f109921g = str5;
        this.f109922h = str6;
        this.f109923i = str7;
        this.f109924j = str8;
        this.f109925k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8e0)) {
            return false;
        }
        j8e0 j8e0Var = (j8e0) obj;
        return this.f109915a == j8e0Var.f109915a && this.f109916b.equals(j8e0Var.f109916b) && this.f109917c.equals(j8e0Var.f109917c) && this.f109918d.equals(j8e0Var.f109918d) && this.f109919e == j8e0Var.f109919e && this.f109920f.equals(j8e0Var.f109920f) && this.f109921g.equals(j8e0Var.f109921g) && this.f109922h.equals(j8e0Var.f109922h) && wj50.m88271j(this.f109923i, j8e0Var.f109923i) && this.f109924j.equals(j8e0Var.f109924j) && this.f109925k.equals(j8e0Var.f109925k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(f710.m40938f(this.f109919e, s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f109915a) * 31, 31, this.f109916b), 31, this.f109917c), 31, this.f109918d), 31), 31, this.f109920f), 31, this.f109921g), 31, this.f109922h);
        String str = this.f109923i;
        return this.f109925k.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f109924j);
    }
}
