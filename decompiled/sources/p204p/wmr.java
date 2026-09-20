package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wmr extends pnr {

    /* JADX INFO: renamed from: a */
    public final ppr f252965a;

    /* JADX INFO: renamed from: b */
    public final String f252966b;

    /* JADX INFO: renamed from: c */
    public final boolean f252967c;

    public wmr(ppr pprVar, String str, boolean z) {
        this.f252965a = pprVar;
        this.f252966b = str;
        this.f252967c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmr)) {
            return false;
        }
        wmr wmrVar = (wmr) obj;
        return wj50.m88271j(this.f252965a, wmrVar.f252965a) && wj50.m88271j(this.f252966b, wmrVar.f252966b) && this.f252967c == wmrVar.f252967c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252967c) + s571.m77243b(this.f252965a.hashCode() * 31, 31, this.f252966b);
    }
}
