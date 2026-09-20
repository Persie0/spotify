package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class snz {

    /* JADX INFO: renamed from: a */
    public final rnz f211055a;

    /* JADX INFO: renamed from: b */
    public final goz f211056b;

    public snz(rnz rnzVar, goz gozVar) {
        this.f211055a = rnzVar;
        this.f211056b = gozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snz)) {
            return false;
        }
        snz snzVar = (snz) obj;
        return wj50.m88271j(this.f211055a, snzVar.f211055a) && wj50.m88271j(this.f211056b, snzVar.f211056b);
    }

    public final int hashCode() {
        return this.f211056b.hashCode() + (this.f211055a.hashCode() * 31);
    }
}
