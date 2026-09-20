package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ys01 {

    /* JADX INFO: renamed from: a */
    public final ho01 f275630a;

    /* JADX INFO: renamed from: b */
    public final a611 f275631b;

    /* JADX INFO: renamed from: c */
    public final xr01 f275632c;

    public ys01(ho01 ho01Var, a611 a611Var, xr01 xr01Var) {
        this.f275630a = ho01Var;
        this.f275631b = a611Var;
        this.f275632c = xr01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys01)) {
            return false;
        }
        ys01 ys01Var = (ys01) obj;
        return wj50.m88271j(this.f275630a, ys01Var.f275630a) && wj50.m88271j(this.f275631b, ys01Var.f275631b) && wj50.m88271j(this.f275632c, ys01Var.f275632c);
    }

    public final int hashCode() {
        int iHashCode = (this.f275631b.hashCode() + (this.f275630a.hashCode() * 31)) * 31;
        xr01 xr01Var = this.f275632c;
        return iHashCode + (xr01Var == null ? 0 : xr01Var.f265192a.hashCode());
    }
}
