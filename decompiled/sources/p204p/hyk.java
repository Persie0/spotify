package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hyk implements myk {

    /* JADX INFO: renamed from: a */
    public final mkr f96599a;

    public hyk(mkr mkrVar) {
        this.f96599a = mkrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyk) && this.f96599a == ((hyk) obj).f96599a;
    }

    public final int hashCode() {
        return this.f96599a.hashCode();
    }
}
