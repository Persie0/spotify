package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ull0 {

    /* JADX INFO: renamed from: a */
    public final String f231583a;

    /* JADX INFO: renamed from: b */
    public final pll0 f231584b;

    /* JADX INFO: renamed from: c */
    public final boolean f231585c;

    public ull0(String str, pll0 pll0Var, boolean z) {
        this.f231583a = str;
        this.f231584b = pll0Var;
        this.f231585c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ull0)) {
            return false;
        }
        ull0 ull0Var = (ull0) obj;
        return wj50.m88271j(this.f231583a, ull0Var.f231583a) && wj50.m88271j(this.f231584b, ull0Var.f231584b) && this.f231585c == ull0Var.f231585c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231585c) + ((this.f231584b.hashCode() + (this.f231583a.hashCode() * 31)) * 31);
    }
}
