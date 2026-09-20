package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n0v {

    /* JADX INFO: renamed from: a */
    public final long f149172a;

    /* JADX INFO: renamed from: b */
    public final long f149173b;

    /* JADX INFO: renamed from: c */
    public final long f149174c;

    /* JADX INFO: renamed from: d */
    public final long f149175d;

    /* JADX INFO: renamed from: e */
    public final long f149176e;

    /* JADX INFO: renamed from: f */
    public final long f149177f;

    /* JADX INFO: renamed from: g */
    public final long f149178g;

    /* JADX INFO: renamed from: h */
    public final long f149179h;

    /* JADX INFO: renamed from: i */
    public final long f149180i;

    /* JADX INFO: renamed from: j */
    public final long f149181j;

    public n0v(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f149172a = j;
        this.f149173b = j2;
        this.f149174c = j3;
        this.f149175d = j4;
        this.f149176e = j5;
        this.f149177f = j6;
        this.f149178g = j7;
        this.f149179h = j8;
        this.f149180i = j9;
        this.f149181j = j10;
    }

    /* JADX INFO: renamed from: a */
    public static n0v m63461a(n0v n0vVar, long j, long j2, long j3, long j4, int i) {
        return new n0v(n0vVar.f149172a, n0vVar.f149173b, n0vVar.f149174c, n0vVar.f149175d, j, (i & 32) != 0 ? n0vVar.f149177f : j2, n0vVar.f149178g, (i & 128) != 0 ? n0vVar.f149179h : j3, (i & 256) != 0 ? n0vVar.f149180i : j4, n0vVar.f149181j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0v)) {
            return false;
        }
        n0v n0vVar = (n0v) obj;
        long j = n0vVar.f149172a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f149172a, j) && as91.m27074b(this.f149173b, n0vVar.f149173b) && as91.m27074b(this.f149174c, n0vVar.f149174c) && as91.m27074b(this.f149175d, n0vVar.f149175d) && as91.m27074b(this.f149176e, n0vVar.f149176e) && as91.m27074b(this.f149177f, n0vVar.f149177f) && as91.m27074b(this.f149178g, n0vVar.f149178g) && as91.m27074b(this.f149179h, n0vVar.f149179h) && as91.m27074b(this.f149180i, n0vVar.f149180i) && as91.m27074b(this.f149181j, n0vVar.f149181j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f149181j) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f149172a) * 31, this.f149173b, 31), this.f149174c, 31), this.f149175d, 31), this.f149176e, 31), this.f149177f, 31), this.f149178g, 31), this.f149179h, 31), this.f149180i, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0v(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i) {
        long j9 = n6f.f150870j;
        this(j, j2, j3, j4, j5, j6, j7, j9, j9, (i & 512) != 0 ? j9 : j8);
    }
}
