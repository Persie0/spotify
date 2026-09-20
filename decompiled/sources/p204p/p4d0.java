package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p4d0 {

    /* JADX INFO: renamed from: a */
    public final e4d0 f173900a;

    /* JADX INFO: renamed from: b */
    public final lk51 f173901b;

    public p4d0(e4d0 e4d0Var, lk51 lk51Var) {
        this.f173900a = e4d0Var;
        this.f173901b = lk51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4d0)) {
            return false;
        }
        p4d0 p4d0Var = (p4d0) obj;
        return wj50.m88271j(this.f173900a, p4d0Var.f173900a) && this.f173901b == p4d0Var.f173901b;
    }

    public final int hashCode() {
        int iHashCode = this.f173900a.hashCode() * 31;
        lk51 lk51Var = this.f173901b;
        return iHashCode + (lk51Var == null ? 0 : lk51Var.hashCode());
    }
}
