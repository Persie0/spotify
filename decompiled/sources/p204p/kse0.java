package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kse0 {

    /* JADX INFO: renamed from: a */
    public final pte0 f125937a;

    /* JADX INFO: renamed from: b */
    public final ase0 f125938b;

    public kse0(pte0 pte0Var, ase0 ase0Var) {
        this.f125937a = pte0Var;
        this.f125938b = ase0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kse0)) {
            return false;
        }
        kse0 kse0Var = (kse0) obj;
        return wj50.m88271j(this.f125937a, kse0Var.f125937a) && wj50.m88271j(this.f125938b, kse0Var.f125938b);
    }

    public final int hashCode() {
        return this.f125938b.hashCode() + (this.f125937a.hashCode() * 31);
    }
}
