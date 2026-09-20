package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fr40 {

    /* JADX INFO: renamed from: a */
    public final dut f72352a;

    /* JADX INFO: renamed from: b */
    public final Object f72353b;

    public fr40(Object obj, dut dutVar) {
        this.f72352a = dutVar;
        this.f72353b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr40)) {
            return false;
        }
        fr40 fr40Var = (fr40) obj;
        return wj50.m88271j(this.f72352a, fr40Var.f72352a) && wj50.m88271j(this.f72353b, fr40Var.f72353b);
    }

    public final int hashCode() {
        int iHashCode = this.f72352a.hashCode() * 31;
        Object obj = this.f72353b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
