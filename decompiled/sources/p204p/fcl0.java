package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fcl0 {

    /* JADX INFO: renamed from: a */
    public final ecl0 f68139a;

    /* JADX INFO: renamed from: b */
    public final int f68140b;

    public fcl0(ecl0 ecl0Var, int i) {
        this.f68139a = ecl0Var;
        this.f68140b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcl0)) {
            return false;
        }
        fcl0 fcl0Var = (fcl0) obj;
        return wj50.m88271j(this.f68139a, fcl0Var.f68139a) && this.f68140b == fcl0Var.f68140b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68140b) + (this.f68139a.hashCode() * 31);
    }
}
