package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class exc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f63739a;

    /* JADX INFO: renamed from: b */
    public final d850 f63740b;

    public exc0(String str, d850 d850Var) {
        this.f63739a = str;
        this.f63740b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exc0)) {
            return false;
        }
        exc0 exc0Var = (exc0) obj;
        return wj50.m88271j(this.f63739a, exc0Var.f63739a) && wj50.m88271j(this.f63740b, exc0Var.f63740b);
    }

    public final int hashCode() {
        int iHashCode = this.f63739a.hashCode() * 31;
        d850 d850Var = this.f63740b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
