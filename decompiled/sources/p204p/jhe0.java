package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jhe0 {

    /* JADX INFO: renamed from: a */
    public final long f112423a;

    /* JADX INFO: renamed from: b */
    public final long f112424b;

    /* JADX INFO: renamed from: c */
    public final long f112425c;

    /* JADX INFO: renamed from: d */
    public final long f112426d;

    /* JADX INFO: renamed from: e */
    public final long f112427e;

    /* JADX INFO: renamed from: f */
    public final long f112428f;

    public jhe0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f112423a = j;
        this.f112424b = j2;
        this.f112425c = j3;
        this.f112426d = j4;
        this.f112427e = j5;
        this.f112428f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jhe0)) {
            return false;
        }
        jhe0 jhe0Var = (jhe0) obj;
        long j = jhe0Var.f112423a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f112423a, j) && as91.m27074b(this.f112424b, jhe0Var.f112424b) && as91.m27074b(this.f112425c, jhe0Var.f112425c) && as91.m27074b(this.f112426d, jhe0Var.f112426d) && as91.m27074b(this.f112427e, jhe0Var.f112427e) && as91.m27074b(this.f112428f, jhe0Var.f112428f);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f112428f) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f112423a) * 31, this.f112424b, 31), this.f112425c, 31), this.f112426d, 31), this.f112427e, 31);
    }
}
