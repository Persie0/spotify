package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class x481 {

    /* JADX INFO: renamed from: a */
    public final long f258009a;

    /* JADX INFO: renamed from: b */
    public final long f258010b;

    /* JADX INFO: renamed from: c */
    public final long f258011c;

    /* JADX INFO: renamed from: d */
    public final long f258012d;

    /* JADX INFO: renamed from: e */
    public final long f258013e;

    /* JADX INFO: renamed from: f */
    public final long f258014f;

    public x481(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f258009a = j;
        this.f258010b = j2;
        this.f258011c = j3;
        this.f258012d = j4;
        this.f258013e = j5;
        this.f258014f = j6;
    }

    /* JADX INFO: renamed from: a */
    public final x481 m89839a(long j, long j2, long j3, long j4, long j5, long j6) {
        return new x481(j != 16 ? j : this.f258009a, j2 != 16 ? j2 : this.f258010b, j3 != 16 ? j3 : this.f258011c, j4 != 16 ? j4 : this.f258012d, j5 != 16 ? j5 : this.f258013e, j6 != 16 ? j6 : this.f258014f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x481)) {
            return false;
        }
        x481 x481Var = (x481) obj;
        long j = x481Var.f258009a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f258009a, j) && as91.m27074b(this.f258010b, x481Var.f258010b) && as91.m27074b(this.f258011c, x481Var.f258011c) && as91.m27074b(this.f258012d, x481Var.f258012d) && as91.m27074b(this.f258013e, x481Var.f258013e) && as91.m27074b(this.f258014f, x481Var.f258014f);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f258014f) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f258009a) * 31, this.f258010b, 31), this.f258011c, 31), this.f258012d, 31), this.f258013e, 31);
    }
}
