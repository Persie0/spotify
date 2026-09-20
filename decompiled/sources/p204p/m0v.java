package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m0v {

    /* JADX INFO: renamed from: a */
    public final long f138757a;

    /* JADX INFO: renamed from: b */
    public final long f138758b;

    /* JADX INFO: renamed from: c */
    public final long f138759c;

    /* JADX INFO: renamed from: d */
    public final long f138760d;

    /* JADX INFO: renamed from: e */
    public final long f138761e;

    /* JADX INFO: renamed from: f */
    public final long f138762f;

    /* JADX INFO: renamed from: g */
    public final long f138763g;

    public m0v(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f138757a = j;
        this.f138758b = j2;
        this.f138759c = j3;
        this.f138760d = j4;
        this.f138761e = j5;
        this.f138762f = j6;
        this.f138763g = j7;
    }

    /* JADX INFO: renamed from: a */
    public final long m60478a() {
        return this.f138758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0v)) {
            return false;
        }
        m0v m0vVar = (m0v) obj;
        long j = m0vVar.f138757a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f138757a, j) && as91.m27074b(this.f138758b, m0vVar.f138758b) && as91.m27074b(this.f138759c, m0vVar.f138759c) && as91.m27074b(this.f138760d, m0vVar.f138760d) && as91.m27074b(this.f138761e, m0vVar.f138761e) && as91.m27074b(this.f138762f, m0vVar.f138762f) && as91.m27074b(this.f138763g, m0vVar.f138763g);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f138763g) + ms2.m62682g(ms2.m62682g(ms2.m62682g(ms2.m62682g(ms2.m62682g(as91.m27075c(this.f138757a) * 31, this.f138758b, 31), this.f138759c, 31), this.f138760d, 31), this.f138761e, 31), this.f138762f, 31);
    }
}
