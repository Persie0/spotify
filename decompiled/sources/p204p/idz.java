package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class idz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f101274a;

    /* JADX INFO: renamed from: b */
    public final gdz f101275b;

    public idz(xcz xczVar, gdz gdzVar) {
        this.f101274a = xczVar;
        this.f101275b = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f101275b;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f101274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idz)) {
            return false;
        }
        idz idzVar = (idz) obj;
        return wj50.m88271j(this.f101274a, idzVar.f101274a) && wj50.m88271j(this.f101275b, idzVar.f101275b);
    }

    public final int hashCode() {
        int iHashCode = this.f101274a.hashCode() * 31;
        gdz gdzVar = this.f101275b;
        return iHashCode + (gdzVar == null ? 0 : gdzVar.hashCode());
    }
}
