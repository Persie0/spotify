package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nyt0 {

    /* JADX INFO: renamed from: a */
    public final String f159894a;

    /* JADX INFO: renamed from: b */
    public final String f159895b;

    /* JADX INFO: renamed from: c */
    public final int f159896c;

    /* JADX INFO: renamed from: d */
    public final String f159897d;

    /* JADX INFO: renamed from: e */
    public final String f159898e = "";

    /* JADX INFO: renamed from: f */
    public final c0u0 f159899f;

    static {
        c0u0 c0u0Var = c0u0.f32868i;
    }

    public nyt0(String str, String str2, int i, String str3, c0u0 c0u0Var) {
        this.f159894a = str;
        this.f159895b = str2;
        this.f159896c = i;
        this.f159897d = str3;
        this.f159899f = c0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyt0)) {
            return false;
        }
        nyt0 nyt0Var = (nyt0) obj;
        return wj50.m88271j(this.f159894a, nyt0Var.f159894a) && wj50.m88271j(this.f159895b, nyt0Var.f159895b) && this.f159896c == nyt0Var.f159896c && wj50.m88271j(this.f159897d, nyt0Var.f159897d) && wj50.m88271j(this.f159898e, nyt0Var.f159898e) && wj50.m88271j(this.f159899f, nyt0Var.f159899f);
    }

    public final int hashCode() {
        return this.f159899f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(f710.m40938f(this.f159896c, s571.m77243b(this.f159894a.hashCode() * 31, 31, this.f159895b), 31), 31, this.f159897d), 31, this.f159898e), 31, false);
    }
}
