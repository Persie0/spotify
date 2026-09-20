package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dgr {

    /* JADX INFO: renamed from: a */
    public final double f48884a;

    /* JADX INFO: renamed from: b */
    public final api f48885b;

    public dgr(double d, api apiVar) {
        this.f48884a = d;
        this.f48885b = apiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgr)) {
            return false;
        }
        dgr dgrVar = (dgr) obj;
        return Double.compare(this.f48884a, dgrVar.f48884a) == 0 && wj50.m88271j(this.f48885b, dgrVar.f48885b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f48884a) * 31;
        api apiVar = this.f48885b;
        return iHashCode + (apiVar == null ? 0 : apiVar.hashCode());
    }
}
