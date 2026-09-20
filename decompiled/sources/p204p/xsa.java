package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xsa {

    /* JADX INFO: renamed from: a */
    public final long f265547a;

    /* JADX INFO: renamed from: b */
    public final long f265548b;

    /* JADX INFO: renamed from: c */
    public final long f265549c;

    /* JADX INFO: renamed from: d */
    public final long f265550d;

    public xsa(long j, long j2, long j3, long j4) {
        this.f265547a = j;
        this.f265548b = j2;
        this.f265549c = j3;
        this.f265550d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xsa)) {
            return false;
        }
        xsa xsaVar = (xsa) obj;
        long j = xsaVar.f265547a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f265547a, j) && as91.m27074b(this.f265548b, xsaVar.f265548b) && as91.m27074b(this.f265549c, xsaVar.f265549c) && as91.m27074b(this.f265550d, xsaVar.f265550d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f265550d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f265547a) * 31, this.f265548b, 31), this.f265549c, 31);
    }
}
