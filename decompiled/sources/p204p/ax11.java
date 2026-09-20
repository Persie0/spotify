package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ax11 {

    /* JADX INFO: renamed from: a */
    public final dut f20746a;

    /* JADX INFO: renamed from: b */
    public final Object f20747b;

    public ax11(Object obj, dut dutVar) {
        this.f20746a = dutVar;
        this.f20747b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax11)) {
            return false;
        }
        ax11 ax11Var = (ax11) obj;
        return wj50.m88271j(this.f20746a, ax11Var.f20746a) && wj50.m88271j(this.f20747b, ax11Var.f20747b);
    }

    public final int hashCode() {
        int iHashCode = this.f20746a.hashCode() * 31;
        Object obj = this.f20747b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
