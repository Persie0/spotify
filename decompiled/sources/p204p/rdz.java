package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rdz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f198230a;

    /* JADX INFO: renamed from: b */
    public final gdz f198231b;

    public rdz(xcz xczVar, gdz gdzVar) {
        this.f198230a = xczVar;
        this.f198231b = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f198231b;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f198230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdz)) {
            return false;
        }
        rdz rdzVar = (rdz) obj;
        return wj50.m88271j(this.f198230a, rdzVar.f198230a) && wj50.m88271j(this.f198231b, rdzVar.f198231b);
    }

    public final int hashCode() {
        int iHashCode = this.f198230a.hashCode() * 31;
        gdz gdzVar = this.f198231b;
        return iHashCode + (gdzVar == null ? 0 : gdzVar.hashCode());
    }
}
