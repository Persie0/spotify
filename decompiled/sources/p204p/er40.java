package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class er40 {

    /* JADX INFO: renamed from: a */
    public final dut f62016a;

    /* JADX INFO: renamed from: b */
    public final Object f62017b;

    public er40(Object obj, dut dutVar) {
        this.f62016a = dutVar;
        this.f62017b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er40)) {
            return false;
        }
        er40 er40Var = (er40) obj;
        return wj50.m88271j(this.f62016a, er40Var.f62016a) && wj50.m88271j(this.f62017b, er40Var.f62017b);
    }

    public final int hashCode() {
        int iHashCode = this.f62016a.hashCode() * 31;
        Object obj = this.f62017b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
