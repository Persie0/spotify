package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e5n0 {

    /* JADX INFO: renamed from: a */
    public final String f56431a;

    /* JADX INFO: renamed from: b */
    public final xam f56432b;

    /* JADX INFO: renamed from: c */
    public final w4n0 f56433c;

    /* JADX INFO: renamed from: d */
    public final int f56434d;

    /* JADX INFO: renamed from: e */
    public final int f56435e;

    /* JADX INFO: renamed from: f */
    public final l5n0 f56436f;

    public e5n0(String str, xam xamVar, w4n0 w4n0Var, int i, int i2, l5n0 l5n0Var) {
        this.f56431a = str;
        this.f56432b = xamVar;
        this.f56433c = w4n0Var;
        this.f56434d = i;
        this.f56435e = i2;
        this.f56436f = l5n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5n0)) {
            return false;
        }
        e5n0 e5n0Var = (e5n0) obj;
        return this.f56431a.equals(e5n0Var.f56431a) && wj50.m88271j(this.f56432b, e5n0Var.f56432b) && this.f56433c.equals(e5n0Var.f56433c) && this.f56434d == e5n0Var.f56434d && this.f56435e == e5n0Var.f56435e && wj50.m88271j(this.f56436f, e5n0Var.f56436f);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f56435e, mt60.m62800g(this.f56434d, (this.f56433c.hashCode() + ((this.f56432b.hashCode() + (this.f56431a.hashCode() * 31)) * 31)) * 31, 31), 31);
        l5n0 l5n0Var = this.f56436f;
        return iM40938f + (l5n0Var == null ? 0 : l5n0Var.hashCode());
    }
}
