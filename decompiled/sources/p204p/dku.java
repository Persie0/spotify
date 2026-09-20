package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dku {

    /* JADX INFO: renamed from: a */
    public final long f50024a;

    /* JADX INFO: renamed from: b */
    public final long f50025b;

    public dku(long j, long j2) {
        this.f50024a = j;
        this.f50025b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dku)) {
            return false;
        }
        dku dkuVar = (dku) obj;
        long j = dkuVar.f50024a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f50024a, j) && as91.m27074b(this.f50025b, dkuVar.f50025b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f50025b) + (as91.m27075c(this.f50024a) * 31);
    }
}
