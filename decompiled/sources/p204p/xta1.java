package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xta1 {

    /* JADX INFO: renamed from: a */
    public final long f265812a;

    /* JADX INFO: renamed from: b */
    public final boolean f265813b;

    /* JADX INFO: renamed from: c */
    public final Long f265814c;

    public xta1(long j, boolean z, Long l) {
        this.f265812a = j;
        this.f265813b = z;
        this.f265814c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xta1)) {
            return false;
        }
        xta1 xta1Var = (xta1) obj;
        return this.f265812a == xta1Var.f265812a && this.f265813b == xta1Var.f265813b && wj50.m88271j(this.f265814c, xta1Var.f265814c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Long.hashCode(this.f265812a) * 31, 31, this.f265813b);
        Long l = this.f265814c;
        return iM77245d + (l == null ? 0 : l.hashCode());
    }
}
