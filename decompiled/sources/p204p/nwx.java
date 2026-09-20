package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nwx implements pwx {

    /* JADX INFO: renamed from: a */
    public final jdj f159298a;

    /* JADX INFO: renamed from: b */
    public final wdj f159299b;

    public nwx(jdj jdjVar, wdj wdjVar) {
        this.f159298a = jdjVar;
        this.f159299b = wdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwx)) {
            return false;
        }
        nwx nwxVar = (nwx) obj;
        return wj50.m88271j(this.f159298a, nwxVar.f159298a) && wj50.m88271j(this.f159299b, nwxVar.f159299b);
    }

    public final int hashCode() {
        return this.f159299b.hashCode() + (this.f159298a.hashCode() * 31);
    }
}
