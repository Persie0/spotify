package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s30 {

    /* JADX INFO: renamed from: a */
    public final String f205140a;

    /* JADX INFO: renamed from: b */
    public final String f205141b;

    /* JADX INFO: renamed from: c */
    public final String f205142c;

    /* JADX INFO: renamed from: d */
    public final String f205143d;

    /* JADX INFO: renamed from: e */
    public final String f205144e;

    /* JADX INFO: renamed from: f */
    public final aaj f205145f;

    /* JADX INFO: renamed from: g */
    public final long f205146g;

    /* JADX INFO: renamed from: h */
    public final long f205147h;

    public s30(String str, String str2, String str3, String str4, String str5, aaj aajVar, long j, long j2) {
        this.f205140a = str;
        this.f205141b = str2;
        this.f205142c = str3;
        this.f205143d = str4;
        this.f205144e = str5;
        this.f205145f = aajVar;
        this.f205146g = j;
        this.f205147h = j2;
    }

    /* JADX INFO: renamed from: a */
    public final String m77112a() {
        return this.f205143d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return wj50.m88271j(this.f205140a, s30Var.f205140a) && wj50.m88271j(this.f205141b, s30Var.f205141b) && wj50.m88271j(this.f205142c, s30Var.f205142c) && wj50.m88271j(this.f205143d, s30Var.f205143d) && wj50.m88271j(this.f205144e, s30Var.f205144e) && this.f205145f == s30Var.f205145f && this.f205146g == s30Var.f205146g && this.f205147h == s30Var.f205147h;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205147h) + dq60.m36605e((this.f205145f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f205140a.hashCode() * 31, 31, this.f205141b), 31, this.f205142c), 31, this.f205143d), 31, this.f205144e)) * 31, this.f205146g, 31);
    }
}
