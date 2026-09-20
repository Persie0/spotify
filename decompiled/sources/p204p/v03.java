package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v03 {

    /* JADX INFO: renamed from: a */
    public final hz80 f235894a;

    /* JADX INFO: renamed from: b */
    public final w46 f235895b;

    public v03(hz80 hz80Var, w46 w46Var) {
        this.f235894a = hz80Var;
        this.f235895b = w46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return wj50.m88271j(this.f235894a, v03Var.f235894a) && wj50.m88271j(this.f235895b, v03Var.f235895b);
    }

    public final int hashCode() {
        int iHashCode = this.f235894a.hashCode() * 31;
        w46 w46Var = this.f235895b;
        return iHashCode + (w46Var == null ? 0 : w46Var.hashCode());
    }
}
