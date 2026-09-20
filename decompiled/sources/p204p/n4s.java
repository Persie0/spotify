package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n4s implements q4s {

    /* JADX INFO: renamed from: a */
    public final st91 f150412a;

    public n4s(st91 st91Var) {
        this.f150412a = st91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4s) && wj50.m88271j(this.f150412a, ((n4s) obj).f150412a);
    }

    public final int hashCode() {
        st91 st91Var = this.f150412a;
        if (st91Var == null) {
            return 0;
        }
        return st91Var.f213866a.hashCode();
    }
}
