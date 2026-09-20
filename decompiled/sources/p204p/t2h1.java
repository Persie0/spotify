package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class t2h1 extends tve {

    /* JADX INFO: renamed from: a */
    public final zhg1 f216555a;

    /* JADX INFO: renamed from: b */
    public final dcf1 f216556b;

    public t2h1(zhg1 zhg1Var, dcf1 dcf1Var) {
        this.f216555a = zhg1Var;
        this.f216556b = dcf1Var;
    }

    @Override // p204p.tve
    /* JADX INFO: renamed from: b */
    public final zhg1 mo79907b() {
        return this.f216555a;
    }

    @Override // p204p.tve
    /* JADX INFO: renamed from: c */
    public final dcf1 mo79908c() {
        return this.f216556b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tve) {
            tve tveVar = (tve) obj;
            zhg1 zhg1Var = this.f216555a;
            if (zhg1Var != null ? zhg1Var.equals(((t2h1) tveVar).f216555a) : ((t2h1) tveVar).f216555a == null) {
                dcf1 dcf1Var = this.f216556b;
                if (dcf1Var != null ? dcf1Var.equals(((t2h1) tveVar).f216556b) : ((t2h1) tveVar).f216556b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zhg1 zhg1Var = this.f216555a;
        int iHashCode = zhg1Var == null ? 0 : zhg1Var.hashCode();
        dcf1 dcf1Var = this.f216556b;
        return (dcf1Var != null ? dcf1Var.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return dq60.m36615o("CoWatchingQueue{clientQueue=", String.valueOf(this.f216555a), ", serverQueueParams=", String.valueOf(this.f216556b), "}");
    }
}
