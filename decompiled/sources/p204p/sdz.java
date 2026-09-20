package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sdz extends vdz implements hdz, edz {

    /* JADX INFO: renamed from: a */
    public final xcz f208113a;

    /* JADX INFO: renamed from: b */
    public final boolean f208114b;

    /* JADX INFO: renamed from: c */
    public final wdz f208115c;

    /* JADX INFO: renamed from: d */
    public final gdz f208116d;

    public sdz(xcz xczVar, boolean z, wdz wdzVar, gdz gdzVar) {
        this.f208113a = xczVar;
        this.f208114b = z;
        this.f208115c = wdzVar;
        this.f208116d = gdzVar;
    }

    @Override // p204p.edz
    /* JADX INFO: renamed from: a */
    public final boolean mo38622a() {
        return this.f208114b;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f208116d;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f208113a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdz)) {
            return false;
        }
        sdz sdzVar = (sdz) obj;
        return wj50.m88271j(this.f208113a, sdzVar.f208113a) && this.f208114b == sdzVar.f208114b && wj50.m88271j(this.f208115c, sdzVar.f208115c) && wj50.m88271j(this.f208116d, sdzVar.f208116d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f208113a.hashCode() * 31, 31, this.f208114b);
        wdz wdzVar = this.f208115c;
        int iHashCode = (iM77245d + (wdzVar == null ? 0 : wdzVar.hashCode())) * 31;
        gdz gdzVar = this.f208116d;
        return iHashCode + (gdzVar != null ? gdzVar.hashCode() : 0);
    }
}
