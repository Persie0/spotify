package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fcc extends jkc0 {

    /* JADX INFO: renamed from: e */
    public final egc f68052e;

    /* JADX INFO: renamed from: f */
    public final int f68053f;

    public fcc(egc egcVar, int i) {
        this.f68052e = egcVar;
        this.f68053f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcc)) {
            return false;
        }
        fcc fccVar = (fcc) obj;
        return wj50.m88271j(this.f68052e, fccVar.f68052e) && this.f68053f == fccVar.f68053f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68053f) + (this.f68052e.hashCode() * 31);
    }
}
