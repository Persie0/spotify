package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n3s implements o3s {

    /* JADX INFO: renamed from: a */
    public final st91 f150117a;

    public n3s(st91 st91Var) {
        this.f150117a = st91Var;
    }

    /* JADX INFO: renamed from: a */
    public final st91 m63644a() {
        return this.f150117a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3s) && wj50.m88271j(this.f150117a, ((n3s) obj).f150117a);
    }

    public final int hashCode() {
        st91 st91Var = this.f150117a;
        if (st91Var == null) {
            return 0;
        }
        return st91Var.f213866a.hashCode();
    }
}
