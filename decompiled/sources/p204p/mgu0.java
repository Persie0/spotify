package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mgu0 implements rgu0 {

    /* JADX INFO: renamed from: a */
    public final String f143635a;

    /* JADX INFO: renamed from: b */
    public final d850 f143636b;

    public mgu0(String str, d850 d850Var) {
        this.f143635a = str;
        this.f143636b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgu0)) {
            return false;
        }
        mgu0 mgu0Var = (mgu0) obj;
        return wj50.m88271j(this.f143635a, mgu0Var.f143635a) && wj50.m88271j(this.f143636b, mgu0Var.f143636b);
    }

    public final int hashCode() {
        int iHashCode = this.f143635a.hashCode() * 31;
        d850 d850Var = this.f143636b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
