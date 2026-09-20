package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hdb1 {

    /* JADX INFO: renamed from: a */
    public final jcl0 f90107a;

    /* JADX INFO: renamed from: b */
    public final wil f90108b;

    public hdb1(jcl0 jcl0Var, wil wilVar) {
        this.f90107a = jcl0Var;
        this.f90108b = wilVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdb1)) {
            return false;
        }
        hdb1 hdb1Var = (hdb1) obj;
        return wj50.m88271j(this.f90107a, hdb1Var.f90107a) && wj50.m88271j(this.f90108b, hdb1Var.f90108b);
    }

    public final int hashCode() {
        jcl0 jcl0Var = this.f90107a;
        int iHashCode = (jcl0Var == null ? 0 : jcl0Var.hashCode()) * 31;
        wil wilVar = this.f90108b;
        return iHashCode + (wilVar != null ? wilVar.f251679a.hashCode() : 0);
    }
}
