package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n3u0 {

    /* JADX INFO: renamed from: a */
    public final long f150128a;

    /* JADX INFO: renamed from: b */
    public final long f150129b;

    /* JADX INFO: renamed from: c */
    public final long f150130c;

    /* JADX INFO: renamed from: d */
    public final long f150131d;

    public n3u0(long j, long j2, long j3, long j4) {
        this.f150128a = j;
        this.f150129b = j2;
        this.f150130c = j3;
        this.f150131d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final long m63647a() {
        return this.f150128a;
    }

    /* JADX INFO: renamed from: b */
    public final long m63648b() {
        return this.f150129b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3u0)) {
            return false;
        }
        n3u0 n3u0Var = (n3u0) obj;
        long j = n3u0Var.f150128a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f150128a, j) && as91.m27074b(this.f150129b, n3u0Var.f150129b) && as91.m27074b(this.f150130c, n3u0Var.f150130c) && as91.m27074b(this.f150131d, n3u0Var.f150131d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f150131d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f150128a) * 31, this.f150129b, 31), this.f150130c, 31);
    }
}
