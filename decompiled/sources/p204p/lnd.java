package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lnd {

    /* JADX INFO: renamed from: a */
    public final mnd f135144a;

    /* JADX INFO: renamed from: b */
    public final und f135145b;

    /* JADX INFO: renamed from: c */
    public final pr01 f135146c;

    public lnd(mnd mndVar, und undVar, pr01 pr01Var) {
        this.f135144a = mndVar;
        this.f135145b = undVar;
        this.f135146c = pr01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd)) {
            return false;
        }
        lnd lndVar = (lnd) obj;
        return wj50.m88271j(this.f135144a, lndVar.f135144a) && wj50.m88271j(this.f135145b, lndVar.f135145b) && wj50.m88271j(this.f135146c, lndVar.f135146c);
    }

    public final int hashCode() {
        int iHashCode = this.f135144a.hashCode() * 31;
        und undVar = this.f135145b;
        return this.f135146c.hashCode() + ((iHashCode + (undVar == null ? 0 : undVar.f232150j.hashCode())) * 31);
    }
}
