package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l21 {

    /* JADX INFO: renamed from: a */
    public final String f128864a;

    /* JADX INFO: renamed from: b */
    public final String f128865b;

    /* JADX INFO: renamed from: c */
    public final String f128866c;

    /* JADX INFO: renamed from: d */
    public final cbm0 f128867d;

    /* JADX INFO: renamed from: e */
    public final av91 f128868e;

    public l21(String str, String str2, String str3, cbm0 cbm0Var, av91 av91Var) {
        this.f128864a = str;
        this.f128865b = str2;
        this.f128866c = str3;
        this.f128867d = cbm0Var;
        this.f128868e = av91Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m57881a() {
        return this.f128864a;
    }

    /* JADX INFO: renamed from: b */
    public final String m57882b() {
        return this.f128865b;
    }

    /* JADX INFO: renamed from: c */
    public final String m57883c() {
        return this.f128866c;
    }

    /* JADX INFO: renamed from: d */
    public final zam0 m57884d() {
        return this.f128867d;
    }

    /* JADX INFO: renamed from: e */
    public final av91 m57885e() {
        return this.f128868e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        return wj50.m88271j(this.f128864a, l21Var.f128864a) && wj50.m88271j(this.f128865b, l21Var.f128865b) && wj50.m88271j(this.f128866c, l21Var.f128866c) && this.f128867d.equals(l21Var.f128867d) && this.f128868e.equals(l21Var.f128868e);
    }

    public final int hashCode() {
        return this.f128868e.f20129d.hashCode() + ((this.f128867d.hashCode() + s571.m77243b(s571.m77243b(this.f128864a.hashCode() * 31, 31, this.f128865b), 31, this.f128866c)) * 31);
    }
}
