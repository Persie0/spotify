package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jj9 {

    /* JADX INFO: renamed from: a */
    public final boolean f112955a;

    /* JADX INFO: renamed from: b */
    public final ty80 f112956b;

    public jj9(ty80 ty80Var, boolean z) {
        this.f112955a = z;
        this.f112956b = ty80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj9)) {
            return false;
        }
        jj9 jj9Var = (jj9) obj;
        return this.f112955a == jj9Var.f112955a && wj50.m88271j(this.f112956b, jj9Var.f112956b);
    }

    public final int hashCode() {
        return this.f112956b.hashCode() + (Boolean.hashCode(this.f112955a) * 31);
    }
}
