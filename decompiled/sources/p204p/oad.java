package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oad {

    /* JADX INFO: renamed from: a */
    public final qad f163310a;

    /* JADX INFO: renamed from: b */
    public final o8m f163311b;

    public oad(qad qadVar, o8m o8mVar) {
        this.f163310a = qadVar;
        this.f163311b = o8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oad)) {
            return false;
        }
        oad oadVar = (oad) obj;
        return wj50.m88271j(this.f163310a, oadVar.f163310a) && wj50.m88271j(this.f163311b, oadVar.f163311b);
    }

    public final int hashCode() {
        int iHashCode = this.f163310a.hashCode() * 31;
        o8m o8mVar = this.f163311b;
        return iHashCode + (o8mVar == null ? 0 : o8mVar.hashCode());
    }
}
