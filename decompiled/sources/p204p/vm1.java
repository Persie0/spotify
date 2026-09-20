package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final boolean f242655a;

    /* JADX INFO: renamed from: b */
    public final d850 f242656b;

    /* JADX INFO: renamed from: c */
    public final String f242657c;

    public vm1(int i, String str, d850 d850Var) {
        boolean z = (i & 1) == 0;
        d850Var = (i & 2) != 0 ? null : d850Var;
        str = (i & 4) != 0 ? null : str;
        this.f242655a = z;
        this.f242656b = d850Var;
        this.f242657c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm1)) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        return this.f242655a == vm1Var.f242655a && wj50.m88271j(this.f242656b, vm1Var.f242656b) && wj50.m88271j(this.f242657c, vm1Var.f242657c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f242655a) * 31;
        d850 d850Var = this.f242656b;
        int iHashCode2 = (iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
        String str = this.f242657c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
