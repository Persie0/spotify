package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ndz extends vdz implements hdz, edz {

    /* JADX INFO: renamed from: a */
    public final xcz f152871a;

    /* JADX INFO: renamed from: b */
    public final boolean f152872b;

    /* JADX INFO: renamed from: c */
    public final gdz f152873c;

    public ndz(xcz xczVar, boolean z, gdz gdzVar) {
        this.f152871a = xczVar;
        this.f152872b = z;
        this.f152873c = gdzVar;
    }

    @Override // p204p.edz
    /* JADX INFO: renamed from: a */
    public final boolean mo38622a() {
        return this.f152872b;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f152873c;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f152871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndz)) {
            return false;
        }
        ndz ndzVar = (ndz) obj;
        return wj50.m88271j(this.f152871a, ndzVar.f152871a) && this.f152872b == ndzVar.f152872b && wj50.m88271j(this.f152873c, ndzVar.f152873c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f152871a.hashCode() * 31, 31, this.f152872b);
        gdz gdzVar = this.f152873c;
        return iM77245d + (gdzVar == null ? 0 : gdzVar.hashCode());
    }
}
