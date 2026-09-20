package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pk20 {

    /* JADX INFO: renamed from: a */
    public final dut f178371a;

    /* JADX INFO: renamed from: b */
    public final Object f178372b;

    public pk20(Object obj, dut dutVar) {
        this.f178371a = dutVar;
        this.f178372b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk20)) {
            return false;
        }
        pk20 pk20Var = (pk20) obj;
        return wj50.m88271j(this.f178371a, pk20Var.f178371a) && wj50.m88271j(this.f178372b, pk20Var.f178372b);
    }

    public final int hashCode() {
        int iHashCode = this.f178371a.hashCode() * 31;
        Object obj = this.f178372b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
