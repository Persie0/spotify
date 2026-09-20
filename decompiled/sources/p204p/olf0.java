package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class olf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f166836a;

    /* JADX INFO: renamed from: b */
    public final d850 f166837b;

    public olf0(Boolean bool, d850 d850Var) {
        this.f166836a = bool;
        this.f166837b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olf0)) {
            return false;
        }
        olf0 olf0Var = (olf0) obj;
        return wj50.m88271j(this.f166836a, olf0Var.f166836a) && wj50.m88271j(this.f166837b, olf0Var.f166837b);
    }

    public final int hashCode() {
        Boolean bool = this.f166836a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        d850 d850Var = this.f166837b;
        return iHashCode + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
