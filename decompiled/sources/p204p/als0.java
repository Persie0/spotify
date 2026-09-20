package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class als0 {

    /* JADX INFO: renamed from: a */
    public final String f16976a;

    /* JADX INFO: renamed from: b */
    public final int f16977b;

    /* JADX INFO: renamed from: c */
    public final eh00 f16978c;

    public als0(String str, eh00 eh00Var, int i) {
        this.f16976a = str;
        this.f16977b = i;
        this.f16978c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof als0)) {
            return false;
        }
        als0 als0Var = (als0) obj;
        return wj50.m88271j(this.f16976a, als0Var.f16976a) && this.f16977b == als0Var.f16977b && wj50.m88271j(this.f16978c, als0Var.f16978c);
    }

    public final int hashCode() {
        return this.f16978c.hashCode() + mt60.m62800g(this.f16977b, this.f16976a.hashCode() * 31, 31);
    }
}
