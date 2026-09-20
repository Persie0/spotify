package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ety0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f62820a;

    /* JADX INFO: renamed from: b */
    public final d850 f62821b;

    public ety0(String str, d850 d850Var) {
        this.f62820a = str;
        this.f62821b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ety0)) {
            return false;
        }
        ety0 ety0Var = (ety0) obj;
        return wj50.m88271j(this.f62820a, ety0Var.f62820a) && wj50.m88271j(this.f62821b, ety0Var.f62821b);
    }

    public final int hashCode() {
        int iHashCode = this.f62820a.hashCode() * 31;
        d850 d850Var = this.f62821b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
