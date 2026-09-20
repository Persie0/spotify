package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eqc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f61863a;

    /* JADX INFO: renamed from: b */
    public final Object f61864b;

    public eqc1(Object obj, boolean z) {
        this.f61863a = z;
        this.f61864b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqc1)) {
            return false;
        }
        eqc1 eqc1Var = (eqc1) obj;
        return this.f61863a == eqc1Var.f61863a && wj50.m88271j(this.f61864b, eqc1Var.f61864b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f61863a) * 31;
        Object obj = this.f61864b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
