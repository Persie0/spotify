package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lhq0 {

    /* JADX INFO: renamed from: a */
    public final String f133630a;

    /* JADX INFO: renamed from: b */
    public final int f133631b;

    /* JADX INFO: renamed from: c */
    public final boolean f133632c;

    public lhq0(String str, int i, boolean z) {
        this.f133630a = str;
        this.f133631b = i;
        this.f133632c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhq0)) {
            return false;
        }
        lhq0 lhq0Var = (lhq0) obj;
        return this.f133630a.equals(lhq0Var.f133630a) && this.f133631b == lhq0Var.f133631b && this.f133632c == lhq0Var.f133632c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133632c) + f710.m40938f(this.f133631b, this.f133630a.hashCode() * 31, 31);
    }
}
