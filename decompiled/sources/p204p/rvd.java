package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rvd {

    /* JADX INFO: renamed from: a */
    public final long f203064a;

    /* JADX INFO: renamed from: b */
    public final long f203065b;

    /* JADX INFO: renamed from: c */
    public final long f203066c;

    /* JADX INFO: renamed from: d */
    public final long f203067d;

    public rvd(long j, long j2, long j3, long j4) {
        this.f203064a = j;
        this.f203065b = j2;
        this.f203066c = j3;
        this.f203067d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvd)) {
            return false;
        }
        rvd rvdVar = (rvd) obj;
        long j = rvdVar.f203064a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f203064a, j) && as91.m27074b(this.f203065b, rvdVar.f203065b) && as91.m27074b(this.f203066c, rvdVar.f203066c) && as91.m27074b(this.f203067d, rvdVar.f203067d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f203067d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f203064a) * 31, this.f203065b, 31), this.f203066c, 31);
    }
}
