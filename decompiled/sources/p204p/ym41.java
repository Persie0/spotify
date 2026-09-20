package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ym41 {

    /* JADX INFO: renamed from: a */
    public final Boolean f274156a;

    /* JADX INFO: renamed from: b */
    public final pob f274157b;

    /* JADX INFO: renamed from: c */
    public final el8 f274158c;

    public ym41(Boolean bool, pob pobVar, el8 el8Var) {
        this.f274156a = bool;
        this.f274157b = pobVar;
        this.f274158c = el8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym41)) {
            return false;
        }
        ym41 ym41Var = (ym41) obj;
        return wj50.m88271j(this.f274156a, ym41Var.f274156a) && wj50.m88271j(this.f274157b, ym41Var.f274157b) && wj50.m88271j(this.f274158c, ym41Var.f274158c);
    }

    public final int hashCode() {
        Boolean bool = this.f274156a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        pob pobVar = this.f274157b;
        int iHashCode2 = (iHashCode + (pobVar == null ? 0 : pobVar.hashCode())) * 31;
        el8 el8Var = this.f274158c;
        return iHashCode2 + (el8Var != null ? el8Var.hashCode() : 0);
    }
}
