package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f8c0 {

    /* JADX INFO: renamed from: a */
    public final String f66952a;

    /* JADX INFO: renamed from: b */
    public final x3c0 f66953b;

    /* JADX INFO: renamed from: c */
    public final w8c0 f66954c;

    public f8c0(String str, x3c0 x3c0Var, w8c0 w8c0Var) {
        this.f66952a = str;
        this.f66953b = x3c0Var;
        this.f66954c = w8c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8c0)) {
            return false;
        }
        f8c0 f8c0Var = (f8c0) obj;
        return wj50.m88271j(this.f66952a, f8c0Var.f66952a) && wj50.m88271j(this.f66953b, f8c0Var.f66953b) && wj50.m88271j(this.f66954c, f8c0Var.f66954c);
    }

    public final int hashCode() {
        int iHashCode = this.f66952a.hashCode() * 31;
        x3c0 x3c0Var = this.f66953b;
        int iM38547C = (iHashCode + (x3c0Var == null ? 0 : edb.m38547C(x3c0Var.f257733a))) * 31;
        w8c0 w8c0Var = this.f66954c;
        return iM38547C + (w8c0Var != null ? w8c0Var.hashCode() : 0);
    }
}
