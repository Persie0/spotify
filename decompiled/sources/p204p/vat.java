package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vat {

    /* JADX INFO: renamed from: a */
    public final List f239325a;

    /* JADX INFO: renamed from: b */
    public final v140 f239326b;

    /* JADX INFO: renamed from: c */
    public final erc1 f239327c;

    public vat(List list, v140 v140Var, erc1 erc1Var) {
        this.f239325a = list;
        this.f239326b = v140Var;
        this.f239327c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vat)) {
            return false;
        }
        vat vatVar = (vat) obj;
        return wj50.m88271j(this.f239325a, vatVar.f239325a) && wj50.m88271j(this.f239326b, vatVar.f239326b) && wj50.m88271j(this.f239327c, vatVar.f239327c);
    }

    public final int hashCode() {
        int iHashCode = this.f239325a.hashCode() * 31;
        v140 v140Var = this.f239326b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f239327c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
