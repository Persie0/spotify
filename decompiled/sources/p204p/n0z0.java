package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n0z0 {

    /* JADX INFO: renamed from: a */
    public final int f149206a;

    /* JADX INFO: renamed from: b */
    public final b221 f149207b;

    /* JADX INFO: renamed from: c */
    public final String f149208c;

    /* JADX INFO: renamed from: d */
    public final String f149209d;

    /* JADX INFO: renamed from: e */
    public final String f149210e;

    /* JADX INFO: renamed from: f */
    public final String f149211f;

    /* JADX INFO: renamed from: g */
    public final String f149212g;

    public n0z0(int i, b221 b221Var, String str, String str2, String str3, String str4, String str5) {
        this.f149206a = i;
        this.f149207b = b221Var;
        this.f149208c = str;
        this.f149209d = str2;
        this.f149210e = str3;
        this.f149211f = str4;
        this.f149212g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0z0)) {
            return false;
        }
        n0z0 n0z0Var = (n0z0) obj;
        return this.f149206a == n0z0Var.f149206a && this.f149207b.equals(n0z0Var.f149207b) && wj50.m88271j(this.f149208c, n0z0Var.f149208c) && wj50.m88271j(this.f149209d, n0z0Var.f149209d) && this.f149210e.equals(n0z0Var.f149210e) && this.f149211f.equals(n0z0Var.f149211f) && wj50.m88271j(this.f149212g, n0z0Var.f149212g);
    }

    public final int hashCode() {
        return this.f149212g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((this.f149207b.hashCode() + (edb.m38547C(this.f149206a) * 31)) * 31, 31, this.f149208c), 31, this.f149209d), 31, this.f149210e), 31, this.f149211f);
    }
}
