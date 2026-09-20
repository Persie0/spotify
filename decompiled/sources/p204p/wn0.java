package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wn0 {

    /* JADX INFO: renamed from: a */
    public final vky f253038a;

    /* JADX INFO: renamed from: b */
    public final String f253039b;

    /* JADX INFO: renamed from: c */
    public final String f253040c;

    /* JADX INFO: renamed from: d */
    public final ro0 f253041d;

    /* JADX INFO: renamed from: e */
    public final String f253042e;

    /* JADX INFO: renamed from: f */
    public final String f253043f;

    /* JADX INFO: renamed from: g */
    public final String f253044g;

    /* JADX INFO: renamed from: h */
    public final String f253045h;

    /* JADX INFO: renamed from: i */
    public final String f253046i;

    /* JADX INFO: renamed from: j */
    public final boolean f253047j;

    /* JADX INFO: renamed from: k */
    public final gh00 f253048k;

    public wn0(vky vkyVar, String str, String str2, ro0 ro0Var, String str3, String str4, String str5, String str6, String str7, boolean z, gh00 gh00Var) {
        this.f253038a = vkyVar;
        this.f253039b = str;
        this.f253040c = str2;
        this.f253041d = ro0Var;
        this.f253042e = str3;
        this.f253043f = str4;
        this.f253044g = str5;
        this.f253045h = str6;
        this.f253046i = str7;
        this.f253047j = z;
        this.f253048k = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final ro0 m88573a() {
        return this.f253041d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return this.f253038a.equals(wn0Var.f253038a) && wj50.m88271j(this.f253039b, wn0Var.f253039b) && wj50.m88271j(this.f253040c, wn0Var.f253040c) && wj50.m88271j(this.f253041d, wn0Var.f253041d) && wj50.m88271j(this.f253042e, wn0Var.f253042e) && wj50.m88271j(this.f253043f, wn0Var.f253043f) && wj50.m88271j(this.f253044g, wn0Var.f253044g) && wj50.m88271j(this.f253045h, wn0Var.f253045h) && wj50.m88271j(this.f253046i, wn0Var.f253046i) && this.f253047j == wn0Var.f253047j && wj50.m88271j(this.f253048k, wn0Var.f253048k);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f253038a.f242314a) * 31;
        String str = this.f253039b;
        return this.f253048k.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((this.f253041d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f253040c)) * 31, 31, this.f253042e), 31, this.f253043f), 31, this.f253044g), 31, this.f253045h), 31, this.f253046i), 31, this.f253047j);
    }
}
