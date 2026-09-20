package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lz31 {

    /* JADX INFO: renamed from: a */
    public final boolean f138249a;

    /* JADX INFO: renamed from: b */
    public final boolean f138250b;

    /* JADX INFO: renamed from: c */
    public final boolean f138251c;

    /* JADX INFO: renamed from: d */
    public final boolean f138252d;

    /* JADX INFO: renamed from: e */
    public final boolean f138253e;

    /* JADX INFO: renamed from: f */
    public final boolean f138254f;

    /* JADX INFO: renamed from: g */
    public final boolean f138255g;

    /* JADX INFO: renamed from: h */
    public final int f138256h;

    public lz31(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        this.f138249a = z;
        this.f138250b = z2;
        this.f138251c = z3;
        this.f138252d = z4;
        this.f138253e = z5;
        this.f138254f = z6;
        this.f138255g = z7;
        this.f138256h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz31)) {
            return false;
        }
        lz31 lz31Var = (lz31) obj;
        return this.f138249a == lz31Var.f138249a && this.f138250b == lz31Var.f138250b && this.f138251c == lz31Var.f138251c && this.f138252d == lz31Var.f138252d && this.f138253e == lz31Var.f138253e && this.f138254f == lz31Var.f138254f && this.f138255g == lz31Var.f138255g && this.f138256h == lz31Var.f138256h;
    }

    public final int hashCode() {
        return edb.m38547C(this.f138256h) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f138249a) * 31, 31, this.f138250b), 31, this.f138251c), 31, this.f138252d), 31, this.f138253e), 31, this.f138254f), 31, this.f138255g);
    }
}
