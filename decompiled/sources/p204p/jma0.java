package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jma0 extends rma0 {

    /* JADX INFO: renamed from: a */
    public final String f113804a;

    /* JADX INFO: renamed from: b */
    public final rma0 f113805b;

    /* JADX INFO: renamed from: c */
    public final rma0 f113806c;

    /* JADX INFO: renamed from: d */
    public final boolean f113807d;

    public jma0(String str, rma0 rma0Var, rma0 rma0Var2, boolean z) {
        this.f113804a = str;
        this.f113805b = rma0Var;
        this.f113806c = rma0Var2;
        this.f113807d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jma0)) {
            return false;
        }
        jma0 jma0Var = (jma0) obj;
        return wj50.m88271j(this.f113804a, jma0Var.f113804a) && wj50.m88271j(this.f113805b, jma0Var.f113805b) && wj50.m88271j(this.f113806c, jma0Var.f113806c) && this.f113807d == jma0Var.f113807d;
    }

    public final int hashCode() {
        int iHashCode = this.f113804a.hashCode() * 31;
        rma0 rma0Var = this.f113805b;
        int iHashCode2 = (iHashCode + (rma0Var == null ? 0 : rma0Var.hashCode())) * 31;
        rma0 rma0Var2 = this.f113806c;
        return Boolean.hashCode(this.f113807d) + ((iHashCode2 + (rma0Var2 != null ? rma0Var2.hashCode() : 0)) * 31);
    }
}
