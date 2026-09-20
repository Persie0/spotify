package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fnx0 {

    /* JADX INFO: renamed from: a */
    public final gnx0 f71371a;

    /* JADX INFO: renamed from: b */
    public final gnx0 f71372b;

    /* JADX INFO: renamed from: c */
    public final Throwable f71373c;

    public /* synthetic */ fnx0(gnx0 gnx0Var, Throwable th, int i) {
        this(gnx0Var, (zti) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnx0)) {
            return false;
        }
        fnx0 fnx0Var = (fnx0) obj;
        return wj50.m88271j(this.f71371a, fnx0Var.f71371a) && wj50.m88271j(this.f71372b, fnx0Var.f71372b) && wj50.m88271j(this.f71373c, fnx0Var.f71373c);
    }

    public final int hashCode() {
        int iHashCode = this.f71371a.hashCode() * 31;
        gnx0 gnx0Var = this.f71372b;
        int iHashCode2 = (iHashCode + (gnx0Var == null ? 0 : gnx0Var.hashCode())) * 31;
        Throwable th = this.f71373c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f71371a + ", nextPlan=" + this.f71372b + ", throwable=" + this.f71373c + ')';
    }

    public fnx0(gnx0 gnx0Var, zti ztiVar, Throwable th) {
        this.f71371a = gnx0Var;
        this.f71372b = ztiVar;
        this.f71373c = th;
    }
}
