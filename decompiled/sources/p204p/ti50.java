package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ti50 {

    /* JADX INFO: renamed from: a */
    public final ln40 f220553a;

    /* JADX INFO: renamed from: b */
    public final String f220554b;

    public ti50(ln40 ln40Var, String str) {
        this.f220553a = ln40Var;
        this.f220554b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti50)) {
            return false;
        }
        ti50 ti50Var = (ti50) obj;
        return wj50.m88271j(this.f220553a, ti50Var.f220553a) && wj50.m88271j(this.f220554b, ti50Var.f220554b);
    }

    public final int hashCode() {
        return this.f220554b.hashCode() + (this.f220553a.hashCode() * 31);
    }
}
