package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bcm {

    /* JADX INFO: renamed from: c */
    public static final bcm f25912c = new bcm(null, null);

    /* JADX INFO: renamed from: a */
    public final xbm f25913a;

    /* JADX INFO: renamed from: b */
    public final xbm f25914b;

    public bcm(xbm xbmVar, xbm xbmVar2) {
        this.f25913a = xbmVar;
        this.f25914b = xbmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcm)) {
            return false;
        }
        bcm bcmVar = (bcm) obj;
        return wj50.m88271j(this.f25913a, bcmVar.f25913a) && wj50.m88271j(this.f25914b, bcmVar.f25914b);
    }

    public final int hashCode() {
        xbm xbmVar = this.f25913a;
        int iHashCode = (xbmVar == null ? 0 : xbmVar.hashCode()) * 31;
        xbm xbmVar2 = this.f25914b;
        return iHashCode + (xbmVar2 != null ? xbmVar2.hashCode() : 0);
    }
}
