package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nyp0 {

    /* JADX INFO: renamed from: a */
    public final String f159872a;

    /* JADX INFO: renamed from: b */
    public final String f159873b;

    /* JADX INFO: renamed from: c */
    public final String f159874c;

    /* JADX INFO: renamed from: d */
    public final String f159875d;

    /* JADX INFO: renamed from: e */
    public final String f159876e;

    /* JADX INFO: renamed from: f */
    public final String f159877f;

    /* JADX INFO: renamed from: g */
    public final int f159878g;

    public nyp0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f159872a = str;
        this.f159873b = str2;
        this.f159874c = str3;
        this.f159875d = str4;
        this.f159876e = str5;
        this.f159877f = str6;
        this.f159878g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyp0)) {
            return false;
        }
        nyp0 nyp0Var = (nyp0) obj;
        return wj50.m88271j(this.f159872a, nyp0Var.f159872a) && wj50.m88271j(this.f159873b, nyp0Var.f159873b) && wj50.m88271j(this.f159874c, nyp0Var.f159874c) && wj50.m88271j(this.f159875d, nyp0Var.f159875d) && wj50.m88271j(this.f159876e, nyp0Var.f159876e) && wj50.m88271j(this.f159877f, nyp0Var.f159877f) && this.f159878g == nyp0Var.f159878g;
    }

    public final int hashCode() {
        return f710.m40938f(this.f159878g, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f159872a.hashCode() * 31, 31, this.f159873b), 31, this.f159874c), 31, this.f159875d), 31, this.f159876e), 31, this.f159877f), 31);
    }
}
