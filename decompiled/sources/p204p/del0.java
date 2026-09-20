package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class del0 {

    /* JADX INFO: renamed from: a */
    public final uk90 f48121a;

    /* JADX INFO: renamed from: b */
    public final Boolean f48122b;

    public del0(uk90 uk90Var, Boolean bool) {
        this.f48121a = uk90Var;
        this.f48122b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof del0)) {
            return false;
        }
        del0 del0Var = (del0) obj;
        return wj50.m88271j(this.f48121a, del0Var.f48121a) && wj50.m88271j(this.f48122b, del0Var.f48122b);
    }

    public final int hashCode() {
        int iHashCode = this.f48121a.f231263a.hashCode() * 31;
        Boolean bool = this.f48122b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
