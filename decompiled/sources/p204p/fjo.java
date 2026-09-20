package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fjo {

    /* JADX INFO: renamed from: a */
    public final ejo f70322a;

    /* JADX INFO: renamed from: b */
    public final boolean f70323b;

    /* JADX INFO: renamed from: c */
    public final boolean f70324c;

    /* JADX INFO: renamed from: d */
    public final boolean f70325d;

    /* JADX INFO: renamed from: e */
    public final boolean f70326e;

    /* JADX INFO: renamed from: f */
    public final int f70327f;

    /* JADX INFO: renamed from: g */
    public final boolean f70328g;

    public fjo(ejo ejoVar, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.f70322a = ejoVar;
        this.f70323b = z;
        this.f70324c = z2;
        this.f70325d = z3;
        this.f70326e = z4;
        this.f70327f = i;
        this.f70328g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjo)) {
            return false;
        }
        fjo fjoVar = (fjo) obj;
        return wj50.m88271j(this.f70322a, fjoVar.f70322a) && this.f70323b == fjoVar.f70323b && this.f70324c == fjoVar.f70324c && this.f70325d == fjoVar.f70325d && this.f70326e == fjoVar.f70326e && this.f70327f == fjoVar.f70327f && this.f70328g == fjoVar.f70328g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70328g) + f710.m40938f(this.f70327f, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f70322a.hashCode() * 31, 31, this.f70323b), 31, this.f70324c), 31, this.f70325d), 31, this.f70326e), 31);
    }
}
