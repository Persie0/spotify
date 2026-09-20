package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ncc extends scc {

    /* JADX INFO: renamed from: a */
    public final egc f152489a;

    /* JADX INFO: renamed from: b */
    public final int f152490b;

    public ncc(egc egcVar, int i) {
        this.f152489a = egcVar;
        this.f152490b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncc)) {
            return false;
        }
        ncc nccVar = (ncc) obj;
        return wj50.m88271j(this.f152489a, nccVar.f152489a) && this.f152490b == nccVar.f152490b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152490b) + (this.f152489a.hashCode() * 31);
    }
}
