package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b630 {

    /* JADX INFO: renamed from: a */
    public final a630 f23825a;

    /* JADX INFO: renamed from: b */
    public int f23826b = 1;

    /* JADX INFO: renamed from: c */
    public final long f23827c;

    /* JADX INFO: renamed from: d */
    public long f23828d;

    /* JADX INFO: renamed from: e */
    public long f23829e;

    /* JADX INFO: renamed from: f */
    public long f23830f;

    public b630(a630 a630Var, long j) {
        this.f23825a = a630Var;
        this.f23827c = j;
        this.f23828d = j;
        this.f23829e = j;
        this.f23830f = j;
    }

    /* JADX INFO: renamed from: a */
    public final a630 m28245a() {
        return this.f23825a;
    }

    /* JADX INFO: renamed from: b */
    public final int m28246b() {
        return this.f23826b;
    }

    /* JADX INFO: renamed from: c */
    public final long m28247c() {
        return this.f23827c;
    }

    /* JADX INFO: renamed from: d */
    public final long m28248d() {
        return this.f23830f;
    }

    /* JADX INFO: renamed from: e */
    public final long m28249e() {
        return this.f23829e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b630)) {
            return false;
        }
        b630 b630Var = (b630) obj;
        return this.f23825a.equals(b630Var.f23825a) && this.f23826b == b630Var.f23826b && this.f23827c == b630Var.f23827c && this.f23828d == b630Var.f23828d && this.f23829e == b630Var.f23829e && this.f23830f == b630Var.f23830f;
    }

    /* JADX INFO: renamed from: f */
    public final long m28250f() {
        return this.f23828d;
    }

    /* JADX INFO: renamed from: g */
    public final void m28251g(int i) {
        this.f23826b = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m28252h(long j) {
        this.f23830f = j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23830f) + dq60.m36605e(dq60.m36605e(dq60.m36605e(f710.m40938f(this.f23826b, this.f23825a.f12681a.hashCode() * 31, 31), this.f23827c, 31), this.f23828d, 31), this.f23829e, 31);
    }

    /* JADX INFO: renamed from: i */
    public final void m28253i(long j) {
        this.f23829e = j;
    }

    /* JADX INFO: renamed from: j */
    public final void m28254j(long j) {
        this.f23828d = j;
    }
}
