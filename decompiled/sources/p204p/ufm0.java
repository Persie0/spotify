package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ufm0 {

    /* JADX INFO: renamed from: a */
    public final lc01 f229840a;

    /* JADX INFO: renamed from: b */
    public final wwu f229841b;

    /* JADX INFO: renamed from: c */
    public final njg1 f229842c;

    /* JADX INFO: renamed from: d */
    public final sd01 f229843d;

    /* JADX INFO: renamed from: e */
    public final na01 f229844e;

    public ufm0(lc01 lc01Var, wwu wwuVar, njg1 njg1Var, sd01 sd01Var, na01 na01Var) {
        this.f229840a = lc01Var;
        this.f229841b = wwuVar;
        this.f229842c = njg1Var;
        this.f229843d = sd01Var;
        this.f229844e = na01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufm0)) {
            return false;
        }
        ufm0 ufm0Var = (ufm0) obj;
        return wj50.m88271j(this.f229840a, ufm0Var.f229840a) && wj50.m88271j(this.f229841b, ufm0Var.f229841b) && wj50.m88271j(this.f229842c, ufm0Var.f229842c) && wj50.m88271j(this.f229843d, ufm0Var.f229843d) && wj50.m88271j(this.f229844e, ufm0Var.f229844e);
    }

    public final int hashCode() {
        return this.f229844e.hashCode() + ((this.f229843d.hashCode() + ((this.f229842c.hashCode() + ((this.f229841b.hashCode() + (this.f229840a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
