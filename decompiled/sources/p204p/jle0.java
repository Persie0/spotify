package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jle0 {

    /* JADX INFO: renamed from: a */
    public final String f113599a;

    /* JADX INFO: renamed from: b */
    public final String f113600b;

    /* JADX INFO: renamed from: c */
    public final String f113601c;

    /* JADX INFO: renamed from: d */
    public final String f113602d;

    /* JADX INFO: renamed from: e */
    public final String f113603e;

    /* JADX INFO: renamed from: f */
    public final String f113604f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f113605g;

    /* JADX INFO: renamed from: h */
    public final boolean f113606h;

    public jle0(String str, String str2, String str3, String str4, String str5, String str6, rcm0 rcm0Var, boolean z) {
        this.f113599a = str;
        this.f113600b = str2;
        this.f113601c = str3;
        this.f113602d = str4;
        this.f113603e = str5;
        this.f113604f = str6;
        this.f113605g = rcm0Var;
        this.f113606h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jle0)) {
            return false;
        }
        jle0 jle0Var = (jle0) obj;
        return wj50.m88271j(this.f113599a, jle0Var.f113599a) && wj50.m88271j(this.f113600b, jle0Var.f113600b) && wj50.m88271j(this.f113601c, jle0Var.f113601c) && wj50.m88271j(this.f113602d, jle0Var.f113602d) && wj50.m88271j(this.f113603e, jle0Var.f113603e) && wj50.m88271j(this.f113604f, jle0Var.f113604f) && wj50.m88271j(this.f113605g, jle0Var.f113605g) && this.f113606h == jle0Var.f113606h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113606h) + yds.m93483m(this.f113605g, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f113599a.hashCode() * 31, 31, this.f113600b), 31, this.f113601c), 31, this.f113602d), 31, this.f113603e), 31, this.f113604f), 31);
    }
}
