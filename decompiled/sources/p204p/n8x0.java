package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n8x0 {

    /* JADX INFO: renamed from: a */
    public final String f151653a;

    /* JADX INFO: renamed from: b */
    public final String f151654b;

    /* JADX INFO: renamed from: c */
    public final String f151655c;

    /* JADX INFO: renamed from: d */
    public final String f151656d;

    /* JADX INFO: renamed from: e */
    public final String f151657e;

    /* JADX INFO: renamed from: f */
    public final String f151658f;

    public n8x0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f151653a = str;
        this.f151654b = str2;
        this.f151655c = str3;
        this.f151656d = str4;
        this.f151657e = str5;
        this.f151658f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8x0)) {
            return false;
        }
        n8x0 n8x0Var = (n8x0) obj;
        return wj50.m88271j(this.f151653a, n8x0Var.f151653a) && wj50.m88271j(this.f151654b, n8x0Var.f151654b) && wj50.m88271j(this.f151655c, n8x0Var.f151655c) && wj50.m88271j(this.f151656d, n8x0Var.f151656d) && wj50.m88271j(this.f151657e, n8x0Var.f151657e) && wj50.m88271j(this.f151658f, n8x0Var.f151658f);
    }

    public final int hashCode() {
        return this.f151658f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f151653a.hashCode() * 31, 31, this.f151654b), 31, this.f151655c), 31, this.f151656d), 31, this.f151657e);
    }
}
