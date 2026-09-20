package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class izl0 {

    /* JADX INFO: renamed from: a */
    public final String f107255a;

    /* JADX INFO: renamed from: b */
    public final int f107256b;

    /* JADX INFO: renamed from: c */
    public final ieu f107257c;

    /* JADX INFO: renamed from: d */
    public final occ1 f107258d;

    /* JADX INFO: renamed from: e */
    public final dne f107259e;

    public izl0(String str, int i, ieu ieuVar, occ1 occ1Var, dne dneVar, int i2) {
        i = (i2 & 2) != 0 ? 1 : i;
        occ1Var = (i2 & 8) != 0 ? null : occ1Var;
        dneVar = (i2 & 16) != 0 ? null : dneVar;
        this.f107255a = str;
        this.f107256b = i;
        this.f107257c = ieuVar;
        this.f107258d = occ1Var;
        this.f107259e = dneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izl0)) {
            return false;
        }
        izl0 izl0Var = (izl0) obj;
        return wj50.m88271j(this.f107255a, izl0Var.f107255a) && this.f107256b == izl0Var.f107256b && wj50.m88271j(this.f107257c, izl0Var.f107257c) && wj50.m88271j(this.f107258d, izl0Var.f107258d) && wj50.m88271j(this.f107259e, izl0Var.f107259e);
    }

    public final int hashCode() {
        int iHashCode = (this.f107257c.hashCode() + f710.m40938f(this.f107256b, this.f107255a.hashCode() * 31, 31)) * 31;
        occ1 occ1Var = this.f107258d;
        int iHashCode2 = (iHashCode + (occ1Var == null ? 0 : occ1Var.hashCode())) * 31;
        dne dneVar = this.f107259e;
        return iHashCode2 + (dneVar != null ? dneVar.hashCode() : 0);
    }
}
