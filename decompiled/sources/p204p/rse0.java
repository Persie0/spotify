package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rse0 {

    /* JADX INFO: renamed from: a */
    public final kse0 f202315a;

    /* JADX INFO: renamed from: b */
    public final nse0 f202316b;

    /* JADX INFO: renamed from: c */
    public final gkq f202317c;

    public rse0(kse0 kse0Var, nse0 nse0Var, gkq gkqVar) {
        this.f202315a = kse0Var;
        this.f202316b = nse0Var;
        this.f202317c = gkqVar;
    }

    /* JADX INFO: renamed from: a */
    public final kse0 m76317a() {
        return this.f202315a;
    }

    /* JADX INFO: renamed from: b */
    public final gh00 m76318b() {
        return this.f202317c;
    }

    /* JADX INFO: renamed from: c */
    public final nse0 m76319c() {
        return this.f202316b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rse0)) {
            return false;
        }
        rse0 rse0Var = (rse0) obj;
        return wj50.m88271j(this.f202315a, rse0Var.f202315a) && wj50.m88271j(this.f202316b, rse0Var.f202316b) && this.f202317c.equals(rse0Var.f202317c);
    }

    public final int hashCode() {
        return this.f202317c.hashCode() + ((this.f202316b.hashCode() + (this.f202315a.hashCode() * 31)) * 31);
    }
}
