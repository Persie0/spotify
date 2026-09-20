package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t2i {

    /* JADX INFO: renamed from: k */
    public static final t2i f216557k = new t2i("", "", "", "", null, "", "", false, 1, false);

    /* JADX INFO: renamed from: a */
    public final String f216558a;

    /* JADX INFO: renamed from: b */
    public final String f216559b;

    /* JADX INFO: renamed from: c */
    public final String f216560c;

    /* JADX INFO: renamed from: d */
    public final String f216561d;

    /* JADX INFO: renamed from: e */
    public final d4l0 f216562e;

    /* JADX INFO: renamed from: f */
    public final String f216563f;

    /* JADX INFO: renamed from: g */
    public final String f216564g;

    /* JADX INFO: renamed from: h */
    public final boolean f216565h;

    /* JADX INFO: renamed from: i */
    public final int f216566i;

    /* JADX INFO: renamed from: j */
    public final boolean f216567j;

    public t2i(String str, String str2, String str3, String str4, d4l0 d4l0Var, String str5, String str6, boolean z, int i, boolean z2) {
        this.f216558a = str;
        this.f216559b = str2;
        this.f216560c = str3;
        this.f216561d = str4;
        this.f216562e = d4l0Var;
        this.f216563f = str5;
        this.f216564g = str6;
        this.f216565h = z;
        this.f216566i = i;
        this.f216567j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2i)) {
            return false;
        }
        t2i t2iVar = (t2i) obj;
        return wj50.m88271j(this.f216558a, t2iVar.f216558a) && wj50.m88271j(this.f216559b, t2iVar.f216559b) && wj50.m88271j(this.f216560c, t2iVar.f216560c) && this.f216561d.equals(t2iVar.f216561d) && wj50.m88271j(this.f216562e, t2iVar.f216562e) && wj50.m88271j(this.f216563f, t2iVar.f216563f) && wj50.m88271j(this.f216564g, t2iVar.f216564g) && this.f216565h == t2iVar.f216565h && this.f216566i == t2iVar.f216566i && this.f216567j == t2iVar.f216567j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f216558a.hashCode() * 31, 31, this.f216559b), 961, this.f216560c), 31, this.f216561d);
        d4l0 d4l0Var = this.f216562e;
        return Boolean.hashCode(this.f216567j) + f710.m40938f(this.f216566i, s571.m77245d(s571.m77243b(s571.m77243b((iM77243b + (d4l0Var == null ? 0 : d4l0Var.hashCode())) * 31, 31, this.f216563f), 31, this.f216564g), 31, this.f216565h), 31);
    }
}
