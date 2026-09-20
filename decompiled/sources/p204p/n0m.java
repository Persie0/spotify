package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n0m {

    /* JADX INFO: renamed from: a */
    public final c3e1 f149111a;

    /* JADX INFO: renamed from: b */
    public final int f149112b;

    /* JADX INFO: renamed from: c */
    public final int f149113c;

    public n0m(c3e1 c3e1Var, int i, int i2) {
        this.f149111a = c3e1Var;
        this.f149112b = i;
        this.f149113c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0m)) {
            return false;
        }
        n0m n0mVar = (n0m) obj;
        return wj50.m88271j(this.f149111a, n0mVar.f149111a) && this.f149112b == n0mVar.f149112b && this.f149113c == n0mVar.f149113c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f149113c) + mt60.m62800g(this.f149112b, this.f149111a.hashCode() * 31, 31);
    }
}
