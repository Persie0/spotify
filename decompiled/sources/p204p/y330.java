package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y330 implements z330 {

    /* JADX INFO: renamed from: a */
    public final v330 f268744a;

    /* JADX INFO: renamed from: b */
    public final w330 f268745b;

    public y330(v330 v330Var, w330 w330Var) {
        this.f268744a = v330Var;
        this.f268745b = w330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y330)) {
            return false;
        }
        y330 y330Var = (y330) obj;
        return wj50.m88271j(this.f268744a, y330Var.f268744a) && wj50.m88271j(this.f268745b, y330Var.f268745b);
    }

    public final int hashCode() {
        int iHashCode = this.f268744a.hashCode() * 31;
        w330 w330Var = this.f268745b;
        return iHashCode + (w330Var == null ? 0 : w330Var.hashCode());
    }
}
