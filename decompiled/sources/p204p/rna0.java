package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rna0 extends tna0 {

    /* JADX INFO: renamed from: a */
    public final String f200857a;

    /* JADX INFO: renamed from: b */
    public final rma0 f200858b;

    /* JADX INFO: renamed from: c */
    public final rma0 f200859c;

    /* JADX INFO: renamed from: d */
    public final boolean f200860d;

    public rna0(String str, rma0 rma0Var, rma0 rma0Var2, boolean z) {
        this.f200857a = str;
        this.f200858b = rma0Var;
        this.f200859c = rma0Var2;
        this.f200860d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rna0)) {
            return false;
        }
        rna0 rna0Var = (rna0) obj;
        return wj50.m88271j(this.f200857a, rna0Var.f200857a) && wj50.m88271j(this.f200858b, rna0Var.f200858b) && wj50.m88271j(this.f200859c, rna0Var.f200859c) && this.f200860d == rna0Var.f200860d;
    }

    public final int hashCode() {
        int iHashCode = this.f200857a.hashCode() * 31;
        rma0 rma0Var = this.f200858b;
        int iHashCode2 = (iHashCode + (rma0Var == null ? 0 : rma0Var.hashCode())) * 31;
        rma0 rma0Var2 = this.f200859c;
        return Boolean.hashCode(this.f200860d) + ((iHashCode2 + (rma0Var2 != null ? rma0Var2.hashCode() : 0)) * 31);
    }
}
