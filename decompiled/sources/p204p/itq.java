package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class itq {

    /* JADX INFO: renamed from: a */
    public final wg01 f105670a;

    /* JADX INFO: renamed from: b */
    public final wg01 f105671b;

    public itq(wg01 wg01Var, wg01 wg01Var2) {
        this.f105670a = wg01Var;
        this.f105671b = wg01Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itq)) {
            return false;
        }
        itq itqVar = (itq) obj;
        return wj50.m88271j(this.f105670a, itqVar.f105670a) && wj50.m88271j(this.f105671b, itqVar.f105671b);
    }

    public final int hashCode() {
        return this.f105671b.hashCode() + (this.f105670a.hashCode() * 31);
    }
}
