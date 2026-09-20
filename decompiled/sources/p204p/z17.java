package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z17 {

    /* JADX INFO: renamed from: a */
    public final String f278247a;

    /* JADX INFO: renamed from: b */
    public final y17 f278248b;

    /* JADX INFO: renamed from: c */
    public final mto0 f278249c;

    public z17(String str, y17 y17Var, mto0 mto0Var) {
        this.f278247a = str;
        this.f278248b = y17Var;
        this.f278249c = mto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z17)) {
            return false;
        }
        z17 z17Var = (z17) obj;
        return wj50.m88271j(this.f278247a, z17Var.f278247a) && wj50.m88271j(this.f278248b, z17Var.f278248b) && this.f278249c == z17Var.f278249c;
    }

    public final int hashCode() {
        String str = this.f278247a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        y17 y17Var = this.f278248b;
        int iHashCode2 = (iHashCode + (y17Var == null ? 0 : y17Var.hashCode())) * 31;
        mto0 mto0Var = this.f278249c;
        return iHashCode2 + (mto0Var != null ? mto0Var.hashCode() : 0);
    }

    public /* synthetic */ z17(String str, mto0 mto0Var, int i) {
        this(str, (y17) null, (i & 4) != 0 ? null : mto0Var);
    }
}
