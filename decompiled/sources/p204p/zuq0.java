package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zuq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f286502a;

    /* JADX INFO: renamed from: b */
    public final d850 f286503b;

    public zuq0(String str, d850 d850Var) {
        this.f286502a = str;
        this.f286503b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuq0)) {
            return false;
        }
        zuq0 zuq0Var = (zuq0) obj;
        return wj50.m88271j(this.f286502a, zuq0Var.f286502a) && wj50.m88271j(this.f286503b, zuq0Var.f286503b);
    }

    public final int hashCode() {
        int iHashCode = this.f286502a.hashCode() * 31;
        d850 d850Var = this.f286503b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
