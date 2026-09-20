package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oyt0 {

    /* JADX INFO: renamed from: a */
    public final String f171893a;

    /* JADX INFO: renamed from: b */
    public final String f171894b;

    /* JADX INFO: renamed from: c */
    public final int f171895c;

    /* JADX INFO: renamed from: d */
    public final String f171896d;

    /* JADX INFO: renamed from: e */
    public final boolean f171897e;

    /* JADX INFO: renamed from: f */
    public final c0u0 f171898f;

    /* JADX INFO: renamed from: g */
    public final String f171899g;

    /* JADX INFO: renamed from: h */
    public final String f171900h;

    static {
        c0u0 c0u0Var = c0u0.f32868i;
    }

    public oyt0(String str, String str2, int i, String str3, boolean z, c0u0 c0u0Var, String str4, String str5) {
        this.f171893a = str;
        this.f171894b = str2;
        this.f171895c = i;
        this.f171896d = str3;
        this.f171897e = z;
        this.f171898f = c0u0Var;
        this.f171899g = str4;
        this.f171900h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyt0)) {
            return false;
        }
        oyt0 oyt0Var = (oyt0) obj;
        return wj50.m88271j(this.f171893a, oyt0Var.f171893a) && wj50.m88271j(this.f171894b, oyt0Var.f171894b) && this.f171895c == oyt0Var.f171895c && wj50.m88271j(this.f171896d, oyt0Var.f171896d) && this.f171897e == oyt0Var.f171897e && wj50.m88271j(this.f171898f, oyt0Var.f171898f) && wj50.m88271j(this.f171899g, oyt0Var.f171899g) && wj50.m88271j(this.f171900h, oyt0Var.f171900h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f171898f.hashCode() + s571.m77245d(s571.m77243b(f710.m40938f(this.f171895c, s571.m77243b(this.f171893a.hashCode() * 31, 31, this.f171894b), 31), 31, this.f171896d), 31, this.f171897e)) * 31, 31, this.f171899g);
        String str = this.f171900h;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
