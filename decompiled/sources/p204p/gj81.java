package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gj81 {

    /* JADX INFO: renamed from: a */
    public final uo31 f80396a;

    /* JADX INFO: renamed from: b */
    public final daj f80397b;

    /* JADX INFO: renamed from: c */
    public final w541 f80398c;

    /* JADX INFO: renamed from: d */
    public final zs6 f80399d;

    public gj81(uo31 uo31Var, daj dajVar, w541 w541Var, zs6 zs6Var) {
        this.f80396a = uo31Var;
        this.f80397b = dajVar;
        this.f80398c = w541Var;
        this.f80399d = zs6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj81)) {
            return false;
        }
        gj81 gj81Var = (gj81) obj;
        return wj50.m88271j(this.f80396a, gj81Var.f80396a) && wj50.m88271j(this.f80397b, gj81Var.f80397b) && wj50.m88271j(this.f80398c, gj81Var.f80398c) && wj50.m88271j(this.f80399d, gj81Var.f80399d);
    }

    public final int hashCode() {
        uo31 uo31Var = this.f80396a;
        int iHashCode = (uo31Var == null ? 0 : Boolean.hashCode(uo31Var.f232323a)) * 31;
        daj dajVar = this.f80397b;
        int iHashCode2 = (iHashCode + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        w541 w541Var = this.f80398c;
        int iHashCode3 = (iHashCode2 + (w541Var == null ? 0 : Boolean.hashCode(w541Var.f247994a))) * 31;
        zs6 zs6Var = this.f80399d;
        return iHashCode3 + (zs6Var != null ? zs6Var.hashCode() : 0);
    }
}
