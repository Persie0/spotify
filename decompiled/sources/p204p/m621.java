package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m621 {

    /* JADX INFO: renamed from: a */
    public final String f140340a;

    /* JADX INFO: renamed from: b */
    public final String f140341b;

    /* JADX INFO: renamed from: c */
    public final boolean f140342c;

    /* JADX INFO: renamed from: d */
    public final String f140343d;

    /* JADX INFO: renamed from: e */
    public final int f140344e;

    /* JADX INFO: renamed from: f */
    public final String f140345f;

    /* JADX INFO: renamed from: g */
    public final boolean f140346g;

    /* JADX INFO: renamed from: h */
    public final boolean f140347h;

    /* JADX INFO: renamed from: i */
    public final String f140348i;

    public m621(String str, String str2, boolean z, String str3, int i, String str4, boolean z2, boolean z3, String str5) {
        this.f140340a = str;
        this.f140341b = str2;
        this.f140342c = z;
        this.f140343d = str3;
        this.f140344e = i;
        this.f140345f = str4;
        this.f140346g = z2;
        this.f140347h = z3;
        this.f140348i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m621)) {
            return false;
        }
        m621 m621Var = (m621) obj;
        return wj50.m88271j(this.f140340a, m621Var.f140340a) && wj50.m88271j(this.f140341b, m621Var.f140341b) && this.f140342c == m621Var.f140342c && wj50.m88271j(this.f140343d, m621Var.f140343d) && this.f140344e == m621Var.f140344e && wj50.m88271j(this.f140345f, m621Var.f140345f) && this.f140346g == m621Var.f140346g && this.f140347h == m621Var.f140347h && wj50.m88271j(this.f140348i, m621Var.f140348i);
    }

    public final int hashCode() {
        return this.f140348i.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(f710.m40938f(this.f140344e, s571.m77243b(s571.m77245d(s571.m77243b(this.f140340a.hashCode() * 31, 31, this.f140341b), 31, this.f140342c), 31, this.f140343d), 31), 31, this.f140345f), 31, this.f140346g), 31, this.f140347h);
    }
}
