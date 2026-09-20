package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q0c {

    /* JADX INFO: renamed from: a */
    public final long f183949a;

    /* JADX INFO: renamed from: b */
    public final long f183950b;

    /* JADX INFO: renamed from: c */
    public final long f183951c;

    /* JADX INFO: renamed from: d */
    public final long f183952d;

    public q0c(long j, long j2, long j3, long j4) {
        this.f183949a = j;
        this.f183950b = j2;
        this.f183951c = j3;
        this.f183952d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final q0c m71810a(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.f183949a;
        }
        return new q0c(j, j2 != 16 ? j2 : this.f183950b, j3 != 16 ? j3 : this.f183951c, j4 != 16 ? j4 : this.f183952d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q0c)) {
            return false;
        }
        q0c q0cVar = (q0c) obj;
        long j = q0cVar.f183949a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f183949a, j) && as91.m27074b(this.f183950b, q0cVar.f183950b) && as91.m27074b(this.f183951c, q0cVar.f183951c) && as91.m27074b(this.f183952d, q0cVar.f183952d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f183952d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f183949a) * 31, this.f183950b, 31), this.f183951c, 31);
    }
}
