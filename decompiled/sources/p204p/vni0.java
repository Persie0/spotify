package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vni0 {

    /* JADX INFO: renamed from: a */
    public final v140 f243146a;

    /* JADX INFO: renamed from: b */
    public final daj f243147b;

    /* JADX INFO: renamed from: c */
    public final erc1 f243148c;

    public vni0(daj dajVar, v140 v140Var, erc1 erc1Var) {
        this.f243146a = v140Var;
        this.f243147b = dajVar;
        this.f243148c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vni0)) {
            return false;
        }
        vni0 vni0Var = (vni0) obj;
        return wj50.m88271j(this.f243146a, vni0Var.f243146a) && wj50.m88271j(this.f243147b, vni0Var.f243147b) && wj50.m88271j(this.f243148c, vni0Var.f243148c);
    }

    public final int hashCode() {
        return this.f243148c.hashCode() + ((this.f243147b.hashCode() + (this.f243146a.hashCode() * 31)) * 31);
    }
}
