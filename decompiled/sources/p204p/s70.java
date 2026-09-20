package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s70 implements t70 {

    /* JADX INFO: renamed from: a */
    public final fyf f206248a;

    public s70(fyf fyfVar) {
        this.f206248a = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s70) && this.f206248a.equals(((s70) obj).f206248a);
    }

    @Override // p204p.t70
    public final String getKey() {
        return "smart_reorder";
    }

    public final int hashCode() {
        return this.f206248a.hashCode() - 667300837;
    }
}
