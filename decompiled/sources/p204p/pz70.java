package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pz70 {

    /* JADX INFO: renamed from: a */
    public final oz70 f183625a;

    /* JADX INFO: renamed from: b */
    public final boolean f183626b;

    public pz70(oz70 oz70Var, boolean z) {
        this.f183625a = oz70Var;
        this.f183626b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz70)) {
            return false;
        }
        pz70 pz70Var = (pz70) obj;
        return wj50.m88271j(this.f183625a, pz70Var.f183625a) && this.f183626b == pz70Var.f183626b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183626b) + (this.f183625a.hashCode() * 31);
    }
}
