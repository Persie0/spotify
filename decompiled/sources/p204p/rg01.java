package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rg01 {

    /* JADX INFO: renamed from: a */
    public final up60 f198785a;

    /* JADX INFO: renamed from: b */
    public final Object f198786b;

    public rg01(up60 up60Var, Object obj) {
        this.f198785a = up60Var;
        this.f198786b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg01)) {
            return false;
        }
        rg01 rg01Var = (rg01) obj;
        return wj50.m88271j(this.f198785a, rg01Var.f198785a) && wj50.m88271j(this.f198786b, rg01Var.f198786b);
    }

    public final int hashCode() {
        int iHashCode = this.f198785a.hashCode() * 31;
        Object obj = this.f198786b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
