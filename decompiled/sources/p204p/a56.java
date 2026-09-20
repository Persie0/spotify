package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a56 {

    /* JADX INFO: renamed from: a */
    public final String f12433a;

    /* JADX INFO: renamed from: b */
    public final boolean f12434b;

    /* JADX INFO: renamed from: c */
    public final boolean f12435c;

    /* JADX INFO: renamed from: d */
    public final boolean f12436d;

    /* JADX INFO: renamed from: e */
    public final String f12437e;

    /* JADX INFO: renamed from: f */
    public final String f12438f;

    /* JADX INFO: renamed from: g */
    public final String f12439g;

    /* JADX INFO: renamed from: h */
    public final String f12440h;

    /* JADX INFO: renamed from: i */
    public final String f12441i;

    /* JADX INFO: renamed from: j */
    public final int f12442j;

    /* JADX INFO: renamed from: k */
    public final String f12443k;

    /* JADX INFO: renamed from: l */
    public final String f12444l;

    /* JADX INFO: renamed from: m */
    public final String f12445m;

    public a56(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9) {
        this.f12433a = str;
        this.f12434b = z;
        this.f12435c = z2;
        this.f12436d = z3;
        this.f12437e = str2;
        this.f12438f = str3;
        this.f12439g = str4;
        this.f12440h = str5;
        this.f12441i = str6;
        this.f12442j = i;
        this.f12443k = str7;
        this.f12444l = str8;
        this.f12445m = str9;
    }

    /* JADX INFO: renamed from: a */
    public final String m24765a() {
        return this.f12445m;
    }

    /* JADX INFO: renamed from: b */
    public final String m24766b() {
        return this.f12437e;
    }

    /* JADX INFO: renamed from: c */
    public final String m24767c() {
        return this.f12439g;
    }

    /* JADX INFO: renamed from: d */
    public final String m24768d() {
        return this.f12438f;
    }

    /* JADX INFO: renamed from: e */
    public final String m24769e() {
        return this.f12441i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a56)) {
            return false;
        }
        a56 a56Var = (a56) obj;
        return wj50.m88271j(this.f12433a, a56Var.f12433a) && this.f12434b == a56Var.f12434b && this.f12435c == a56Var.f12435c && this.f12436d == a56Var.f12436d && wj50.m88271j(this.f12437e, a56Var.f12437e) && wj50.m88271j(this.f12438f, a56Var.f12438f) && wj50.m88271j(this.f12439g, a56Var.f12439g) && wj50.m88271j(this.f12440h, a56Var.f12440h) && wj50.m88271j(this.f12441i, a56Var.f12441i) && this.f12442j == a56Var.f12442j && wj50.m88271j(this.f12443k, a56Var.f12443k) && wj50.m88271j(this.f12444l, a56Var.f12444l) && wj50.m88271j(this.f12445m, a56Var.f12445m);
    }

    /* JADX INFO: renamed from: f */
    public final String m24770f() {
        return this.f12440h;
    }

    /* JADX INFO: renamed from: g */
    public final String m24771g() {
        return this.f12433a;
    }

    public final int hashCode() {
        return this.f12445m.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f12442j, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(this.f12433a.hashCode() * 31, 31, this.f12434b), 31, this.f12435c), 31, this.f12436d), 31, this.f12437e), 31, this.f12438f), 31, this.f12439g), 31, this.f12440h), 31, this.f12441i), 31), 31, this.f12443k), 31, this.f12444l);
    }
}
