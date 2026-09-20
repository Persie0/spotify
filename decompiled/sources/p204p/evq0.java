package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class evq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f63303a;

    /* JADX INFO: renamed from: b */
    public final d850 f63304b;

    public evq0(String str, d850 d850Var) {
        this.f63303a = str;
        this.f63304b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evq0)) {
            return false;
        }
        evq0 evq0Var = (evq0) obj;
        return wj50.m88271j(this.f63303a, evq0Var.f63303a) && wj50.m88271j(this.f63304b, evq0Var.f63304b);
    }

    public final int hashCode() {
        int iHashCode = this.f63303a.hashCode() * 31;
        d850 d850Var = this.f63304b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
