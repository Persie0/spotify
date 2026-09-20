package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yb30 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f271065a;

    /* JADX INFO: renamed from: b */
    public final st91 f271066b;

    public yb30(int i, String str, st91 st91Var) {
        str = (i & 2) != 0 ? null : str;
        st91Var = (i & 4) != 0 ? st91.f213865b : st91Var;
        this.f271065a = str;
        this.f271066b = st91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb30)) {
            return false;
        }
        yb30 yb30Var = (yb30) obj;
        return wj50.m88271j(this.f271065a, yb30Var.f271065a) && wj50.m88271j(this.f271066b, yb30Var.f271066b);
    }

    public final int hashCode() {
        String str = this.f271065a;
        return this.f271066b.f213866a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
