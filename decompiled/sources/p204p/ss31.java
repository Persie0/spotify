package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ss31 {

    /* JADX INFO: renamed from: a */
    public final int f213475a;

    /* JADX INFO: renamed from: b */
    public final int f213476b;

    /* JADX INFO: renamed from: c */
    public final boolean f213477c;

    public ss31(int i, int i2, boolean z) {
        this.f213475a = i;
        this.f213476b = i2;
        this.f213477c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss31)) {
            return false;
        }
        ss31 ss31Var = (ss31) obj;
        return this.f213475a == ss31Var.f213475a && this.f213476b == ss31Var.f213476b && this.f213477c == ss31Var.f213477c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213477c) + f710.m40938f(this.f213476b, edb.m38547C(this.f213475a) * 31, 31);
    }
}
