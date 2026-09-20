package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mg61 {

    /* JADX INFO: renamed from: a */
    public final v140 f143353a;

    /* JADX INFO: renamed from: b */
    public final erc1 f143354b;

    /* JADX INFO: renamed from: c */
    public final Float f143355c;

    public mg61(v140 v140Var, erc1 erc1Var, Float f) {
        this.f143353a = v140Var;
        this.f143354b = erc1Var;
        this.f143355c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg61)) {
            return false;
        }
        mg61 mg61Var = (mg61) obj;
        return wj50.m88271j(this.f143353a, mg61Var.f143353a) && wj50.m88271j(this.f143354b, mg61Var.f143354b) && wj50.m88271j(this.f143355c, mg61Var.f143355c);
    }

    public final int hashCode() {
        v140 v140Var = this.f143353a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f143354b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        Float f = this.f143355c;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }
}
