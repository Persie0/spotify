package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m4s implements q4s {

    /* JADX INFO: renamed from: a */
    public final st91 f140011a;

    public m4s(st91 st91Var) {
        this.f140011a = st91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4s) && wj50.m88271j(this.f140011a, ((m4s) obj).f140011a);
    }

    public final int hashCode() {
        st91 st91Var = this.f140011a;
        if (st91Var == null) {
            return 0;
        }
        return st91Var.f213866a.hashCode();
    }
}
