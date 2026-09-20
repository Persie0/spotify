package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tku {

    /* JADX INFO: renamed from: a */
    public final long f221218a;

    /* JADX INFO: renamed from: b */
    public final long f221219b;

    /* JADX INFO: renamed from: c */
    public final long f221220c;

    /* JADX INFO: renamed from: d */
    public final long f221221d;

    /* JADX INFO: renamed from: e */
    public final long f221222e;

    /* JADX INFO: renamed from: f */
    public final long f221223f;

    /* JADX INFO: renamed from: g */
    public final long f221224g;

    public tku(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f221218a = j;
        this.f221219b = j2;
        this.f221220c = j3;
        this.f221221d = j4;
        this.f221222e = j5;
        this.f221223f = j6;
        this.f221224g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tku)) {
            return false;
        }
        tku tkuVar = (tku) obj;
        long j = tkuVar.f221218a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f221218a, j) && as91.m27074b(this.f221219b, tkuVar.f221219b) && as91.m27074b(this.f221220c, tkuVar.f221220c) && as91.m27074b(this.f221221d, tkuVar.f221221d) && as91.m27074b(this.f221222e, tkuVar.f221222e) && as91.m27074b(this.f221223f, tkuVar.f221223f) && as91.m27074b(this.f221224g, tkuVar.f221224g);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f221224g) + ms2.m62682g(ms2.m62682g(ms2.m62682g(ms2.m62682g(ms2.m62682g(as91.m27075c(this.f221218a) * 31, this.f221219b, 31), this.f221220c, 31), this.f221221d, 31), this.f221222e, 31), this.f221223f, 31);
    }
}
