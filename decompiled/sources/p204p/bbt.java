package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bbt {

    /* JADX INFO: renamed from: a */
    public final rxt f25654a;

    /* JADX INFO: renamed from: b */
    public final Object f25655b;

    public bbt(rxt rxtVar, Object obj) {
        this.f25654a = rxtVar;
        this.f25655b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbt)) {
            return false;
        }
        bbt bbtVar = (bbt) obj;
        return this.f25654a.equals(bbtVar.f25654a) && this.f25655b.equals(bbtVar.f25655b);
    }

    public final int hashCode() {
        return this.f25655b.hashCode() + (this.f25654a.hashCode() * 31);
    }
}
