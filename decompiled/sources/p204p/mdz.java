package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mdz extends vdz {

    /* JADX INFO: renamed from: a */
    public final xcz f142537a;

    public mdz(xcz xczVar) {
        this.f142537a = xczVar;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f142537a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdz) && wj50.m88271j(this.f142537a, ((mdz) obj).f142537a);
    }

    public final int hashCode() {
        return this.f142537a.hashCode();
    }
}
