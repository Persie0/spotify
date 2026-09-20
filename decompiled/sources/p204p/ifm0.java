package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ifm0 {

    /* JADX INFO: renamed from: a */
    public final bfm0 f101785a;

    /* JADX INFO: renamed from: b */
    public final st91 f101786b;

    /* JADX INFO: renamed from: c */
    public final b3j0 f101787c;

    public ifm0(bfm0 bfm0Var, st91 st91Var, b3j0 b3j0Var) {
        this.f101785a = bfm0Var;
        this.f101786b = st91Var;
        this.f101787c = b3j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifm0)) {
            return false;
        }
        ifm0 ifm0Var = (ifm0) obj;
        return wj50.m88271j(this.f101785a, ifm0Var.f101785a) && wj50.m88271j(this.f101786b, ifm0Var.f101786b) && wj50.m88271j(this.f101787c, ifm0Var.f101787c);
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(Integer.hashCode(this.f101785a.f26744a) * 31, 31, this.f101786b.f213866a);
        b3j0 b3j0Var = this.f101787c;
        return iM36604d + (b3j0Var == null ? 0 : b3j0Var.hashCode());
    }
}
