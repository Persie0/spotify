package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ifr {

    /* JADX INFO: renamed from: a */
    public final efr f101809a;

    /* JADX INFO: renamed from: b */
    public final gfr f101810b;

    /* JADX INFO: renamed from: c */
    public final ffr f101811c;

    /* JADX INFO: renamed from: d */
    public final hfr f101812d;

    public ifr(efr efrVar, gfr gfrVar, ffr ffrVar, hfr hfrVar) {
        this.f101809a = efrVar;
        this.f101810b = gfrVar;
        this.f101811c = ffrVar;
        this.f101812d = hfrVar;
    }

    /* JADX INFO: renamed from: a */
    public static ifr m50444a(ifr ifrVar, efr efrVar, gfr gfrVar, ffr ffrVar, int i) {
        if ((i & 1) != 0) {
            efrVar = ifrVar.f101809a;
        }
        if ((i & 2) != 0) {
            gfrVar = ifrVar.f101810b;
        }
        if ((i & 4) != 0) {
            ffrVar = ifrVar.f101811c;
        }
        hfr hfrVar = ifrVar.f101812d;
        ifrVar.getClass();
        return new ifr(efrVar, gfrVar, ffrVar, hfrVar);
    }

    /* JADX INFO: renamed from: b */
    public final efr m50445b() {
        return this.f101809a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifr)) {
            return false;
        }
        ifr ifrVar = (ifr) obj;
        return wj50.m88271j(this.f101809a, ifrVar.f101809a) && wj50.m88271j(this.f101810b, ifrVar.f101810b) && wj50.m88271j(this.f101811c, ifrVar.f101811c) && wj50.m88271j(this.f101812d, ifrVar.f101812d);
    }

    public final int hashCode() {
        return this.f101812d.hashCode() + ((this.f101811c.hashCode() + ((this.f101810b.hashCode() + (this.f101809a.f59095a.hashCode() * 31)) * 31)) * 31);
    }
}
