package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ogt0 {

    /* JADX INFO: renamed from: a */
    public final String f165253a;

    /* JADX INFO: renamed from: b */
    public final String f165254b;

    /* JADX INFO: renamed from: c */
    public final String f165255c;

    /* JADX INFO: renamed from: d */
    public final String f165256d;

    /* JADX INFO: renamed from: e */
    public final String f165257e;

    /* JADX INFO: renamed from: f */
    public final String f165258f;

    /* JADX INFO: renamed from: g */
    public final String f165259g;

    public ogt0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f165253a = str;
        this.f165254b = str2;
        this.f165255c = str3;
        this.f165256d = str4;
        this.f165257e = str5;
        this.f165258f = str6;
        this.f165259g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogt0)) {
            return false;
        }
        ogt0 ogt0Var = (ogt0) obj;
        return wj50.m88271j(this.f165253a, ogt0Var.f165253a) && wj50.m88271j(this.f165254b, ogt0Var.f165254b) && wj50.m88271j(this.f165255c, ogt0Var.f165255c) && wj50.m88271j(this.f165256d, ogt0Var.f165256d) && wj50.m88271j(this.f165257e, ogt0Var.f165257e) && wj50.m88271j(this.f165258f, ogt0Var.f165258f) && wj50.m88271j(this.f165259g, ogt0Var.f165259g);
    }

    public final int hashCode() {
        return this.f165259g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f165253a.hashCode() * 31, 31, this.f165254b), 31, this.f165255c), 31, this.f165256d), 31, this.f165257e), 31, this.f165258f);
    }
}
