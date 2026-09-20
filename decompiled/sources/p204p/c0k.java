package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c0k {

    /* JADX INFO: renamed from: a */
    public final String f32798a;

    /* JADX INFO: renamed from: b */
    public final String f32799b;

    /* JADX INFO: renamed from: c */
    public final int f32800c;

    /* JADX INFO: renamed from: d */
    public final xt80 f32801d;

    /* JADX INFO: renamed from: e */
    public final wv11 f32802e;

    /* JADX INFO: renamed from: f */
    public final p8y0 f32803f;

    public c0k(String str, String str2, int i, xt80 xt80Var, wv11 wv11Var, p8y0 p8y0Var) {
        this.f32798a = str;
        this.f32799b = str2;
        this.f32800c = i;
        this.f32801d = xt80Var;
        this.f32802e = wv11Var;
        this.f32803f = p8y0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m31178a() {
        return this.f32800c;
    }

    /* JADX INFO: renamed from: b */
    public final String m31179b() {
        return this.f32798a;
    }

    /* JADX INFO: renamed from: c */
    public final xt80 m31180c() {
        return this.f32801d;
    }

    /* JADX INFO: renamed from: d */
    public final p8y0 m31181d() {
        return this.f32803f;
    }

    /* JADX INFO: renamed from: e */
    public final wv11 m31182e() {
        return this.f32802e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0k)) {
            return false;
        }
        c0k c0kVar = (c0k) obj;
        return wj50.m88271j(this.f32798a, c0kVar.f32798a) && wj50.m88271j(this.f32799b, c0kVar.f32799b) && this.f32800c == c0kVar.f32800c && wj50.m88271j(this.f32801d, c0kVar.f32801d) && wj50.m88271j(this.f32802e, c0kVar.f32802e) && wj50.m88271j(this.f32803f, c0kVar.f32803f);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f32800c, s571.m77243b(this.f32798a.hashCode() * 31, 31, this.f32799b), 31);
        xt80 xt80Var = this.f32801d;
        return this.f32803f.hashCode() + ((this.f32802e.hashCode() + ((iM40938f + (xt80Var == null ? 0 : xt80Var.hashCode())) * 31)) * 31);
    }
}
