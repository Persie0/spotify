package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bu21 {

    /* JADX INFO: renamed from: a */
    public final dut f31003a;

    /* JADX INFO: renamed from: b */
    public final th00 f31004b;

    /* JADX INFO: renamed from: c */
    public final vh00 f31005c;

    public bu21(dut dutVar, th00 th00Var, vh00 vh00Var) {
        this.f31003a = dutVar;
        this.f31004b = th00Var;
        this.f31005c = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu21)) {
            return false;
        }
        bu21 bu21Var = (bu21) obj;
        return wj50.m88271j(this.f31003a, bu21Var.f31003a) && wj50.m88271j(this.f31004b, bu21Var.f31004b) && wj50.m88271j(this.f31005c, bu21Var.f31005c);
    }

    public final int hashCode() {
        int iHashCode = this.f31003a.hashCode() * 31;
        th00 th00Var = this.f31004b;
        int iHashCode2 = (iHashCode + (th00Var == null ? 0 : th00Var.hashCode())) * 31;
        vh00 vh00Var = this.f31005c;
        return iHashCode2 + (vh00Var != null ? vh00Var.hashCode() : 0);
    }
}
