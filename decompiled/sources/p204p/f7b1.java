package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f66637a;

    /* JADX INFO: renamed from: b */
    public final d850 f66638b;

    public f7b1(String str, d850 d850Var) {
        this.f66637a = str;
        this.f66638b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7b1)) {
            return false;
        }
        f7b1 f7b1Var = (f7b1) obj;
        return wj50.m88271j(this.f66637a, f7b1Var.f66637a) && wj50.m88271j(this.f66638b, f7b1Var.f66638b);
    }

    public final int hashCode() {
        int iHashCode = this.f66637a.hashCode() * 31;
        d850 d850Var = this.f66638b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
