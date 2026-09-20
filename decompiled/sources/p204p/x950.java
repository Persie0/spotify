package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x950 {

    /* JADX INFO: renamed from: a */
    public final String f259278a;

    /* JADX INFO: renamed from: b */
    public final d850 f259279b;

    public x950(String str, d850 d850Var) {
        this.f259278a = str;
        this.f259279b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x950)) {
            return false;
        }
        x950 x950Var = (x950) obj;
        return wj50.m88271j(this.f259278a, x950Var.f259278a) && wj50.m88271j(this.f259279b, x950Var.f259279b);
    }

    public final int hashCode() {
        int iHashCode = this.f259278a.hashCode() * 31;
        d850 d850Var = this.f259279b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
