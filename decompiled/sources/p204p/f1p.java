package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f1p {

    /* JADX INFO: renamed from: a */
    public final long f64941a;

    /* JADX INFO: renamed from: b */
    public final long f64942b;

    /* JADX INFO: renamed from: c */
    public final long f64943c;

    /* JADX INFO: renamed from: d */
    public final long f64944d;

    public f1p(long j, long j2, long j3, long j4) {
        this.f64941a = j;
        this.f64942b = j2;
        this.f64943c = j3;
        this.f64944d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1p.class != obj.getClass()) {
            return false;
        }
        f1p f1pVar = (f1p) obj;
        long j = f1pVar.f64941a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f64941a, j) && as91.m27074b(this.f64942b, f1pVar.f64942b) && as91.m27074b(this.f64943c, f1pVar.f64943c) && as91.m27074b(this.f64944d, f1pVar.f64944d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f64944d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f64941a) * 31, this.f64942b, 31), this.f64943c, 31);
    }
}
