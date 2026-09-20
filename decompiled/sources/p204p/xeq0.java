package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xeq0 {

    /* JADX INFO: renamed from: a */
    public final String f260761a;

    /* JADX INFO: renamed from: b */
    public final int f260762b;

    public xeq0(String str, int i) {
        this.f260761a = str;
        this.f260762b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeq0)) {
            return false;
        }
        xeq0 xeq0Var = (xeq0) obj;
        return wj50.m88271j(this.f260761a, xeq0Var.f260761a) && this.f260762b == xeq0Var.f260762b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f260762b) + (this.f260761a.hashCode() * 31);
    }
}
