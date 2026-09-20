package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class az11 {

    /* JADX INFO: renamed from: a */
    public final dut f21396a;

    /* JADX INFO: renamed from: b */
    public final Object f21397b;

    public az11(Object obj, dut dutVar) {
        this.f21396a = dutVar;
        this.f21397b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az11)) {
            return false;
        }
        az11 az11Var = (az11) obj;
        return wj50.m88271j(this.f21396a, az11Var.f21396a) && this.f21397b.equals(az11Var.f21397b);
    }

    public final int hashCode() {
        return edb.m38547C(1) + dq60.m36604d(this.f21396a.hashCode() * 31, 31, this.f21397b);
    }
}
