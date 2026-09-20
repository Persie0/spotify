package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z3l0 {

    /* JADX INFO: renamed from: a */
    public final String f278978a;

    /* JADX INFO: renamed from: b */
    public final String f278979b;

    public z3l0(String str, String str2) {
        this.f278978a = str;
        this.f278979b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3l0)) {
            return false;
        }
        z3l0 z3l0Var = (z3l0) obj;
        return wj50.m88271j(this.f278978a, z3l0Var.f278978a) && wj50.m88271j(this.f278979b, z3l0Var.f278979b);
    }

    public final int hashCode() {
        return this.f278979b.hashCode() + (this.f278978a.hashCode() * 31);
    }
}
