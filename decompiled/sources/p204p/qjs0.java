package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f189300a;

    /* JADX INFO: renamed from: b */
    public final d850 f189301b;

    public qjs0(String str, d850 d850Var) {
        this.f189300a = str;
        this.f189301b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjs0)) {
            return false;
        }
        qjs0 qjs0Var = (qjs0) obj;
        return wj50.m88271j(this.f189300a, qjs0Var.f189300a) && wj50.m88271j(this.f189301b, qjs0Var.f189301b);
    }

    public final int hashCode() {
        int iHashCode = this.f189300a.hashCode() * 31;
        d850 d850Var = this.f189301b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
