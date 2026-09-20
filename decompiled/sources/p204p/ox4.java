package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ox4 {

    /* JADX INFO: renamed from: a */
    public final long f170874a;

    /* JADX INFO: renamed from: b */
    public final long f170875b;

    /* JADX INFO: renamed from: c */
    public final long f170876c;

    /* JADX INFO: renamed from: d */
    public final long f170877d;

    /* JADX INFO: renamed from: e */
    public final float f170878e;

    public ox4(float f, long j, long j2, long j3, long j4) {
        this.f170874a = j;
        this.f170875b = j2;
        this.f170876c = j3;
        this.f170877d = j4;
        this.f170878e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        long j = ox4Var.f170874a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f170874a, j) && as91.m27074b(this.f170875b, ox4Var.f170875b) && as91.m27074b(this.f170876c, ox4Var.f170876c) && as91.m27074b(this.f170877d, ox4Var.f170877d) && ybs.m93301b(this.f170878e, ox4Var.f170878e);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Float.hashCode(this.f170878e) + ms2.m62682g(ms2.m62682g(ms2.m62682g(as91.m27075c(this.f170874a) * 31, this.f170875b, 31), this.f170876c, 31), this.f170877d, 31);
    }
}
